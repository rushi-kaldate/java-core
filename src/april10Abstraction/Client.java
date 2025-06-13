package april10Abstraction;

public class Client {
	public static void main(String[] args) {
		Shape s1;
		Circle c = new Circle();
		Square s = new Square();
		c.calArea();
		c.drawshape();
		
		System.out.println("---------");
		s.calArea();
		s.drawshape();
		
	}

}
