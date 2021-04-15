package com.vasu.java;

import java.util.Scanner;

public class IfStatementTest 
{

	public static void main(String[] args) 
	{
		// Program to check the given no is Even / Odd
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//int n=48;
		
		if(n%2==0)
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}

	}

}
