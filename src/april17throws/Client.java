package april17throws;

public class Client {
	public static void main(String[] args) 
	throws ClassNotFoundException{
//		A a = new A();
//		try {
//			a.m1();
//			System.out.println("TRY");
//		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("CATCH");
//		}
//		finally {
//			System.out.println("FINALLY");
//		}
//		System.out.println("BYE");
	    A a = new A();
	    a.m1();
	    System.out.println(a);
	
	}
}
