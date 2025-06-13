package april16exception1;

public abstract class Account {
	private int id;
	private String name;
	private double bal;
	
	public void credit(double amount) {
		bal = bal + amount;
	}
	
	abstract void debit(double amount);
	
	public void checkbal() {
		System.out.println(name+ " " +bal);
	}
	
	public Account() {
		
	}

	public Account(String name, double bal) {
		super();
		this.name = name;
		this.bal = bal;
	}

	public Account(int id, String name, double bal) {
		super();
		this.id = id;
		this.name = name;
		this.bal = bal;
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

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", bal=" + bal + "]";
	}
	
	
	

}
