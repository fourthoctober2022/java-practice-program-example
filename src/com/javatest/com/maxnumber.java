package com.javatest.com;
import java.util.*;
public class maxnumber {

	public static void main(String[] args) {
		int n, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			System.out.println("Enter value by user:="+a[i]);
		}
		//max = a[0];
		max = 0;
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		System.out.println("Maximum value is :=" + max);

	}

}
