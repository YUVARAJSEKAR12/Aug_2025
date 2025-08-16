package com.app.pojo;

import com.google.gson.Gson;

public class DeSer {
	
	public static void main(String[] args) {
		String json = "{\r\n"
				+ "	\"employee\": {\r\n"
				+ "		\"name\": \"Yuvaraj\",\r\n"
				+ "		\"role\": \"principal software engineer\",\r\n"
				+ "		\"address\": {\r\n"
				+ "			\"city\": \"chennai\",\r\n"
				+ "			\"state\": \"tamilnadu\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}";
		
		
		Gson gson = new Gson();
		Employee employee = gson.fromJson(json, Employee.class);
		System.out.println(employee.getName());
		System.out.println(employee.getRole());
	}

}
