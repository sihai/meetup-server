/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author sihai
 *
 */
public class DateUtil
{
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	
	public static String format(Date date)
	{
		return format(date, null);
	}
	
	public static String format(Date date, String format)
	{
		if(date == null)
		{
			return "";
		}
		
		String tmpFormat = DEFAULT_DATE_FORMAT;
		
		if(null != format)
		{
			tmpFormat = format;
		}
		
		SimpleDateFormat sf = new SimpleDateFormat(tmpFormat);
		
		return sf.format(date);
	}
	
	public static Date parse(String str) throws ParseException
	{
		return parse(str, DEFAULT_DATE_FORMAT);
	}
	
	public static Date parse(String str, String format) throws ParseException
	{
		SimpleDateFormat parser = new SimpleDateFormat(format);
		parser.setTimeZone(TimeZone.getDefault());
		return parser.parse(str);
	}
	
	public static Date getToday() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	public static Date getTomorrow() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
}