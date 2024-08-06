package com.page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelLocators extends HotelSearchLocators {
	public SelectHotelLocators() {
		PageFactory.initElements(dr, this);
	}
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement contin;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	public WebElement getContin() {
		return contin;
	}

}
