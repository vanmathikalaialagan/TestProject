package com.constructor;
//Instance Block
//1.Instance block is also a similar to a constructor. 
//So instance blocks are used to write the logic 
//that logics are executed during object creation.
//2.Why we create the instance block because of initialize the instance variables
//3.When we create object Instance block will executed then only constructor will execute.
//4.Main purpose of Instance block is to Initilaize the object.
public class InstanceBlock {
	public InstanceBlock(int a) {
		this(10,20);// try access 2 arg constructor
		System.out.println("1 arg constructor "+a);
	}
	public InstanceBlock(int a, int b) {
		System.out.println("2 arg constructor "+a+" "+b);
	}
	public InstanceBlock(int a, int b, int c) {
		System.out.println("0 arg constructor "+a+" "+b+" "+c);}
	{
		System.out.println("You can win");//Instance block
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InstanceBlock(10);
		new InstanceBlock(10,20);
		new InstanceBlock(10,20,30);
		

	}

}
