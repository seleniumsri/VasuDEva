package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimusBank 
{
	ChromeDriver driver;
	
	@BeforeSuite
	public void appLaunch()
	{
		//appLaunch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("Http://PrimusBank.qedgetech.com");
		
		driver.manage().window().maximize();
		
		
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
	}
	
	@BeforeTest
	public void appLogin()
	{
		//appLogin
driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void appLogout()
	{
		//appLogout
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}

	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
}
