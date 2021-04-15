package com.vasu.library;

public class MethodsTest 
{

	
	//1. NS method with return-type with parameters
	
	/*public int  add(int a,int b)
	{
		
		int sum=a+b;
		
		return sum;
	}*/
	
	
	//2. NS method with return-type with-out parameters
	
	/*public int add()
	{
		int a=40;
		int b=20;
		
		int sum=a+b;
		
			return sum;
	}*/
	
	//3. NS method with-out return type with parameters
	
	
	/*public void add(int a,int b)
	{
		int sum=a+b;
		
		System.out.println(sum);
	}*/
	
	//4. NS method with-out return-type with-out parameter
	
	public void add()
	{
		int a=20;
		int b=20;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		//Object
		MethodsTest ns=new MethodsTest();
		
		//ns.add(20, 30);//calling a method with method name,it won't return a value
		
		//int res=ns.add(10, 80);//calling a method with variable,it will return a value
	
		//System.out.println(res);
		
		//System.out.println(ns.add(20,30));
		
		//int res=ns.add();
		
		//System.out.println(res);
		
		//ns.add(20, 90);
		
		ns.add();
	}

}
