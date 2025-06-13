package april29Map1;

import java.util.WeakHashMap;

public class Client {
	public static void main(String[] args) {
		
		Person person1 = new Person(1,"ram");
		Passport passport1 = new Passport(1,"Indian");
		
		Person person2 = new Person(2,"sam");
		Passport passport2 = new Passport(2,"Indian");
		
		Person person3 = new Person(3,"rushi");
		Passport passport3 = new Passport(3,"Indian");
		
		WeakHashMap<Person, Passport> map = new WeakHashMap<>();
		map.put(person1, passport1);
		map.put(person2, passport2);
		map.put(person3, passport3);
		
		person2 = null;
		person3 = null;
		
		System.gc();
		map.forEach((x,y) -> System.out.println(x+ " " +y));
		
	}

}
