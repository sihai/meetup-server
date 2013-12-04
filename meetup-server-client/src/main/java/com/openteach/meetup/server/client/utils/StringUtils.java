package com.openteach.meetup.server.client.utils;

import java.util.Random;
import java.util.regex.Pattern;

/**
 * 
 * @author sihai
 *
 */
public abstract class StringUtils {

	public static final String DEFAULT_ENCODE = "utf-8";
	
	/**
	 * 
	 */
	public static final Pattern MOBILE_PATTERN = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
	
	/**
	 * 
	 */
	public static final Pattern EMAIL_PATTERN = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
	
	
	private static final Random randGen = new Random();
    private static final char sNumbersAndLetters[] = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    
    /**
     * 
     * @param s
     * @return
     */
	public static char firstLetter(String s) {

		char c = ' ';
		if (null == s || 0 == s.length())
			return c;
		char c1 = s.charAt(0);
		if (Character.isLetter(c1))
			c = Character.toUpperCase(c1);
		return c;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static final String trim(String str) {
		if(null == str) {
			return str;
		}
		return str.trim();
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static final boolean isBlank(String str) {
		if(null == str) {
			return true;
		}
		return str.trim().length() == 0;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static final boolean isNotBlank(String str) {
		return !isBlank(str);
	}
	
	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean equals(String str1, String str2) {
		if(null == str1 || null == str2) {
			return false;
		}
		return str1.equals(str2);
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		return EMAIL_PATTERN.matcher(str).matches();
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str) {
		return MOBILE_PATTERN.matcher(str).matches();
	}
	
	public static String randomString(int i) {
        char ac[] = new char[32];
        for(int j = 0; j < ac.length; j++)
            ac[j] = sNumbersAndLetters[randGen.nextInt(71)];

        return new String(ac);
    }
	
	/**
	 * 二进制转字符串
	 * @param b
	 * @return
	 */
	public static final String byte2Hex(byte[] b) {
		StringBuilder hs = new StringBuilder();
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs.append("0").append(stmp);
			} else {
				hs.append(stmp);
			}
		}
		return hs.toString().toUpperCase();
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String getDomain(String s) {
        String as[] = s.split("@");
        String s1;
        if(as.length != 2)
            s1 = null;
        else
            s1 = as[1];
        return s1;
    }
}
