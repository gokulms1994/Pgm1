package com.page.exe;

import com.app.base.BaseClass;
import com.page.object.HotelBookingLocators;
import com.page.object.LoginPageLocators;

public class LoginPageLocation extends HotelBookingLocators {
	public static void username() {
		BaseClass.input( new LoginPageLocators().getUsername(), propertyRead("username"));
		//input (WebElement a,String b)
	}
	
	public static void password() {
		BaseClass.input( new LoginPageLocators().getPassword(), BaseClass.propertyRead("password"));
	}
	public static void login() {
		BaseClass.click(new LoginPageLocators().getLogin());
	}

}
