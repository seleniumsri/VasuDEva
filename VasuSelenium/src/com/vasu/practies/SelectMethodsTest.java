package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Music");
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		//Select sl=new Select(drop);
		
		
		//Select sl=new Select(driver.findElement(By.id("searchDropdownBox")));
		//sl.selectByIndex(25);
		//sl.selectByVisibleText("Baby");
		
		//sl.selectByValue("search-alias=beauty");
		
		/*List<WebElement> dropList=sl.getOptions();
		
		System.out.println(dropList.size());
		
		for (WebElement element : dropList) 
		{
			System.out.println(element.getText());
		}*/
		
		//sl.selectByIndex(25);
		
		//System.out.println(sl.getFirstSelectedOption().getText());
		
		//System.out.println(sl.isMultiple());//true / false
		
		//sl.selectByIndex(25);
		
		//sl.selectByIndex(26);
		
		/*List<WebElement> slitems=sl.getAllSelectedOptions();
		
		System.out.println(slitems.size());
		
		for (WebElement element : slitems) 
		{
			System.out.println(element.getText());
		}*/

		
	}

}
