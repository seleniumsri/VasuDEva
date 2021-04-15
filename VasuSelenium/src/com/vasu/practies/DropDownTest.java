package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) 
		{
			//System.out.println(dropList.get(i).getText());
			
			//dropList.get(i).click();
			
			/*if(dropList.get(i).getText().equals("Music"))
			{
				dropList.get(i).click();
			}*/
			
			dropList.get(i).click();
			//validation 
			
			if (dropList.get(i).isSelected())
			{
				System.out.println(dropList.get(i).getText()+" : is selected");
			}else
			{
				System.out.println(dropList.get(i).getText()+" : is not selected");
			}
		}
	}

}
