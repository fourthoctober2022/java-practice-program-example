package com.javatest.com;

public class FirstTest {
	private int length, breadth, height;

	public void setDimension(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}

	public void showDimension() {
		System.out.println("i am 10");
		System.out.println("L=" + length);
		System.out.println("I am 20");
		System.out.println("B=" + breadth);
		System.out.println("I am 30");
		System.out.println("H=" + height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i run first");
		// smallBox is a reference variable which contains the reference of object(means
		// contains the address of object)
		// object has no name but reference variable name is used as object name
		FirstTest smallBox = new FirstTest();
		smallBox.setDimension(10, 20, 30);
		smallBox.showDimension();
		smallBox = new FirstTest();// created new object but reference in the old one ,so this time old one is
									// called garbage collector because smallbox now refer to new object
		smallBox.showDimension();// when you assign no value by default it is zero in instance variable

	}

}
