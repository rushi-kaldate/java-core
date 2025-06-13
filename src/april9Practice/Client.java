package april9Practice;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount :");
		double bill = scan.nextDouble();
		
		PBill p1 = new PBillindia();
		PBill p2 = new PBillChina();
		
		double res = p1.CalTotalBill(bill);
		System.out.println("Total amount :"+bill);
		System.out.println("to be paid amount :"+res);
		
		System.out.println("---------------------");
		
		double res1 = p2.CalTotalBill(bill);
		System.out.println("Total amount :"+bill);
		System.out.println("to be paid amouont :"+res1);
	}
}
