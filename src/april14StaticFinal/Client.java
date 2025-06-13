package april14StaticFinal;

public class Client {
	public static void main(String[] args) {
		
		A obj = new B(1,"Rushi");
		obj.m1();
		System.out.println("Calling m1");
		obj.m2();
		System.out.println("Calling m2");
		obj.m3();
		System.out.println("Calling m3");
	}

}
