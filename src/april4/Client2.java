package april4;

import java.util.ArrayList;

public class Client2 {
	public static void main(String[] args) {
		
		Employee c1 = new Employee(1,"rushi","java",20000);
		Employee c2 = new Employee(2,"Ram","Sql",30000);
		Employee c3 = new Employee(3,"Sam","C++",40000);
		Employee c4 = new Employee(4,"Sita","python",50000);
		
		ArrayList<Employee> plist = new ArrayList<Employee>();
		plist.add(c1);
		plist.add(c2);
		plist.add(c3);
		plist.add(c4);
		
		c1.setId(11);
		c2.setId(12);
		
		for(Employee t : plist)
			System.out.println(t.getId()+" "+t.getName()+" "+t.getDept()+" "+t.getSalary());
	}

}
