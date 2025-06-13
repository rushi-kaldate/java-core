import java.util.Scanner;

public class Palindrome {
	public class palindrome {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String input = scan.nextLine();
			
			boolean ispalindrome = isalindrome(input);
			
			if(ispalindrome) {
				System.out.println(""+ input+"is a palindrome");
			}
			else {
				System.out.println(""+input+"is not a polindrome");
			}
			
		}

	}
	public static boolean isalindrome(String str) {
		int n = str.length();
		for(int i = 0; i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}


}
