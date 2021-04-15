package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement rs=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		
		Actions resize=new Actions(driver);
		
		resize.clickAndHold(rs).moveByOffset(200, 150).release(rs).build().perform();
		
		

	}

}
