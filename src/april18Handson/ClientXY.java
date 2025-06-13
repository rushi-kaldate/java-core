package april18Handson;

public class ClientXY {
	public static void main(String[] args) {
		X x = new X();

		try {
			x.m1();
			System.out.println("TRY");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		System.out.println("BYE");
	}

}
