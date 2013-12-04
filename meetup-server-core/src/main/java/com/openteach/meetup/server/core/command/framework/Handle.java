/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.core.command.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author sihai
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Handle {
	
	/**
	 * Return the command the handler handle
	 * @return
	 */
	String value();
	
	/**
	 * 
	 * @return
	 */
	int index() default Integer.MAX_VALUE;
}
