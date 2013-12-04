/**
 * 
 */
package com.openteach.meetup.server.util;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author sihai
 *
 */
public class LaogeDelayedExecutor {

	private  final   Log logger=LogFactory.getLog(getClass());

	public int DEFAULT_THREAD_COUNT = 2;
	
	/**
	 * 
	 */
	private int threadCount = DEFAULT_THREAD_COUNT;

	/**
	 * 
	 */
	private DelayQueue<LaogeDelayedTask> taskQueue;
	
	/**
	 * 
	 */
	private ExecutorService executorService;
	
	/**
	 * 
	 */
	public void initialize() {
		taskQueue = new DelayQueue<LaogeDelayedExecutor.LaogeDelayedTask>();
		executorService = Executors.newFixedThreadPool(threadCount);
		for(int i = 0; i < threadCount; i++) {
			executorService.execute(new Runnable() {

				@Override
				public void run() {
					while(!Thread.currentThread().isInterrupted()) {
						try {
							LaogeDelayedTask task = taskQueue.take();
							task.run();
						} catch (InterruptedException e) {
							logger.error(e.getMessage(), e);
							Thread.currentThread().interrupt();
						} catch (Throwable t) {
							logger.error(t.getMessage(), t);
						}
					}
				}
				
			});
		}
	}
	
	/**
	 * 请修改该方法，添加你的业务，修改参数，new 
	 */
	public void delay() {
		// 10s
		System.out.println("wwww");
		taskQueue.put(new LaogeDelayedTask(10 * 1000));
	}
	
	/**
	 * 
	 */
	public void shutdown() {
		if(null != executorService) {
			executorService.shutdown();
		}
		if(null != taskQueue) {
			taskQueue.clear();
		}
	}
	
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	
	/**
	 * 可以扩展LaogeTask加入更多的业务参数
	 * @author david
	 *
	 */
	private class LaogeDelayedTask implements Runnable, Delayed {

		/**
		 * 创建时间
		 */
		private long createTime;
		
		/**
		 * delayed 时间 ms
		 */
		private long delayed;
		
		/**
		 * 
		 * @param executeTime
		 */
		public LaogeDelayedTask(long delayed) {
			this.createTime = System.currentTimeMillis();
			this.delayed = delayed;
		}
		
		@Override
		public void run() {
		  System.out.println("Haha");
		}

		@Override
		public int compareTo(Delayed delayed) {
			if (delayed == this) {
				return 0;
			}
			long d = ( getDelay( TimeUnit.MILLISECONDS ) - delayed.getDelay( TimeUnit.MILLISECONDS ) );
			return ( ( d == 0 ) ? 0 : ( ( d < 0 ) ? -1 : 1 ) );
		}

		@Override
		public long getDelay(TimeUnit unit) {
			return unit.convert( delayed - ( System.currentTimeMillis() - createTime ), TimeUnit.MILLISECONDS );
		}
	}
	
	//===================================================================
	//						Test
	//===================================================================
	public static void main(String[] args) {
		LaogeDelayedExecutor delayedExecutor = new LaogeDelayedExecutor();
		delayedExecutor.initialize();
		delayedExecutor.delay();
		
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}
}
