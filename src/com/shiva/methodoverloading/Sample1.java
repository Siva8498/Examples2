package com.shiva.methodoverloading;

public class Sample1 
{
	void add()
	{
		System.out.println("here is a example of method overloadong");
	}
	
	void add1(int a)
	{
		System.out.println("a value is :"+a);
	}
	
	void add2(int a, int b)
	{
		int c = a+b;
		System.out.println("a+b value is :" +c);
	}
	
	void add3(int a, int b, int c)
	{
		int  d = a+b+c;
		System.out.println("a+b+c value is :"+d);
		}
	void add4(float a, float b)
	{
		float c = a+b;
		System.out.println("float value is a :"+c);
	}
}

