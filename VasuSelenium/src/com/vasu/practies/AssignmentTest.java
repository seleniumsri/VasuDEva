package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.shadi.com/");
		
		driver.manage().window().maximize();
		
		//Month
		
		Select month=new Select(driver.findElement(By.id("dob_m")));
		
		month.selectByVisibleText("Mar");
		
		//day
		
		Select day=new Select(driver.findElement(By.id("dob_d")));
		
		day.selectByIndex(5);
		//year
		
		Select year=new Select(driver.findElement(By.id("dob_y")));
		
		year.selectByIndex(6);

	}

}
