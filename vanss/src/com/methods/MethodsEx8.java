package com.methods;
//Task: Temperature Conversion 🌡️
/*
Write a method called convertToFahrenheit that 
takes a double representing a temperature in Celsius 
and returns the equivalent temperature in Fahrenheit. 
The formula for converting Celsius to Fahrenheit is:
F=C*(9/5)+32
C=(F-32)*5/9
*/
public class MethodsEx8 {
    static double c=25.0;
    public static void convertToFahrenheit() {
    	double f=c*(9.0/5.0)+32;
    	System.out.println(f);
    	 }
    
	public static void main(String[] args) {
	MethodsEx8.convertToFahrenheit();

	}

}
