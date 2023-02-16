package com.shiva.encapusulation;

public class Test {

	public static void main(String[] args) 
	{
		Sample1 s = new Sample1();
		s.setId(101);
		s.setName("shiva");
		s.setSalary(45000);
		s.setAddress("hyderabad");
		
		System.out.println("employee id :"+s.getId());
		System.out.println("employee name :"+s.getName());
		System.out.println("employee salary :"+s.getSalary());
		System.out.println("employee address :"+s.getAddress());
		
		
		
		

	}

}
