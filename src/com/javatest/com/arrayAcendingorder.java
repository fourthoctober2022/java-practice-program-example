package com.javatest.com;

import java.util.Scanner;

public class arrayAcendingorder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements :");
		n = sc.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("Enter the elements of the array :");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) // compares with remaining Array elements
			{
				if (a[i] < a[j]) // Compare and swap
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					System.out.println("a[i]:="+a[i]+ " " +"a[j]:+"+a[j]);
				}
			}
		}

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
