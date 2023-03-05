package com.javatest.com;

import java.util.*;

//system.in is responsible for bring data from keyboard to buffer. nextInt() take the data from  buffer until there is  delimeter(space,enter,tab,newline character) ,If there is no data  in Buffer then nextInt with the help of System.in take the data from keyboard. where data is come from we use system.in  to buffer
public class swapbysacnner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the value of a" );
		System.out.println("Enter the value of b");
		int a, b, temp;
		a = kb.nextInt();
		b = kb.nextInt();

		temp = a;
		a = b;
		b = temp;
		System.out.println(+a);
		System.out.println(+b);
	}
}
