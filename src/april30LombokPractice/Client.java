package april30LombokPractice;


//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Customer c = new Customer(1,"rushi","rushabhkaldate@gmail.com","8767751145");
		c.setId(45);
		System.out.println(c);
		
		Employee e = new Employee(1,"Rushi","Java");
		e.setId(2);
		System.out.println(e);
		
		Student s = new Student(1,"Ram",23,"26-7-2002");
		Student s1 = new Student(2,"SAM",22,"26-7-2002");
		Student s2 = new Student(3,"Sita",21,"26-7-2002");
		Student s3 = new Student(4,"Gita",20,"26-7-2002");
		s.setAge(23);
		s.setName("Rushi");
		//System.out.println(s);
		
		ArrayList<Student>arr = new ArrayList<>();
		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		List<Student> newStudent =new ArrayList<> (Arrays.asList(s1,s2,s3));
		arr.addAll(newStudent);
		System.out.println("New Students List:");
		for(Student p : newStudent)
			System.out.println(p);
		//System.out.println(s);
		
		for(Student t : arr)
			System.out.println(t);
	}

}
