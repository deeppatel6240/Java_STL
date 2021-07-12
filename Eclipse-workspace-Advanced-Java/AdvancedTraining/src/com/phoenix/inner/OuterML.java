package com.phoenix.inner;

public class OuterML {
	
	public void show() {
		
		// method variables
		int a = 10;
		//a = 20; ----> can't change value of a
		
		class Inner {
		
			private int x;

			public Inner() {
				// TODO Auto-generated constructor stub
				x = 25365;
			}

			public Inner(int x) {
				super();
				this.x = x;
			}

			public void test() {
				System.out.println("x is : " + x);
				//a = 124; ---> you can't change value of method var here
				System.out.println("Method var: " + a);
			}
		} // end inner class
		
		Inner in1 = new Inner(123);
		Inner in = new Inner();
		in.test();
		in1.test();
	} // end of method
} // end of outer class
