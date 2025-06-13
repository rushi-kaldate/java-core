package april7;

public class Practice{
	private int id;
	private String name;
	
	Practice(){
		
	}
	
	Practice(int id,String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
//		if(id<0)
//			System.out.println("id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
