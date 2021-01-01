//JSONUtil.java
package com.nt.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {
	public static String convertJavaToJson(Object object) {
		ObjectMapper objectMapper = null;
		String retVal = null;
		objectMapper = new ObjectMapper();
		try {
			retVal = objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}

	public static <T> T convertJsonToJava(String jsonString, Class<T> target) {
		ObjectMapper objectMapper = null;
		T response = null;
		objectMapper = new ObjectMapper();
		try {
			response = objectMapper.readValue(jsonString, target);
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
	}
}