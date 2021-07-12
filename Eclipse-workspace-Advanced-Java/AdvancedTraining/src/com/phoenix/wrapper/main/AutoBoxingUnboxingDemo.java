package com.phoenix.wrapper.main;

public class AutoBoxingUnboxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		// wrapping
		Integer i1 = Integer.valueOf(a);
		System.out.println(a);
		
		//unwrapping
		int b = i1.intValue();
		System.out.println(b);

		// Auto boxing
		int x = 500;
		
		Integer i2 = x; // auto boxing
		System.out.println(i2);
		
		int y = i2; // auto unboxing
		System.out.println(y);
		
		// auto boxing
		Boolean b1 = true;
		System.out.println(b1);
	
		// auto unboxing
		boolean b2  = b1;
		System.out.println(b2);
		
		// auto boxing
		char ch = 'd';
		Character c1 = ch;
		System.out.println(c1);
		
		// auto unboxing
		char ch1 = c1;
		System.out.println(ch1);
		
		
	}	

}
