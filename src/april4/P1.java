package april4;

public class P1 {
	private int id;
	private String name;
	private double price;

	public P1(){

	}

	public P1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<0)
			System.out.println("Id is negative");
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0)
			System.out.println("Price can't be negative");
		else
			this.price = price;
	}
	
	

}
