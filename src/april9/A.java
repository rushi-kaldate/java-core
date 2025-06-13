package april9;

public class A {
	int id;
	String name;
	
	A(){
		System.out.println("Hello");
	}
	
	A(int id,String name){
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String res = id+" "+name;
		return res;
	}

}
