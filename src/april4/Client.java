package april4;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		Person p1 = new Person(1,"Rushi",23);
		Person p2 = new Person(2,"Ram",22);
		Person p3 = new Person(3,"Sam",21);
		p1.setAge(-19);
		p1.setAge(-34);
		p1.setAge(35);
		
		p2.setId(10);
		p2.setId(11);
		p2.setId(12);
		
		p3.setName("Sita");
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		for(Person t : plist)
			System.out.println(t.getId()+" "+t.getName()+" "+t.getAge());
	}

}
