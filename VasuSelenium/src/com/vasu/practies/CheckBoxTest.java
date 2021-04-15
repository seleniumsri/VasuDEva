package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("remember")).click();
		
		System.out.println("Before click on check box : "+driver.findElement(By.id("remember")).getAttribute("checked"));
		//validation
		
		if(driver.findElement(By.id("remember")).isSelected())
		{
			driver.findElement(By.id("remember")).click();
			System.out.println("After click on check box : "+driver.findElement(By.id("remember")).getAttribute("checked"));
		}

	}

}
