package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksTest
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
			
		List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(headerLinks.size());
		
		for (WebElement element : headerLinks) 
		{
			System.out.println(element.getText());
		}
		

	}

}
