package com.methods;
//Create Static, Instance Variable & Static Method
//Print both the Variable values in Static Method
public class MethodsEx4 {
    static int a=5;//static variable
    int b=3; // Instance variable
    static void m1() {
    	MethodsEx4 obj= new MethodsEx4();
    	int c= a+obj.b;
    	System.out.println(c);
    }
	public static void main(String[] args) {
		m1();
		MethodsEx4.m1();

	}

}
