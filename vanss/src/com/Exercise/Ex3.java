package com.Exercise;

import java.time.LocalDate;
import java.time.Month;

/*Problem: Employee Salary Slip Generator
Problem Statement:
Write a Java program that generates salary slips for three types of employees.
 Demonstrate the use of instance variables, methods, constructors, and static blocks.
 Employee Types:
1. Permanent Employee: Name, Employee ID, Basic Salary, and Benefits.
2. Contract Employee: Name, Employee ID, Hourly Rate, Hours Worked.
3. Intern: Name, Internship Duration, Stipend.
Requirements:
A static block to print "Payroll System Initialized".
Methods to calculate and display salary details.
Constructors to initialize employee data.
 * 
 */
public class Ex3 {
   static {
	   System.out.println("                  Payroll System Initialized");
	   System.out.println("*******************************************************************");
   }
   String name;
   int empId;
   double bSalary;
   String benefit;
  
   public Ex3(String name, int empId, double bSalary, String benefit) {
	   this.name=name;
	   this.empId=empId;
	   this.bSalary=bSalary;
	   this.benefit=benefit;
	   System.out.println("                       Permanent Employee");
	   System.out.println("--------------------------------------------------------------------");
	   System.out.println("Name:"+name);
	   System.out.println("Employee ID:"+empId);
	   System.out.println("Basic Salary:"+bSalary);
	   System.out.println("Benefits:"+benefit);
	   
   }
   double Hsalary;
   float hWork;
   public Ex3(String name, int empId,double Hsalary,float hWork) {
	   this.name=name;
	   this.empId=empId;
	   this.Hsalary=Hsalary;
	   this.hWork=hWork;
	   System.out.println("                       Contract Employee");
	   System.out.println("--------------------------------------------------------------------");
	   System.out.println("Name:"+name);
	   System.out.println("Employee ID:"+empId);
	   System.out.println("Hourly Salary:"+Hsalary);
	   System.out.println("Hourly Worked:"+hWork);
	   
   }
   double stipend;
   public Ex3(String name, double stipend) {
	   this.name=name;
	   this.stipend=stipend;
	   System.out.println("                       Internship");
	   System.out.println("--------------------------------------------------------------------");
	   System.out.println("Name:"+name);
	   LocalDate startdate=LocalDate.of(2025, Month.JULY, 03);
	   LocalDate enddate=startdate.plusMonths(6);
	   System.out.println("Duration: From "+startdate+"\n End "+enddate);
	   System.out.println("Stipend:"+stipend);
	   
   }
   
   
	public static void main(String[] args) {
		new Ex3("Vanmathi",2569570,21342.99d,"TCS benefits");
		new Ex3("InduMathi",2565109,1500.66d,5.5f);
		new Ex3("Keerthi",12786.56d);

	}

}
