package com.constructor;

//import com.sun.org.apache.bcel.internal.Const;

public class ConstructorEx1 {
//Types of Constructor
//1.Default Constructor(no arg)
	int id;
	String name;
	int Age;
	public ConstructorEx1() {//Initialize one value
		id=123;
		name="vanss";
		Age=24;
			
	}
	void m1() {
		System.out.println("Student id is:"+id+"\n"+"Name is:"+name+"\n"+"Age is:"+Age);
	}
//2.Parameterized constructor( more values)
	public ConstructorEx1(int eid, String ename, int eAge) {
		this.id=eid;//Access instance variable
		this.name=ename;//Also local variable and instance variable name has same also we use "this" keyword.
		this.Age=eAge;
		
		System.out.println(eid+" "+ename+" "+eAge);
	}
	void m2() {
		System.out.println("Method 1:"+eid+" "+ename+" "+eAge);
	}
	void m3() {
		System.out.println("Method 2:"+eid+" "+ename+" "+eAge);
	}
	void m4() {
		System.out.println("Method 3:"+eid+" "+ename+" "+eAge);
	}
	
public static void main(String[] args) {
	ConstructorEx1 obj= new ConstructorEx1();
	obj.m1();
//2..Parameterized constructor	
	ConstructorEx1 obj1= new ConstructorEx1(1,"Jack",21);
	ConstructorEx1 obj2= new ConstructorEx1(2,"John",22);
	ConstructorEx1 obj3= new ConstructorEx1(3,"Josh",23);
	
	
}
}
