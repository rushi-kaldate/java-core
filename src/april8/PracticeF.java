package april8;

public class PracticeF {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		PracticeE e1 = new PracticeE();
		int res= e1.calpunishment(226);
		System.out.println(res);
		res = e1.calpunishment(72, 55);
		System.out.println(res);
		
		int charges[]= {70,187,226,55};
		res = e1.calpunishment(charges);
		System.out.println(res);
	}

}
