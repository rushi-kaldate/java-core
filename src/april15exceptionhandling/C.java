package april15exceptionhandling;



public class C {
	public static void main(String[] args) {
		String s = null;
		
		try {
			String res = s.toUpperCase();
			System.out.println("TRY");			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			try {

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("BYE");
		}
		
	}

}
