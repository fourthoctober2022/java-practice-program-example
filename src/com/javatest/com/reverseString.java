package com.javatest.com;

public class reverseString {
	//How to Reverse string in java  using for loop

	public static void main(String[] args) {

		String stringinput = "Independent";

        char[] resultarray = stringinput.toCharArray();

        for (int i = resultarray.length - 1; i >= 0; i--)

            System.out.print(resultarray[i]);

		}
	}

