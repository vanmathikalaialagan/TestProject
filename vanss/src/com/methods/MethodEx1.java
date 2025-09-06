package com.methods;
//Create Instance Variable & Instance Method - Print
//Instance Variable value inside Instance Method​
public class MethodEx1 {
    int a=10;//Instance variable
    int b=20;
    void m1()//Instance Methods
    {
    	int c=a*b;
    	System.out.println(c);
    }	
    public static void main(String[] args) {
		MethodEx1 obj= new MethodEx1();
		obj.m1();//print Instance Methods using by Object creation.
	}

}
