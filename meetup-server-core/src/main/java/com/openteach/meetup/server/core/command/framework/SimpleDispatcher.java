/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.command.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 
 * @author sihai
 *
 */
@Service("dispatcher")
public class SimpleDispatcher implements Dispatcher {

	private List<Handler> globalBeforeHandlers = new ArrayList<Handler>();
	
	private Map<String, List<Handler>> handlerTable = new HashMap<String, List<Handler>>();
	
	private List<Handler> globalAfterHandlers = new ArrayList<Handler>();
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@PostConstruct
	public void initialize() {
		Map<String, Handler> beanMap = applicationContext.getBeansOfType(Handler.class);
		Class clazz = null;
		Before before = null;
		After after = null;
		Handle handle = null;
		for(Handler handler : beanMap.values()) {
			clazz = handler.getClass();
			before = (Before)clazz.getAnnotation(Before.class);
			after = (After)clazz.getAnnotation(After.class);
			handle = (Handle)clazz.getAnnotation(Handle.class);
			if((null != before && null != after && null != handle) ||
					(null != before && null != after) || (null != before && null != handle) ||
					(null != after && null != handle)) {
				throw new RuntimeException("Only one in (before, after, handle) supported");
			}
			if(null != before) {
				// FIXME
				((AbstractHandler)handler).setIndex(before.index());
				globalBeforeHandlers.add(handler);
			}
			if(null != after) {
				// FIXME
				((AbstractHandler)handler).setIndex(after.index());
				globalAfterHandlers.add(handler);
			}
			if(null != handle) {
				// FIXME
				((AbstractHandler)handler).setIndex(handle.index());
				List<Handler> hl = handlerTable.get(handle.value());
				if(null == hl) {
					hl = new ArrayList<Handler>();
					handlerTable.put(handle.value(), hl);
				}
				hl.add(handler);
			}
		}
		
		// 排序
		Comparator<Handler> comparator = new Comparator<Handler>() {

			@Override
			public int compare(Handler o1, Handler o2) {
				return ((AbstractHandler)o1).getIndex() - ((AbstractHandler)o2).getIndex();
			}
		};
		Collections.sort(globalBeforeHandlers, comparator);
		Collections.sort(globalAfterHandlers, comparator);
		for(List<Handler> hl : handlerTable.values()) {
			Collections.sort(hl, comparator);
		}
	}
	
	@Override
	public Result dispatch(Command command) throws UnsupportedCommandException {
		Result result = new Result();
		ExecutionController controller = new ExecutionController();
		try {
			for(Handler handler : globalBeforeHandlers) {
				handler.handle(command, result, controller);
			}
			List<Handler> handlers = handlerTable.get(command.getCommand());
			if(null == handlers) {
				throw new UnsupportedCommandException(command.getCommand());
			}
			
			// aborted
			if(controller.isAborted()) {
				return result;
			}
			
			for(Handler handler : handlers) {
				handler.handle(command, result, controller);
				if(controller.isAborted()) {
					break;
				}
			}
		} finally {
			for(Handler handler : globalAfterHandlers) {
				handler.handle(command, result, controller);
			}
		}
		return result;
	}
	
	public void setGlobalBeforeHandlers(List<Handler> globalBeforeHandlers) {
		this.globalBeforeHandlers = globalBeforeHandlers;
	}

	public void setHandlerTable(Map<String, List<Handler>> handlerTable) {
		this.handlerTable = handlerTable;
	}

	public void setGlobalAfterHandlers(List<Handler> globalAfterHandlers) {
		this.globalAfterHandlers = globalAfterHandlers;
	}
}
