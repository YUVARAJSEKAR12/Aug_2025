package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
// pull the code

	
	//testone 

	public static WebDriver driver = null;

	public static void inputText(WebElement element, String data) {

		try {
			element.sendKeys(data);
		} catch (Exception e) {
			throw new RuntimeException("Unable to send the data");
		}
	}

	public static void click_button(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			throw new RuntimeException("Unable to click the element");
		}
	}
	
	public static void selectbyValue_method(WebElement element,String data) {
		try {
		Select s = new Select(element);
		s.selectByValue(data);
		} catch (Exception e) {
			throw new RuntimeException("Unable to Select the data");
		}
	}
	
	
	public static void selectbyValue_methodone(WebElement element,String data) {
		try {
		Select s = new Select(element);
		s.selectByValue(data);
		} catch (Exception e) {
			throw new RuntimeException("Unable to Select the data");
		}
	}

}
