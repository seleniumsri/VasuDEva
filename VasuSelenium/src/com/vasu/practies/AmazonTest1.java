package com.vasu.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://amazon.in");
		
		driver.manage().window().maximize();
		
		//capture the title of the window
		
		System.out.println(driver.getTitle());
		
		//capture the URL of the app
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
