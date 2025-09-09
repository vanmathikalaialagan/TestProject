package com.Exercise;

import java.time.LocalDate;
import java.time.Month;
/*
 *Problem: Library Book Management System
Problem Statement:
Create a Java program to manage three types of library books using methods, variables, constructors, and static/instance blocks.
Book Types:
1. Reference Book: Includes a title, author, ISBN number, and a fixed section (e.g., "Reference").
2. Textbook: Includes a title, author, ISBN number, subject, and edition number.
3. Magazine: Includes a title, issue number, publication date, and periodicity (e.g., weekly, monthly).
Use:
A static block to print "Library System Initialized".
Different types of constructors for each book type.
Methods to display book details.
*/
public class Ex2 {
	private static final String MONTH = null;
	String title;
	String author;
	int isbn;
	String subject;
	double edition;
	int issue;
	static {
		System.out.println("--------------------------------------------------------");
		System.out.println("              Library System Initialized");
		System.out.println("--------------------------------------------------------");
		}
	
	public Ex2(String title, String author,int isbn) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		System.out.println("                     Reference Book");
		System.out.println("*********************************************************");
		reference();
	}
	
	public Ex2(String title, String author,int isbn, String Subject,double edition) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.subject=Subject;
		this.edition=edition;
		System.out.println("                        TextBook");
		System.out.println("--------------------------------------------------------");
	 textbook() ;
	}
	public Ex2(String title, int issue) {
		this.title=title;
		this.issue=issue;
		System.out.println("                        Magazine");
		System.out.println("--------------------------------------------------------");
		magazine();
	}
	void reference() {
		
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("ISBN"+isbn);
		System.out.println("Section:\n1.OOPs\n  1.1:Class\n  1.2:Objects\n  1.3:Inheritance\n  1.4:Encapsulation\n  1.5:Polymorphism\n  1.6:Abstraction\n2.Variables\n3.Methods\n4.Constructor\n5.Looping concepts\n  5.1:For loop\n  5.2:If ElSE\n  5.3:While loop\n  5.4:Do While\n  5.5:Switch");
	}
	void textbook() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("ISBN"+isbn);
		System.out.println("Subject"+subject);
		System.out.println("Edition:"+edition);
		
	}
	void magazine() {
		System.out.println("Title:"+title);
		System.out.println("Issue Number:"+issue);
		//Now I am going to set publication date as OCT 1
		LocalDate pubDate=LocalDate.of(2025, Month.OCTOBER, 01);
		System.out.println("PUBLICATION DATE ON:"+pubDate);
		LocalDate nxtPub=pubDate.plusMonths(1);
		System.out.println("Next Publication:"+nxtPub);
	}
	public static void main(String[] args) {
	new Ex2("Life of JAVA","Vanss",675438);	
	new Ex2("THE COOKING QUEEN","INDU",6789456,"Cooking is a Art",3.40);	
	new Ex2("Time Heals",0703);
	}

}
