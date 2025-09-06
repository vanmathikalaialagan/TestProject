package com.variables;
/*Objective: Practice declaring and initializing different types of variables
 
 -->Create a Java class named VariableEx1.

1.Declare variables to store the following information about a user:
2.A String for their name.
  An int for their age.
  A double for their height (in meters).
  A boolean to check if they are a student.
3.Assign values to these variables.
4.Print all the variable values to the console in a clear format (e.g., "Name: John Doe, Age: 30, Height: 1.75m, Student: false").
 */
public class VariableEx1 {
	/**String name="vanss";
	int age=24;
	double height=15.6d;
	boolean isStudent=true;
	--->these all are instance variable
	---> To access create obj in main and then access instance methods
	*/
	public static void main(String[] args) {
		String name="vanss";//these all are local variables
		int age=24;
		double height=15.6d;
		boolean isStudent=true;
	 System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Height:"+height+"\n"+"IsStudent:"+isStudent);
	}

}
