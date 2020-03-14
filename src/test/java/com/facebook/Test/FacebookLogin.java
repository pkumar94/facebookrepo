package com.facebook.Test;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.facebook.Flows.Login_Flow;
import com.facebook.Reporting.Report_Setup;
import com.facebook.Utilities.Common_Functions;
import com.facebook.Utilities.Driver_Setup;
import com.facebook.Utilities.WrapperMethods;


public class FacebookLogin
{
	public WebDriver driver;
	WrapperMethods method = new WrapperMethods();
	@Parameters({"browserType", "appURL", "tcID"})
	@Test
	public  void Login(String browserType,String appURL,String TestCase_ID) throws Throwable
	{
		try {
			Common_Functions commonFunctions = new Common_Functions();
			Login_Flow  login_flow= new Login_Flow ();

			Driver_Setup n= new Driver_Setup();
			Report_Setup.InitializeReport(TestCase_ID);
			driver = n.initializeTestBaseSetup(browserType, appURL, TestCase_ID);

			commonFunctions.startRecording();
			login_flow.logindetails(driver, TestCase_ID);

			Report_Setup.extent.endTest(Report_Setup.test);
			Report_Setup.extent.flush();
			commonFunctions.stopRecording();
		} catch (Exception e) {
			Common_Functions commonFunctions = new Common_Functions();
			commonFunctions.stopRecording();
			Report_Setup.extent.endTest(Report_Setup.test);
			Report_Setup.extent.flush();//
			//driver.close();
			System.out.println("Login failed of test");
		}
	}


}
