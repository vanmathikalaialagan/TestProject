package com.methods;

public class MethodsEx2 {
//Create Static Variable & Static Method - Print Static
//Variable value inside Static Method
	static int a=30;//static variable
	static int b=20;
	static void m1() {
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		m1();
		MethodsEx2.m1();

	}

}
