//JerseyUtil.java
package com.nt.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JerseyUtil {
	public static String javaObjToJSONConversion(Object object) {
		String jsonString = "{}";
		ObjectMapper objectMapper = null;
		// convert Object to JSON using ObjectMapper
		objectMapper = new ObjectMapper();
		try {
			jsonString = objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonString;
	}// method

	public static <T> T JSONToJavaObjectConversion(String JSONString, Class<T> clazz) {
		T response = null;
		ObjectMapper objectMapper = null;
		// read data in JSON and convert it into Object format
		objectMapper = new ObjectMapper();
		try {
			response = objectMapper.readValue(JSONString, clazz);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}//method
}// class
