package april3;

public class Client {
	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		
//		Student s3 = new Student(45,"Rushi","Java");
//		
//		System.out.println(s1.id+" "+s1.name+" "+s1.course);
//		System.out.println(s2.id+" "+s2.name+" "+s2.course);
//		System.out.println(s3.id+" "+s3.name+" "+s3.course);
		
		Student s1 = new Student(36,"Rushi","Java");
		System.out.println(s1.id+" "+s1.name+" "+s1.course);
		
		Student s2 = new Student();
		System.out.println(s2.id+" "+s2.name+" "+s2.course);
		
		Student s3 = new Student(36,"Rushi");
		System.out.println(s3.id+" "+s3.name+" "+s3.course);
		
		

	}

}
