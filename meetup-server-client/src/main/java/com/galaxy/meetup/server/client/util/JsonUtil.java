/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author sihai
 *
 */
public class JsonUtil {

	/**
	 * 
	 */
	private static Gson gson;
	
	private static Gson gson2;
	
	static {
		GsonBuilder builder = new GsonBuilder();
        gson = builder.create();
        MyExclusionStrategy strategy = new MyExclusionStrategy(null, GenericJson.getFiledNameList());
        GsonBuilder builder2 = new GsonBuilder().addSerializationExclusionStrategy(strategy);
        gson2 = builder2.create();
	}
	
	/**
	 * 
	 * @return
	 */
	public static String toJsonString(Object target) {
		return gson.toJson(target);
	}
	
	/**
	 * 
	 * @return
	 */
	public static String toJsonStringExcluseFieldsOfGenericJson(Object target) {
		return gson2.toJson(target);
	}
	
	/**
	 * 
	 * @param target
	 * @return
	 */
	public static byte[] toByteArray(Object target) {
		return toJsonString(target).getBytes();
	}
	
	/**
	 * 
	 * @param jsonString
	 * @return
	 */
	public static Object toBean(String jsonString, Class clazz) {
		return gson.fromJson(jsonString, clazz);
	}
	
	/**
	 * 
	 * @param inputstream
	 * @return
	 * @throws IOException
	 */
	public static Object fromInputStream(InputStream inputstream, Class clazz) throws IOException {
		return toBean(toString(inputstream), clazz);
	}
	
	/**
	 * 
	 * @param buffer
	 * @return
	 */
	public static Object fromByteArray(byte[] buffer, Class clazz) {
		return toBean(new String(buffer), clazz);
	}
	
	/**
	 * 
	 * @param inputstream
	 * @return
	 * @throws IOException
	 */
	public static String toString(InputStream inputstream) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputstream));
		while(null != (line = reader.readLine())) {
			sb.append(line);
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @author sihai
	 *
	 */
	public static class MyExclusionStrategy implements ExclusionStrategy {  
		  
	    private final List<Class<?>> types2Skip;
	    
	    private List<String> fileds2Skip;
	      
	    public MyExclusionStrategy(List<Class<?>> types2Skip, List<String> fileds2Skip) {  
	    	this.types2Skip = types2Skip;
	        this.fileds2Skip = fileds2Skip;
	    }  
	    
	    public boolean shouldSkipClass(Class<?> clazz) {  
	    	return null != this.types2Skip && types2Skip.contains(clazz);  
	    }  
	  
	    public boolean shouldSkipField(FieldAttributes f) {
	    	String fieldName = f.getName();
	        return null != fileds2Skip && fileds2Skip.contains(fieldName);
	    }  
	  
	}  
}
