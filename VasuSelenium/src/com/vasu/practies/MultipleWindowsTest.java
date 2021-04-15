package com.vasu.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div")).click();
		
		//capture all window ids 
		
		Set<String> windows=driver.getWindowHandles();
		
		//System.out.println(windows.size());
		
		/*for (String child : windows) 
		{
			//printing one by one  child window ids
			//System.out.println(child);
			
			//close one by one window
			
			//Give the control to specific windows
			
			driver.switchTo().window(child);
			
			//get the title of the window
			
			//System.out.println(driver.getTitle());
			
			//close the window
			//driver.close();
			
			
			if(!driver.getTitle().equals("HSBC"))
			{
				driver.close();
			}
		}*/
		
		/*Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next().toString());
			
			driver.switchTo().window(it.next().toString());
			
			System.out.println(driver.getTitle());
			
			driver.close();
		}*/
		
		List<String> tabs=new ArrayList(windows);
		
		/*driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		driver.close();*/
		
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.name("qp")).sendKeys("Selenium WebDriver");
		
		
		

	}

}
