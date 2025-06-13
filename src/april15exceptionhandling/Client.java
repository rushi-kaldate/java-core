package april15exceptionhandling;

public class Client {
	public static void main(String[] args) 
			throws ClassNotFoundException {
		
		Class.forName("april15exceptionhandling.ClientA");
		Class.forName("april15exceptionhandling.ClientB");
	}
}
