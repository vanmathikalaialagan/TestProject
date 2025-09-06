// Store the marks of3 Subjects in variables and calculate the total and average.
//Static variable
package com.variables;

public class variableEx2 {

	static int maths;//Declare the static variable at the class level
	static int science;
	static int social;
	
	public static void main(String[] args) {
		
		maths=89;//Initialize the static variable inside the main method
		science=98;
		social=100;
		int total=maths+science+social;
		int avg=total/3;
		
		System.out.println("Total is:"+total+"\n"+"Average is:"+avg);//2.direct access;
		variableEx2 obj= new variableEx2();//2.create obj for access
		System.out.println("object acces"+total+" "+avg);
		
		System.out.println("Access using class name:"+total+" "+avg);//3.Access using class name
		
				
		
		

	}

}
