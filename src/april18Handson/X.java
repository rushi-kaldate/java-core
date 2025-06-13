package april18Handson;

public class X {
	void m1() throws ClassNotFoundException{
		
		Class.forName("april18Handson.hello");
		System.out.println("m1");
	}

}
