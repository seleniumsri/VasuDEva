package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		//html alert
		
		driver.findElement(By.id("corover-close-btn")).click();
		
		System.out.println("Added new line");
		
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();

		//handling java script alert
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		Thread.sleep(2000);
		
		al.accept();//click on ok
		//al.dismiss();//click on cancel

	}

}
