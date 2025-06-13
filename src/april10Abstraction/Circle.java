package april10Abstraction;

public class Circle  extends Shape{
	void calArea() {
		double r = 5;
		double a = Math.PI*Math.pow(r, 2);
		System.out.println(a);
	}
	
	void fillshape() {
		System.out.println("Filling Cricle");
	}
	
	void drawshape() {
		System.out.println("Drawing cricle");
	}

}
