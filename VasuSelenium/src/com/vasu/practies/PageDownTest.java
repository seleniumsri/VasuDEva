package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/advanced_search");
		
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("//*[@id='s1zaZb']/div[5]/div[9]/div[2]/input[2]")).click();
		
	}

}
