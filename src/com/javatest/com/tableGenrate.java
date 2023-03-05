package com.javatest.com;

import java.util.*;

public class tableGenrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number =:");
		Scanner table = new Scanner(System.in);
		int n = table.nextInt();
		System.out.println("to check that what is n:=" +n);
		int i, z;
		for (i = 1; i <= 10; i++) {
		z = i * n;
		System.out.println(+i+"*"+n+"="+z );
		
			
		}

	}

}
