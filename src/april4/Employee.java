package april4;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	
	public Employee() {
		
	}


	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		if(id<0)
			System.out.println("id cannot be negative");
		else
			this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary<20000)
			System.out.println("Minimum Salary is 20000");
		else
			this.salary = salary;
	}
	
	

}
