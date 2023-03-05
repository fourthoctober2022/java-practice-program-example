package com.javatest.com;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ReverseString using CharcterArray.

				String stringinput = "Test_me";

				// convert String to character array // by using toCharArray

				char[] resultarray = stringinput.toCharArray();
				int y = resultarray.length;
				System.out.println("length of the string:" +y);
				 for (int i = y - 1; i >= 0; i--) {
					  System.out.print(resultarray[i]);
				 }


				}

	}

