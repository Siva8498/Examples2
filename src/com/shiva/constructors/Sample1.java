package com.shiva.constructors;

public class Sample1 
{
	 Sample1() {
		System.out.println("Default constructor");
	}
	
	Sample1(int a, int b)
	{
		this();
		int c = a+b;
		System.out.println("parameterised constructor");
		System.out.println("a+b value is :"+c);
	}
	
	Sample1(int a, int b, int c)
	{
		this(56,45);
		int d = a+b+c;
		System.out.println("a+b+c value is :"+d);
	}
	
	

}
