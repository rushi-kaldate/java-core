package april15exceptionhandling;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		try {
			int res = a/b;
			System.out.println("Result the a/b is :"+res);
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
