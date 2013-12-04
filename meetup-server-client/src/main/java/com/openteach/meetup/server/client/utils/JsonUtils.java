/**
 * galaxy inc.
 * meetup client for android
 */
package com.openteach.meetup.server.client.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;

/**
 * 
 * @author sihai
 *
 */
public class JsonUtils {

	/**
	 * 
	 */
	private static Gson gson;
	
	private static Gson gson2;
	
	static {
		DateAdapter dateAdapter = new DateAdapter();
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Date.class, dateAdapter);
        gson = builder.create();
        MyExclusionStrategy strategy = new MyExclusionStrategy(null, Collections.EMPTY_LIST);
        GsonBuilder builder2 = new GsonBuilder().addSerializationExclusionStrategy(strategy);
        builder2.registerTypeAdapter(Date.class, dateAdapter);
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
	public static <T> T toBean(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString, clazz);
	}
	
	/**
	 * 
	 * @param json
	 * @return
	 */
	public static <T> T toBean(JsonElement json, Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}
	
	/**
	 * 
	 * @param buffer
	 * @return
	 */
	public static JsonObject toJson(byte[] buffer) {
		try {
			return gson.toJsonTree(new String(buffer, StringUtils.DEFAULT_ENCODE)).getAsJsonObject();
		} catch (UnsupportedEncodingException e) {
			// FIXME
			return null;
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static JsonElement toJson(Object obj) {
		return gson.toJsonTree(obj);
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
	public static <T> T fromByteArray(byte[] buffer, Class<T> clazz) {
		return toBean(new String(buffer), clazz);
	}
	
	/**
	 * 
	 * @param buffer
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> fromByteArrayList(byte[] buffer, Class<T> clazz) {
		String jsonString = new String(buffer);
		return gson.fromJson(jsonString, new TypeToken<ArrayList<T>>() {}.getType());  
	}
	
	/**
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> fromByteArrayList(JsonElement json, Class<T> clazz) {
		return gson.fromJson(json, new TypeToken<ArrayList<T>>() {}.getType());  
	}
	
	/**
	 * 
	 * @param json
	 * @param type
	 * @return
	 */
	public static <T> List<T> fromByteArrayList(JsonElement json, Type type) {
		return gson.fromJson(json, type);  
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
	
	public static class DateAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

		@Override
		public JsonElement serialize(Date date, Type type, JsonSerializationContext context) {
			return new JsonPrimitive(DateUtils.format(date));
		}

		@Override
		public Date deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
			try {
				return DateUtils.parse(element.getAsString());
			} catch (ParseException e) {
				// TODO
			}
			return null;
		}
	}
	
	
}
