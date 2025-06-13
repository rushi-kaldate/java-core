package april8;

public class B extends A {
	int id;
	String name;
	double price;
	String salary;
	
	public B(){
		
	}

	public B(int id,String name,double price,String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.price = price;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + ", price=" + price + ", salary=" + salary + "]";
	}
	
	
	
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(int id) {
//		this.id= id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public double getPrice() {
//		return price;
//	}
//	
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	public String getSalary() {
//		return salary;
//	}
//	
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
	
	
	
	
	
	
}
