package april24Collection1;

public class AListProduct implements Comparable<AListProduct>{

	private int id;
	private String name;
	private double price;
	private String category;

	public AListProduct() {

	}

	public AListProduct(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public AListProduct(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	public int compareTo(AListProduct o) {
		Integer i1 = this.id;
		Integer i2 = o.getId();
		return i1.compareTo(i2);
	}
}

