package april14StaticFinal;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException {
		T obj = new T();
		//T obj1 = new T();
		Class.forName("april14StaticFinal.T");
		System.out.println(Math.PI);
	}

}
