package com.app.pojo;

public class Employee {
	
	private String name;
	private String role;
	private Address address;
	
	public Employee(String name, String role, Address address) {
		this.name = name;
		this.role = role;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
