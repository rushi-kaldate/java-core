package abc27;

public class ClientB {
	public static void main(String[] args) {
		int no = 7865;
		int sum = 0;
		
		int r = no %10;
		sum =sum * 10 + r;
		no = no /10;
		System.out.println(sum);
		
		
	}

}
    // int no = 7865;
    // int rev = 0;
    // while( no>0){
//        rev = rev * 10 +no % 10;
//        no=no /10;
//}
//System.out.println(rev);