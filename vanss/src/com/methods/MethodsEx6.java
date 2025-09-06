package com.methods;
//Even or Odd: Create a method isEven that takes an int 
//and returns true if the number is even and false if it is odd.
//Use this method in a loop to check numbers from 1 to 10.
public class MethodsEx6 {
    
    static boolean isEven(int num) {
    	return num%2==0;
    	}
    	
    
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(isEven(i)) {
				System.out.println(i+"Is Even ");
			}else {
				System.out.println(i+"Is Odd");
			}
		}

	}

}
