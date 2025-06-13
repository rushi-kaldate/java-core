package april15exceptionhandling;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter two no:");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		
//		try {
//			int r = a/b;
//			System.out.println("");
//			System.out.println("TRY");
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("CATCH");
//		}
//		finally {
//			System.out.println("FINALLY");
//		}
//		System.out.println("BYE");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		int b= scan.nextInt();
		
		try {
			int r = a/b;
			System.out.println(r);
			System.out.println("TRY");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			System.out.println("FINALLY");
		}
		System.out.println("BYE");
	}
	


}
