package com.vasu.library;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank 
{
	
	ChromeDriver driver;
	String res;
	
	//AppLaunch
	
	
	
	public String  appLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("Http://PrimusBank.qedgetech.com");
		
		driver.manage().window().maximize();
		//validation
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		
		return res;
	}
	
	//AppLogin
	
	public String appLogin(String username,String password)
	{

		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		//validation
		
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		
		return res;

	}
	
	public String branchCreation(String bName,String add1)
	{
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();

		//Click New Branch
		driver.findElement(By.id("BtnNewBR")).click();

		//New Branch Entry details

		driver.findElement(By.id("txtbName")).sendKeys(bName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
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
			//System.out.println("Pass");
			res="Pass";
		}else
			if(msg.contains("already Exist"))
			{
				//System.out.println("Fail");
				res="Fail";
			}else
				if(msg.contains("Please fill"))
				{
					//System.out.println("Warning");
					res="Warning";
				}
			
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	return res;
	}
	
	//AppLogout
	
	
	public String appLogout()
	{
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		//validation
				if(driver.findElement(By.id("txtuId")).isDisplayed())
				{
					res="Pass";
				}else
				{
					res="Fail";
				}
				
				return res;
	}
	
	//AppClose
	
	
	public void appClose()
	{
		driver.close();
	}
	
	
	public static void main(String[] args)
	{
		
		PrimusBank app=new PrimusBank();
		
		//Modularity framework
		
		//Check URL
		
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appClose();
		
		//Check Login
		

		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.appLogout();
		app.appClose();
		
		//branchCreation
		
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appLogin("Admin", "Admin");//call by value
		app.branchCreation("Sridevi1234", "Hyderabad");
		app.appLogout();
		app.appClose();
		
		
		
	}
	
	
}
