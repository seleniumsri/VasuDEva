package com.vasu.java;

public class Vasu 
{
	
	//variable
	
	int i=5;
	
	//method
	
	public void add()
	{
		int a=5;
		int b=6;
		
		int sum=a+b;
		
		System.out.println(sum);

	}

	public static void main(String[] args) 
	{
		//Object
		
		Vasu v=new Vasu();
		
		v.add();//method
		System.out.println(v.i);//variable

	}

}
