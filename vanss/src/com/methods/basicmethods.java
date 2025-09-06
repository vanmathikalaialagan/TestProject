package com.methods;

public class basicmethods {
	//1.Duplicate methods name are not allowed.
	void m1() {
		
	}
	//Void m1() {} --> error:Duplicate method name.
	//2.In methods return type is mandatory.Instance variable.
	void m2() {
		System.out.println("Welcome");//no return type
	}
	public String m3(String s) {
		System.out.println("This is return type method");
		return s;// must give return or void it.
	}
	//3.instance methods without return type
	void m4() {
		System.out.println("Intance methods");
	}//calling instance methods by creating object in main methods.
	
	//4.Static methods
	static void m5() {
		System.out.println("Static mathods");
	}
	//5. Static methods with Return Type.
	static int m6(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	//6.Types of methods
	void t1() {
		System.out.println("Without Arguments without Return Type");
	}
	void t2(int c, int d) {
		System.out.println("With Arguments Without Return Type"+ c +"and"+d);
	}
	String t3() {
		System.out.println("Without Arument With Return Type");
		return "Hi jack";
	}
	int t4(int e, int f) {
		int mul=e*f;
		System.out.println("With Arguments With Return type");
		return mul;
	}
	//7. Inner methods concepts are not allowed in java but Inner class is allowed.
	class abc{
		
	}
	//8."this" keywords(if local variable and instance variable have same name we can use this keywords
	//to access instance variable use this keywords)
	int a=100;
	int b=200;
	void m7(int a) {
		int d=a+b;
		int c=this.a+b;//this use for instance variable
		System.out.println(d);
		System.out.println(c);
		
	}
	//9.Static methods inside this keywords not allowed can access using obj creation.
	static void m8(int a, int b) {
		basicmethods obj1= new basicmethods();
		int d=a+b;
		int c=obj1.a+b;//access instance variable 
		System.out.println(d);
		System.out.println(c);
	//10.After String number is not added they just concatenation
	
	}
	void m9() {
		System.out.println(10 +10+"aaa"+"bbb"+100+200);
		System.out.println(10 +10+"aaa"+"bbb"+(100+200));//now adding using bracket
	}
	public static void main(String[] args) {
		
	basicmethods obj= new basicmethods();	
	obj.m4();
	String result=obj.m3("vanss");//Argument passing
	System.out.println(result);// Printing Argument
	m5();//calling Static methods directly
	obj.m5();// calling static methods using obj.
	basicmethods.m5();// calling static methods using class name.
	m6(3,5);//calling static return type.
	//Types of methods
	obj.t1();
	obj.t2(4, 6);
	String str=obj.t3();
	System.out.println(str);
	int output=obj.t4(5, 5);
	System.out.println(output);
	obj.m7(300);
	obj.m8(30, 20);
	obj.m9();
	}

}
