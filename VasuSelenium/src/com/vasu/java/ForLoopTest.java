package com.vasu.java;

public class ForLoopTest 
{

	public static void main(String[] args) 
	{
		//Prg to print "Selenium" 20 time in console
		
		//syntax:
		
		//for(initialization;condition;increment/decrement);
		//{
			//statement 1,2,3...args;
		//}
		
		/*for (int i = 1; i <=20; i++) 
		{
			System.out.println(i+"   "+"Selenium");//0   selenium
		}*/
		
		/*for (int i = 1; i <=10; i++)
		{
			System.out.println(1+"  X  "+i+"  =  "+i*1);
		}*/
		
		for (int i = 1; i <=20; i++) //table number
		{
			
			for (int j = 1; j <=10; j++) //iterations in each table
			{
				System.out.println(i+"  x  "+j+"  =  "+i*j);
			}
			
		}

	}

}
