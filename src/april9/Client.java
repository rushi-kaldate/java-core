package april9;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
//		A a1 = new A();
//		A a2 = new A(100,"Hello");
//		
////		System.out.println(a1.id+" "+a1.name);
////		System.out.println(a2.id+" "+a2.name);
//		
//		System.out.println(a1);
//		System.out.println(a2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the bill amount :");
		double bill = scan.nextDouble();
		
		ProccessBill b1 = new ProccessBillIndia();
		ProccessBill b2 = new ProccessBillChina();
		
		
		double r1 = b1.calTotalBill(bill);
		System.out.println("bill amount "+bill);
		System.out.println("amount to be paid "+ r1);
		
		System.out.println("------------------------");
		
		double r2 = b2.calTotalBill(bill);
		System.out.println("bill amount "+ bill);
		System.out.println("amount to be paid "+r2);
	}

}
