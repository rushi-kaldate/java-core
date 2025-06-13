package april10Abstraction;

public class Square extends Shape{
	void calArea() {
		double r = 5;
		double a = Math.pow(r, 2);
		System.out.println(a);
	}
	
	void fillshape() {
		System.out.println("Filling Square");
	}
	
	void drawshape() {
		System.out.println("Drawing square");
	}

}
