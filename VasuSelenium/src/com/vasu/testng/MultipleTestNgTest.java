package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTestNgTest 
{

	@Test(priority=1,enabled=false)
	public void appLaunch()
	{
		System.out.println("AppLaunch Executed");
	}
	@Test(priority=2)
	public void appLogin()
	{
		System.out.println("AppLogin Executed");
	}
	@Test()
	public void appLogout()
	{
		System.out.println("AppLogout Executed");
	}
	
	@Test()
	public void appClose()
	{
		System.out.println("AppClose Executed");
	}
}
