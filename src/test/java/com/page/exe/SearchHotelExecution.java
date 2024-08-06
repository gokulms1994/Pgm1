package com.page.exe;

import com.app.base.BaseClass;
import com.page.object.SelectHotelLocators;

public class SearchHotelExecution extends HotelSearchExecution {
	public static void radioButton() {
		BaseClass.click(new SelectHotelLocators().getRadiobutton());
		
	}
	public static void con() {
		BaseClass.click(new SelectHotelLocators().getContin());
		
	}

}
