package april14StaticFinal;

public class T {
	int id;
	String name;
	
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	T(){
		System.out.println("Counstructor");
	}

}
