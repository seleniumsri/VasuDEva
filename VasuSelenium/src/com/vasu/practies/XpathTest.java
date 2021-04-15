package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.quikr.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("searchedCat")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li/a"));
		
		System.out.println(list.size());
		
		for (WebElement element : list)
		{
			System.out.println(element.getText());
		}


	}

}
