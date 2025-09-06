package com.constructor;
//Local & Instance and Static variable in Constructor
//Instance and Static methods in Construct
public class ConstructorEx2 {
	int j=20;//Instance variable
	static int k=30;//Static Variable
    public ConstructorEx2() {//***Constructor
    	this(10);//access 2nd constructor
    	int i=10;//Local variable
    	System.out.println("Local variable"+i);//direct access(local)
    	System.out.println("Instance variable"+j);//direct access(Instance)
    	System.out.println("Static direct Access"+k);
    	System.out.println("Static class name"+ConstructorEx2.k);
    	//Important Note*****
    	//Don't create object inside constructor
    	//***Important**
    	m1();//***direct calling Instance methods without using object
    	m2();//direct calling static methods
    }
    void m1() {//****Instance Methods
    	System.out.println("Instance Methods");
    }
    static void m2() {
    	System.out.println("Static Methods");
    }
    
    //2nd constructor
    public ConstructorEx2(int a) {
    	System.out.println("1 args Constructor");
    }
    
    
	public static void main(String[] args) {
		ConstructorEx2 obj= new ConstructorEx2();
	}

}
