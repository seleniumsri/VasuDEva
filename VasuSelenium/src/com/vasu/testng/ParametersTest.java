package com.vasu.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametersTest
{
	
@Test(dataProvider="getData")
public void login(String username,String pwd)
{
	System.out.println("Username is : "+username);
	
	System.out.println("Password is : "+pwd);
}


@DataProvider
public Object[][] getData()
{
	Object [] [] data=new Object[2][2];//1 represents iteration (one time program execution)//2 represents parameters
	
	data[0][0]="VasuDeva1";
	data[0][1]="Selenium1";
	data[1][0]="VasuDeva12";
	data[1][1]="Selenium12";
	
	return data;
}


}
