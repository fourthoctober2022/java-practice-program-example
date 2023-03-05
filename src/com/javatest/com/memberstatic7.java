package com.javatest.com;

public class memberstatic7 {
	int x;// instance variable
	static int y;// static member variable
	static int z;

	public void fun1(int a) {
		//static int h;
		x = a;
		y = a;
		z=a;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	public static void fun2(int a) {
		y = a;
		System.out.println(y);
	}

	public static void fun3(int a) {
		//static int m;
	}
	static class inner {
		public static String country = "abc";
	}

	public static void main(String args[]) {
		memberstatic7 obj = new memberstatic7();
		obj.fun1(3);
		memberstatic7.fun2(8);
		z = 6;
		System.out.println(memberstatic7.inner.country);

	}
}