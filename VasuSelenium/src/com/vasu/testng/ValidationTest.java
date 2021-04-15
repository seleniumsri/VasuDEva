package com.vasu.testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ValidationTest
{

	@Test
	public void validation()
	{
		String data="Selenium";
		String data1="Selenium";
		
		/*if(data.equals(data1))
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		
		//Assert.assertEquals(data, data1);
		
		Assert.assertEquals(13, 14);
	}
}
