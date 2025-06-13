package april17throws;

public class A {
	
	void m1()throws ClassNotFoundException{
		Class.forName("april17throws.X");
	}

}
