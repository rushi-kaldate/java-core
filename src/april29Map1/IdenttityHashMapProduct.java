package april29Map1;

public class IdenttityHashMapProduct {
	private int id;
	private String name;
	private Double price;
	private String catergery;
	
	
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


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getCatergery() {
		return catergery;
	}


	public void setCatergery(String catergery) {
		this.catergery = catergery;
	}


	public IdenttityHashMapProduct(int id, String name, double price, String catergery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.catergery = catergery;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", catergery=" + catergery + "]";
	}
	
	

}
