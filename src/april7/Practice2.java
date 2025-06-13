package april7;

public class Practice2 extends Practice {
	private String course;
	
	Practice2(){
		
	}
	
	Practice2(int id,String name,String course){
		super(id,name);
//		this.id = id;
//		this.name = name;
		this.course = course;
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
