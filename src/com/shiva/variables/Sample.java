package com.shiva.variables;

public class Sample 
{
//	int a = 30;// instance variable
//	int b = 30;
//	
//	public static void main(String[] args) 
//	{
//		Sample s = new Sample();
//		int c = s.a+s.b;
//		System.out.println("addition of the a and b :"+c);
//		
//	}
//	
//	static int a = 30;// static variable
//	static int b = 20;
//	
//	public static void main(String[] args) 
//	{
//		
//		 int c = a+b;
//		System.out.println(c);
//		
//	}
//	
	
	void show()
	{
		int a = 30;//local variable
		int b = 15;
		
		int c = a+b;
		System.out.println("addition of localvariable :"+c);
		
	}
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.show();
		
	}
	
	
	

}
