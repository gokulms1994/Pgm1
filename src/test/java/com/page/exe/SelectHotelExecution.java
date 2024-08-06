package com.page.exe;

import com.app.base.BaseClass;
import com.page.object.HotelBookingLocators;

public class SelectHotelExecution extends SearchHotelExecution{
	public static void firstName() {
		BaseClass.input(new HotelBookingLocators().getFirst_name(),BaseClass.excelRead(7,0));
	}
	public static void lastName() {
		BaseClass.input(new HotelBookingLocators().getLast_name(),BaseClass.excelRead(8,0));
	}
	public static void address() {
		BaseClass.input(new HotelBookingLocators().getAddress(),BaseClass.excelRead(9,0));
	}
	public static void ccnum() {
		BaseClass.input(new HotelBookingLocators().getCc_num(),BaseClass.excelRead(10,0));
	}
	public static void cctype() {
		BaseClass.byVisibleText(new HotelBookingLocators().getCc_type(),BaseClass.excelRead(11,0));
	}
	public static void ccexpmon() {
		BaseClass.byVisibleText(new HotelBookingLocators().getCc_exp_month(),BaseClass.excelRead(12,0));
	}
	public static void ccexpyear() {
		BaseClass.byVisibleText(new HotelBookingLocators().getCc_exp_year(),BaseClass.excelRead(13,0));
	}
	public static void cccvv() {
		BaseClass.input(new HotelBookingLocators().getCc_cvv(),BaseClass.excelRead(14,0));
	}
	public static void booknow() {
		BaseClass.click(new HotelBookingLocators().getBook_now());
	}
	
	public static String orderno() throws InterruptedException {
		Thread.sleep(10000);
		String a =BaseClass.getAttr(new HotelBookingLocators().getOrder_no(), "value");
	return a;
	}

}
