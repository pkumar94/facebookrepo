package com.facebook.Flows;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.facebook.Locators.Login_Loactors;
import com.facebook.Reporting.Extent_Reporting;
import com.facebook.Utilities.Excel_Handling;
import com.facebook.Utilities.WrapperMethods;

public class Login_Flow 
{
	WebDriver driver;
	WrapperMethods method= new WrapperMethods();
	//Login_Loactors locators= new Login_Loactors();

	public void logindetails(WebDriver driver,String TC_ID) throws Throwable
	{
		method.enterText(driver, Login_Loactors.firstname, Excel_Handling.Get_Data(TC_ID, "firstname"), "entered first name");
		Extent_Reporting.Log_Pass_with_Screenshot("Login", "entered username", driver);
		method.enterText(driver, Login_Loactors.surname, Excel_Handling.Get_Data(TC_ID, "SurName"), "entered first name");
		System.out.println("surname form excel"+Excel_Handling.Get_Data(TC_ID, "SurName"));
		Extent_Reporting.Log_Pass_with_Screenshot("Login", "entered surname", driver);
		method.enterText(driver, Login_Loactors.mobileno, Excel_Handling.Get_Data(TC_ID, "MobileNo"), "entered first name");
		Extent_Reporting.Log_Pass_with_Screenshot("Login", "entered mobileno", driver);
			
	}
	public void loginde(WebDriver driver,String TC_ID) throws Throwable
	{
		method.enterText(driver, Login_Loactors.firstname, Excel_Handling.Get_Data(TC_ID, "firstname"), "entered first name");
		Extent_Reporting.Log_Pass_with_Screenshot("Login", "entered username", driver);
		method.enterText(driver, Login_Loactors.surname, Excel_Handling.Get_Data(TC_ID, "SurName"), "entered first name");
		System.out.println("surname form excel"+Excel_Handling.Get_Data(TC_ID, "SurName"));
		Extent_Reporting.Log_Pass_with_Screenshot("Login", "entered surname", driver);
		method.enterText(driver, Login_Loactors.mobileno, Excel_Handling.Get_Data(TC_ID, "MobileNo"), "entered first name");
		Extent_Reporting.Log_Pass_with_Screenshot("Login", "entered mobileno", driver);
			
	}

}
