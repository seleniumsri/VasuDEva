package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyText 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/advanced_search");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("xX4UFf")).sendKeys("Selenium Training");
		//select text
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		//copy text
		
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		
		//paste text
		
		driver.findElement(By.id("t2dX1c")).sendKeys(Keys.CONTROL+"v");
		
		
		

	}

}
