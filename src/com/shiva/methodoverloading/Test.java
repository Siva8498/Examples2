package com.shiva.methodoverloading;



public class Test {

	public static void main(String[] args) {
		
		Sample1 s = new Sample1();
		s.add();
		s.add1(30);
		s.add2(20, 39);
		s.add3(40, 50, 49);
		s.add4(39.00f, 45.00f);

	}

}
