package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v136.systeminfo.SystemInfo;

import com.app.base.BaseClass;
import com.app.pageexe.LoginPageExe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginpageSteps extends LoginPageExe {
	
	@Given("Launch the URL {string}")
	public void launch_the_url(String url) {
	    System.out.println(url);
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	   System.out.println(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	   System.out.println(pass);
	}
	@When("Click the login button")
	public void click_the_login_button() {
	   System.out.println("login button");
	}
	@Then("Validate the Homepage")
	public void validate_the_homepage() {
	    System.out.println("login to the hompage");
	}
	
	@When("Enter the user {string}")
	public void enter_the_user(String user) {
	   System.out.println(user);
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String pass) {
	   System.out.println(pass);
	}
	
	@Given("Login into the Application")
	public void login_into_the_application() {
	    username();
	    password();
	    loginbutton();
	}
	@When("Selec the location {string}")
	public void selec_the_location(String string) {
	   BaseClass.selectbyValue_method(driver.findElement(By.id("location")), "Sydney");
	}

	@When("Enter the input datas for the practise form")
	public void enter_the_input_datas_for_the_practise_form(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String firstname = asList.get(0);
		System.out.println(firstname);
		
	    
	}
	
	@When("Enter the input datas for the practise form for map")
	public void enter_the_input_datas_for_the_practise_form_for_map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		String firstname= asMap.get("Lastname");
		System.out.println(firstname);
		
		
	    
	}



}
