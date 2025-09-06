package com.constructor;

public class ConstructorThis {
//This Keywords
	public ConstructorThis() {// constructor creation
		this(10);//If we want to access one constructor to another we use "this" keyword.
		//Should be in First Statement.
		System.out.println("0 arg constructor");
	}
	public ConstructorThis(int a) {
		this(10,20);// try access 2 arg constructor
		System.out.println("1 arg constructor "+a);
	}
	public ConstructorThis(int a, int b) {
		System.out.println("2 arg constructor "+a+" "+b);
	}
	public ConstructorThis(int a, int b, int c) {
		System.out.println("0 arg constructor "+a+" "+b+" "+c);
	}
	void m1() {
		System.out.println("M1 methods");
	}
	void m2() {
		System.out.println("M2 methods");
	}void m3() {
		System.out.println("M3 methods");
	}
	void m4() {
		System.out.println("M4 methods");
	}

	
		
	public static void main(String[] args) {
		ConstructorThis obj1= new ConstructorThis();
		//Constructor is executed when object is created after that methods are executed.
		ConstructorThis obj2= new ConstructorThis(2);
		ConstructorThis obj3= new ConstructorThis(3,4);
		ConstructorThis obj4= new ConstructorThis(4,5,6);
		obj1.m1();
		obj2.m2();
		obj3.m3();
		obj3.m3();
		

	}

}
