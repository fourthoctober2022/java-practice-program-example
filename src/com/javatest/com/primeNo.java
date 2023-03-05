package com.javatest.com;

import java.util.*;

public class primeNo {

	public static void main(String[] args) {
		System.out.println("Enter a prime number:");
		Scanner pr = new Scanner(System.in);
		int x, i;
		x = pr.nextInt();
		//for (i = 2; i <= x - 1; i++) 
			for (i = 2; i < x; i++) 
			 if (x % 2 == 0)
				break;
		if (i == x)
			System.out.println("number is prime:=" + x);
		else {
			System.out.println("number is not prime:=" + x);
		}

		// TODO Auto-generated method stub

	}

}
