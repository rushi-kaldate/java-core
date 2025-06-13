package april3;

public class Employee extends Person {
	int eid;
	double salary;
	
	public Employee() {
		System.out.println("Emp Constructor");
	}

//	public Employee(int eid, double salary) {
//		super();
//		this.eid = eid;
//		this.salary = salary;
//	}
//	public Employee(int id, String name,int eid, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.eid = eid;
//		this.salary = salary;
	
	public Employee(int id, String name,int eid, double salary) {
		super(id,name);
		this.eid = eid;
		this.salary = salary;
	
	
	}
}
