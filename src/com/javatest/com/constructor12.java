package com.javatest.com;

public class constructor12 {
int a;
public constructor12(int a) {
	System.out.println("I am the third");
	 this.a=a/2;
}
public constructor12(int a, int b){
	this.a=a+b;
	System.out.println("I am the Second");
 }
public constructor12(int a, int b, int c){
	this.a=a;
	this.a=b;
	this.a=c;
	System.out.println("I am the first");
	}
public static void main(String[] arg){
constructor12 c2 = new constructor12(4);
System.out.println(c2.a);
constructor12 c1 = new constructor12(40,80);
System.out.println(c1.a);
constructor12 c = new constructor12(10,20,30);
System.out.println(c.a);

}
}

