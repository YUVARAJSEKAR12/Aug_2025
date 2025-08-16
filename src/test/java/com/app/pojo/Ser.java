package com.app.pojo;

import com.google.gson.Gson;

public class Ser {
	
	public static void main(String[] args) {
		Address address = new Address("Chennai", "TamilNadu");
		Employee employee = new Employee("Yuvaraj", "Principal Software Enguneer", address);
		
		Gson gson = new Gson();
		String json = gson.toJson(employee);
		System.out.println(json);
		
		
	}

}
