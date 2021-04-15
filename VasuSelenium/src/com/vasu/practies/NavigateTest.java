package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://Google.co.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		

	}

}
