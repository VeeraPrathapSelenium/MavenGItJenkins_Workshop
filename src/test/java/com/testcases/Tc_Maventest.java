package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_Maventest {
	
	@Test
	public static void launchBrowser()
	{
		
	WebDriver driver=new FirefoxDriver()	;
	
	driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	}
	

}
