package com.vasu.practies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://Google.co.in");
		
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		//Actions right=new Actions(driver);
		
		//right.contextClick(gmail).sendKeys("W").build().perform();
		
		//Keyboard 
		//right.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	Actions rbt=new Actions(driver);
	
	rbt.contextClick(gmail).build().perform();
	
	
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
	
		
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
