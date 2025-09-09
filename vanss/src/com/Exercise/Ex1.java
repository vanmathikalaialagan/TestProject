
package com.Exercise;
import java.time.*;
//import java.time.LocalDate;
//import java.util.*;
/*Your task is to create a Java program that can "draw" three different types of bank checks.
 *  You will use different types of constructors to represent the creation of each check and 
 *  a static block to set up the foundation for all of them.
Bank Check Types:
 * Savings Account Check: A basic check that includes the payee, amount, date, 
 * and a pre-set savings account number.
 * Business Account Check: A check with a more detailed layout that includes the payee, 
 * amount, date, a business name, and a unique check number.
 * Traveler's Check: A special check that includes a pre-printed serial number, the amount,
 *  and a space for the payee's name and signature.
 * 
 */
public class Ex1 {
	static int accNumber=3456789;
	 String payee;
	 double amount;
	 String BName;
	 int UqchkNum;
	 int sernum;
	
	
	
static {
	System.out.println("----------------------------------");
	System.out.println("     ******CITI BANK*******");
	System.out.println("Bank Account Number:"+accNumber);
	System.out.println("----------------------------------");
	
}
 public Ex1(String payee,double amount) {
	 this.payee=payee;
	 this. amount=amount;
	 System.out.println("----------------------------------");
	System.out.println("      Saving Account Check:");
	SavingAcc();
}
 public Ex1(String payee, double amount, String BName, int UqchkNum) {
	 this.payee=payee;
	 this.amount=amount;
	 this.BName=BName;
	 this.UqchkNum=UqchkNum;
	 System.out.println("----------------------------------");
	System.out.println("      Business Account Check:");
	BusinessAcc();
}
 public Ex1(String payee, int sernum, double amount) {
	 this.payee=payee;
	 this.sernum=sernum;
	 this.amount=amount;
	 System.out.println("----------------------------------");
	System.out.println("          Traveler's Check:");
	TravelerChk();
}
 
void SavingAcc() {
	System.out.println("Payee:"+payee);
	System.out.println("Amount:"+amount);
	System.out.println("Date:"+LocalDate.now());//Date(Current date)
	
	
}
void BusinessAcc() {
	System.out.println("Payee:"+payee);
	System.out.println("Amount:"+amount);
	System.out.println("Business Name:"+BName);
	System.out.println("Unique Serial Number:"+UqchkNum);
	System.out.println("Date:"+LocalDate.now());
}
void TravelerChk() {
	System.out.println("Payee:"+payee);
	System.out.println("Amount:"+amount);
	System.out.println("serial Number:"+sernum);
	System.out.println("For confirmation\nName:"+payee);
	System.out.println("Signature:______________");
	
}


	public static void main(String[] args) {
    new Ex1("Vanss",2500.67);//saving account
	new Ex1("Indu",5678.45,"Kandhan Store",678943);//Business Check
	new Ex1("Keerthi",67534,896753.99);
	}

}
