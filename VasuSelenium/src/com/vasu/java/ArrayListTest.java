package com.vasu.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args) 
	{
		
		//ArrayList<String> l=new ArrayList<>();
		
		/*List<String> l=new ArrayList<>();
		
		l.add("Selenium");
		l.add("Vasu");
		l.add("Training");
		l.add("Selenium");
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		
		for (String item : l)
		{
			System.out.println(item);
		}
		*/
		
		/*List<Integer> l=new ArrayList<>();
		
		l.add(12);
		l.add(14);
		
		System.out.println(l.size());
		
		for (Integer item : l)
		{
			System.out.println(item);
		}*/

		
		List<Object> l=new ArrayList<>();
		
		l.add(12);
		l.add("Selenium");
		l.add('A');
		l.add(14.25);
		
		for (Object item : l) 
		{
			System.out.println(item);
		}
		
		
		
	}

}
