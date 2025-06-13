package april18Handson;

public class Client {
	public static void main(String[] args) {
		try {
			Class.forName("april18Handson.A");
			Class.forName("april18Handson.B");
			
			int a = 10;
			int b = 0;
			int r = a/b;
			System.out.println(r);
			Class.forName("april18Handson.C");
			System.out.println("TRY");
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("CATCH1");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("FINALLY");
		}
		System.out.println("BYE");
	}

}
