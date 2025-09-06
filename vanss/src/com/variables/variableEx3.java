/*
1.Create a Class: Create a class named variableEx3.
2.Declare Instance Variables: Inside the Book class, declare three instance variables:
title (of type String)
author (of type String)
pages (of type int)
3.Create Objects: In your main method, create two separate Book objects.
4.Set Values: For each Book object, set the values for the title, author, and pages instance variables.
5.Print Details: Use System.out.println() to print the details of each book in a clear, formatted way (e.g., "Title: The Hobbit, Author: J.R.R. Tolkien, Pages: 310").
 * 
 */
package com.variables;

public class variableEx3 {
	String title;
	String author;
	int pages;

	public static void main(String[] args) {
		variableEx3 obj= new variableEx3();
		obj.title="The Hobbit";
		obj.author="J.R.R. Tolkien";
		obj.pages=310;
		System.out.println("Title :"+obj.title+"Author:"+obj.author+"Pages:"+obj.pages);
      
	}

}
