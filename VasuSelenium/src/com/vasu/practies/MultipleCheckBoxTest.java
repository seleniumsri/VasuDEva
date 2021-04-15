package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		WebElement check=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> checkList=check.findElements(By.tagName("input"));
		
		System.out.println(checkList.size());
		
		 
		
		for (int i = 0; i < checkList.size(); i++) 
		{
			//click on one by one
			//checkList.get(i).click();
			//Status & Names
			
			//System.out.println(checkList.get(i).getAttribute("checked")+"------"+checkList.get(i).getAttribute("value"));
		//click on specific check  box  
			
			
			/*if(checkList.get(i).getAttribute("value").equals("Cheese"))
			{
				checkList.get(i).click();
			}*/
			
			checkList.get(i).click();
			
			System.out.println("Click on : "+checkList.get(i).getAttribute("value"));
			
			for (int j = 0; j < checkList.size(); j++)
			{
				System.out.println(checkList.get(j).getAttribute("checked")+"------"+checkList.get(j).getAttribute("value"));
			}
			System.out.println("#####################");
		}
	}

}
