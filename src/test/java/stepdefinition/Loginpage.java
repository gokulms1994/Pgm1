package stepdefinition;

import com.page.exe.HotelSearchExecution;
import com.page.exe.SelectHotelExecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage  extends SelectHotelExecution{
	@Given("Browser open")
	public void browser_open() {
		openBrowser("url");
	    
	}
	
	@When("Enter the username")
	public void enter_the_username() {
		username();
		
	    
	}
	@When("Enter the password")
	public void enter_the_password() {
		password();
	   
	}
	@When("Click the login button")
	public void click_the_login_button() {
		login();
	   
	}
	
	@When("Select the location")
	public void select_the_location() {
		location();
	    
	}
	@When("Select the hotel")
	public void select_the_hotel() {
		hotels();
	    
	}
	@When("Select roomtype")
	public void select_roomtype() {
		roomtype();
	   
	}
	@When("Select roomnos")
	public void select_roomnos() {
		roomNos();
	   
	}
	@When("Enter datein")
	public void enter_datein() {
		dateIn();
	   
	}
	@When("Enter dateout")
	public void enter_dateout() {
		dateOut();
	  
	}
	@When("Select adultroom")
	public void select_adultroom() {
		adultRoom();
	   
	}
	
	@Then("click submit")
	public void click_submit() {
		sub();
	    
	}
	@When("click radiobutton")
	public void click_radiobutton() {
		radioButton();
	    
	}
	@Then("click continue")
	public void click_continue() {
		con();
	   
	}
	@When("Enter first name")
	public void enter_first_name() {
		firstName() ;
	    
	}
	@When("Enter last name")
	public void enter_last_name() {
		lastName();
	    
	}
	@When("Enter address")
	public void enter_address() {
		address();
	   
	}
	@When("Enter creditcard num")
	public void enter_creditcard_num() {
		ccnum();
	  
	}
	@When("Select creditcard type")
	public void select_creditcard_type() {
		cctype();
	    
	}
	
	@When("Select creditcard empmon")
	public void select_creditcard_empmon() {
		ccexpmon();
	   
	}
	@When("Select creditcard expyear")
	public void select_creditcard_expyear() {
		ccexpyear();
	   
	}
	@When("Enter cccvv")
	public void enter_cccvv() {
		cccvv();
	    
	}
	@When("click booknow")
	public void click_booknow() {
		 booknow() ;
	   
	}
	@Then("get the orderno")
	public void get_the_orderno() throws InterruptedException {
		 System.out.println(orderno());
	  
	}










}
