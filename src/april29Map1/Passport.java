package april29Map1;

public class Passport {
	private int id;
	private String name;
	
	public Passport() {
		
	}

	public Passport(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + "]";
	}
	

}
