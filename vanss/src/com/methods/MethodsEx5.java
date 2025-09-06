package com.methods;
//Create Static, Instance Variable & Instance,
//Static Method Print both the Variable values in
//Static Method & Instance Method 
public class MethodsEx5 {
	int a=2;
	int b=3;
	static int c=5;
	static int d=6;
	
	void m1() { // Instance Methods
		int res1=a*MethodsEx5.c;
		int res2=b+MethodsEx5.d;
		int final1=res1+res2;
		System.out.println(final1);
	}
	static void m2() {// static Methods
		MethodsEx5 obj1= new MethodsEx5();
		int res1=obj1.a*c;
		int res2=obj1.b+d;
		int final2=res1+res2;
		System.out.println(final2);
	}
	

	public static void main(String[] args) {
		MethodsEx5 obj= new MethodsEx5();
		obj.m1();//Instance calling
		MethodsEx5.m2();// Static calling

	}

}
