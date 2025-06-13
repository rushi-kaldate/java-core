package april16exception;

public class F {
	public static void main(String[] args) {
		B b = new B(100,"ISHWAR",23000);
		System.out.println(b);
		b.debit(2300);
		System.out.println(b);
	}

}
