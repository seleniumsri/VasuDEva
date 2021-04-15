package com.vasu.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLogin 
{

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://PrimusBank.qedgetech.com");
		
		driver.manage().window().maximize();
	}
}
