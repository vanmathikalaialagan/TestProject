package com.methods;

public class MethodsEx3 {
//Create Static, Instance Variable & Instance Method
//Print both the Variable values in Instance Method
	
	static int a=10;// Static variable
	int b=20;// Instance variable
	void m1() {
		
		int c=MethodsEx3.a+b;
		System.out.println(c);
	}
public static void main(String[] args) {
		MethodsEx3 obj= new MethodsEx3();
		obj.m1();

	}

}
