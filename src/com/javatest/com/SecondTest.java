package com.javatest.com;
//static member variable is the member of the whole class

//thats  mean its contain  class specific information not object specific informaton,if we not created  any object still y variable is created
//its created only once 
//classname.static variable name// by default its zero

public class SecondTest {
//static member in java
	int x;// instance variable
	static int y;// static member variable

	public void fun1(int a) {
		x=a;
		System.out.println(x);
	}// instance member function

	public static void fun2(int b) {
		System.out.println(b);
		// x=4;
		y = 4;
		System.out.println(y);
	}// static member function

	static class Test {
		public static String country = "abc";
	}

	// main is static member function it cann't directly use
	// fun1 but it can use fun2
//public class hello{   	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondTest obj = new SecondTest();
		obj.fun1(9);
		// obj.fun2(5);
		SecondTest.fun2(3);// static member function can only access static member function
		System.out.println(SecondTest.Test.country);
	}

}
//} 		
