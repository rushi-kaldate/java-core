package april15exceptionhandling;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int index = scan.nextInt();
//		int a[] = {45,23,46,32,65,43};
//		
//		try {
//			System.out.println(a[index]);
//			System.out.println("TRY");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("CATCH");
//		}
//		finally {
//			System.out.println("BYE BYE");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a no:");
		int index = scan.nextInt();
		int a[]= {11,12,13,14,15,16,17,18};
		
		try {
			System.out.println(a[index]);
			System.out.println("TRY");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			System.out.println("FINALLY");
		}
	}

}
