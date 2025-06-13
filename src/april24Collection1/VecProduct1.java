package april24Collection1;

public class VecProduct1 implements Comparable<VecProduct1>{
	private int id;
	private String name;
	private double price;
	private String categery;
	
	public VecProduct1() {
		
	}

	public VecProduct1(String name, double price, String categery) {
		super();
		this.name = name;
		this.price = price;
		this.categery = categery;
	}

	public VecProduct1(int id, String name, double price, String categery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categery = categery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		this.price = price;
	}

	public String getCategery() {
		return categery;
	}

	public void setCategery(String categery) {
		this.categery = categery;
	}

	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + ", categery=" + categery + "]";
	}

	public int compareTo(VecProduct1 o) {
		Integer i1 = this.id;
		Integer i2 = o.getId();
		return i1.compareTo(i2);
	}


	
	
	
	

}
