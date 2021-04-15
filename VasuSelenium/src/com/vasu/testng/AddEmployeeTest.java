package com.vasu.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddEmployeeTest extends PrimusBank
{

	@Test(dataProvider="getData")
	public void addEmp(String bName,String add1,String add2)
	{
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();

		//Click New Branch
		driver.findElement(By.id("BtnNewBR")).click();

		//New Branch Entry details

		driver.findElement(By.id("txtbName")).sendKeys(bName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("Txtadd2")).sendKeys(add2);
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
		
		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	}
	
	@DataProvider
	public Object [][] getData()
	{
		System.out.println("sample");
		
		Object [][] data=new Object[2][3];
		
		data[0][0]="JayaSelenium34";
		data[0][1]="PrachiSelenium34";
		data[0][2]="Address2";
		
		data[1][0]="JayaSelenium34";
		data[1][1]="PrachiSelenium34";
		data[1][2]="Address2";
		
		return data;
	}
	
}
