package com.methods;
//Factorial Calculation: Write a method calculateFactorial 
//that takes a non-negative int and returns its factorial.
public class MethodsEx7 {
	
    static int calculateFactorial(int num) {
    	int res=1;
    	for(int i=2;i<=num;i++) {
    	  res=res*i;
    	  
    	}
    	return res;
    	
    }
    
	public static void main(String[] args) {
		
     int result=MethodsEx7.calculateFactorial(5);
     System.out.println(result);
}
}
