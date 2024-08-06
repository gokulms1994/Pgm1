package com.page.exe;

import com.app.base.BaseClass;
import com.page.object.HotelSearchLocators;

public class HotelSearchExecution extends LoginPageLocation {
	public static void location() {
		BaseClass.byVisibleText(new HotelSearchLocators().getLocation(), BaseClass.excelRead(0,0));
	}
	public static void hotels() {
		BaseClass.byVisibleText( new HotelSearchLocators().getHotels(),BaseClass.excelRead(1,0));
	}
	public static void roomtype() {
		BaseClass.byVisibleText( new HotelSearchLocators().getRoomType(),BaseClass.excelRead(2,0));
	}
	public static void roomNos() {
		BaseClass.byVisibleText( new HotelSearchLocators().getRoomnos(),BaseClass.excelRead(3,0));
	}
	public static void dateIn() {
		BaseClass.clear(new HotelSearchLocators().getDatepick_in());
		BaseClass.input( new HotelSearchLocators().getDatepick_in(),BaseClass.excelRead(4,0));
	}
	public static void dateOut() {
		BaseClass.clear(new HotelSearchLocators().getDatepick_out());
		BaseClass.input( new HotelSearchLocators().getDatepick_out(),BaseClass.excelRead(5,0));
	}
	public static void adultRoom() {
		BaseClass.byVisibleText( new HotelSearchLocators().getAdult_room(),BaseClass.excelRead(6,0));
	}
	
	public static void sub() {
		BaseClass.click( new HotelSearchLocators().getSubmit());
	}

}
