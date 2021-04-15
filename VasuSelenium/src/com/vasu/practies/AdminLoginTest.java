package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminLoginTest 
{

	public static void main(String[] args) 
	{
		//String username;
		
		//username="Admin";
		
		String username="Admin";
		
		//String password;
		
		//password="Admin";
		
		String password="Admin";
		
		//appLaunch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://PrimusBank.qedgetech.com");
		
		driver.manage().window().maximize();
		

		
		
		
		//appLogin
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		//branchcreation
		
		//Click Branch
		  WebElement element = driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a"));
		element.click();

		//Click New Branch
		driver.findElement(By.id("BtnNewBR")).click();

		//New Branch Entry details

		driver.findElement(By.id("txtbName")).sendKeys("PuneBranch");
		driver.findElement(By.id("txtAdd1")).sendKeys("Karvenagar");
		driver.findElement(By.id("Txtadd2")).sendKeys("Kothrud");
		driver.findElement(By.id("txtadd3")).sendKeys("Society");
		driver.findElement(By.id("txtArea")).sendKeys("Pune");
		driver.findElement(By.id("txtZip")).sendKeys("47201");

		//Select Country 

		Select country = new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByValue("INDIA");

		// select State

		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText("Andhra Pradesh");
		
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText("Hyderabad");
		
		driver.findElement(By.id("btn_insert")).click();
		
		
		//alert
		
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		
		al.accept();
		
		//validation
		
		if(msg.contains("created Sucessfully"))
		{
			System.out.println("Pass");
		}else
			if(msg.contains("already Exist"))
			{
				System.out.println("Fail");
			}else
				if(msg.contains("Please fill"))
				{
					System.out.println("Warning");
				}
		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		//appLogout
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		//appClose
		
		driver.close();

	}

}
