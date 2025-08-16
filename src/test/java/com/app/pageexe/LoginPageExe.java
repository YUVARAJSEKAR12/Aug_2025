package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.pageobject.LoginPageLoctor;

public class LoginPageExe extends LoginPageLoctor {

	public static void username() {
		BaseClass.inputText(LoginPageLoctor.getusername(), "");//need to pass from properties file
	}

	public static void password() {
		BaseClass.inputText(LoginPageLoctor.getpassword(), "");//need to pass from properties file
	}

	public static void loginbutton() {
		BaseClass.click_button(LoginPageLoctor.getloginbutton());
	}
}
