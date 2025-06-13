package april14StaticFinal;

public abstract class A {
	int id;
	String name;
	
	A(){
		
	}
	
	A(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	abstract void m1();
	abstract void m2();// abstract methods
	public void m3() {// concrete method(Non-abstract method)
		System.out.println("m3");
	}
}
