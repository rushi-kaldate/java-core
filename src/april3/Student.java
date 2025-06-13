package april3;

public class Student {
	int id;
	String name;
	String course;

    //no args Constructor
	public Student(){
		super();

	}

	//parameter constructor
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	

}
