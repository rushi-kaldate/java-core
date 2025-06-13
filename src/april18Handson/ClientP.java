package april18Handson;

public class ClientP {
	public static void main(String[] args) {
		Product p1 = new Product(100,"Ram",2300);
		Product p2 = new Product(101,"Sam",2400);

		try {
			p1.setPrice(-90);
			System.out.println("TRY");
		}
		catch(NegativePriceException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		System.out.println(p1);
		System.out.println(p2);


	}

}
