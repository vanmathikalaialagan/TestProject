package com.constructor;

public class BasicConstructor {
/*
1.It is a special type of method which is used to initialize the object.​
2.Every time an object is created using the new() keyword, at least one constructor is called.​
3.It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.​
4.There are two types of constructors in Java: no-arg constructor, and parameterized constructor.​
5.It is called constructor because it constructs the values at the time of object creation.
	*/
/*Rules for creating Java constructor :​

1.Constructor name must be the same as its class name​
2.A Constructor must have no explicit return type​
3.A Java constructor cannot be abstract, static, final, and
synchronized​

***Types of Java constructors :*** ​

1.There are two types of constructors in Java:​
2.Default constructor (no-arg constructor)​
3.Parameterized constructor​
 * 
 */
	
public BasicConstructor() {// constructor creation
	System.out.println("0 arg constructor");
}
public BasicConstructor(int a) {
	System.out.println("1 arg constructor "+a);
}
public BasicConstructor(int a, int b) {
	System.out.println("2 arg constructor "+a+" "+b);
}
public BasicConstructor(int a, int b, int c) {
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
//*****Named Approach**********
	BasicConstructor obj1= new BasicConstructor();
	//Constructor is executed when object is created after that methods are executed.
	BasicConstructor obj2= new BasicConstructor(2);
	BasicConstructor obj3= new BasicConstructor(3,4);
	BasicConstructor obj4= new BasicConstructor(4,5,6);
	obj1.m1();
	obj2.m2();
	obj3.m3();
	obj3.m3();
	
//*****Non-Named Approach*********
	new BasicConstructor().m1();
	new BasicConstructor(2).m2();
	new BasicConstructor(3,4).m3();
    new BasicConstructor(4,5,6).m4();
    
  //Constructor has executed based on the how many time object had created.
    new BasicConstructor();//4 time obj created so 4 times executed
    new BasicConstructor();
    new BasicConstructor();
    new BasicConstructor();
	

	}

}
