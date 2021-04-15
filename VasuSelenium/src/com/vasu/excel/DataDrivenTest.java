package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTest
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://PrimusBank.qedgetech.com");
		
		driver.manage().window().maximize();
		

		
		
		
		//appLogin
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		//branchcreation with multiple set of data
		
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\Sample.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
				
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i <=rcnt; i++)
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(branchName+"------"+add1);
			
			 driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
			

			//Click New Branch
			driver.findElement(By.id("BtnNewBR")).click();

			//New Branch Entry details

			driver.findElement(By.id("txtbName")).sendKeys(branchName);
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
				
				ws.getRow(i).createCell(2).setCellValue("Pass");
			}else
				if(msg.contains("already Exist"))
				{
					//System.out.println("Fail");
					ws.getRow(i).createCell(2).setCellValue("Fail");
				}else
					if(msg.contains("Please fill"))
					{
						//System.out.println("Warning");
						ws.getRow(i).createCell(2).setCellValue("Warning");
					}
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
			
			driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
			
		}
		
		wb.close();
		
		//appLogout
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		//appClose
		
		driver.close();

	}

}
