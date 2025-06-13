package april4;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0)
			System.out.println("Not the change age");
		else
			this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0)
			System.out.println("Not change in id");
		else
			this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {			
		this.name = name;
	}
	
	
}
