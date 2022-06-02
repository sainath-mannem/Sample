package com.sainath.java.examples.generics;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {

	public static Employee json(String json) throws JsonMappingException, JsonProcessingException {
		

		// ObjectMapper instantiation
		ObjectMapper objectMapper = new ObjectMapper();

		// Deserialization into the `Employee` class
		return objectMapper.readValue(json, Employee.class);

		// Print information
	}
	
	public static <T> T json2(String json, Class<T> t) throws JsonMappingException, JsonProcessingException {
		

		// ObjectMapper instantiation
		ObjectMapper objectMapper = new ObjectMapper();

		// Deserialization into the `Employee` class
		return objectMapper.readValue(json, t);

		// Print information
	}
	
	public static <T> String toJson(T t) throws JsonMappingException, JsonProcessingException {
		

		// ObjectMapper instantiation
		ObjectMapper objectMapper = new ObjectMapper();

		// Deserialization into the `Employee` class
		return objectMapper.writeValueAsString(t);

		// Print information
	}
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String json = "{ \"name\":\"David\", \"position\":\"SOFTWARE_ENGINEER\", \"skilltree\":[ \"Java\", \"Python\", \"JavaScript\" ], \"address\":{ \"street\":\"Street\", \"streetNo\":\"123\" } }";
		Employee json2 = json2(json, Employee.class);
		System.out.println(json2);
		System.out.println(toJson(json2));
	}
}
