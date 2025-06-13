package abc24.com;

public class ClientE {
	public static void main(String[] args) {

		String z[] = new String[5];

		//System.out.println(z.length);

		z[0] = "Hello";
		z[1] = "Good morning";
		z[2] = "bye bye";
		z[3] = "namaste";
		z[4] = "not possible";

		for(int i = 0; i<z.length; ++i)
			System.out.println(z[i]);

		System.out.println("-------------");

		String x[] = {"Hello", "Good morning", "bye bye", "namaste", "not possible"};
		for(int i = 0; i<x.length; ++i)
			System.out.println(x[i]);
	}

}
