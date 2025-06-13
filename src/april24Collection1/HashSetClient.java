package april24Collection1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashSetClient {
	public static void main(String[] args) {
		HashSetProduct p1 = new HashSetProduct(1,"pen",15,"statonary");
		HashSetProduct p2 = new HashSetProduct(2,"pencil",10,"statonary");
		HashSetProduct p3 = new HashSetProduct(3,"notebook",80,"statonary");
		HashSetProduct p4 = new HashSetProduct(4,"book",2330,"statonary");
		HashSetProduct p5 = new HashSetProduct(5,"bag",2220,"statonary");
		HashSetProduct p6 = new HashSetProduct(6,"ruber",20,"statonary");

		HashSet<HashSetProduct> list = new HashSet<>();

		//add of elements in the object of list
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);

		//allow the null in multiple
				list.add(p4);
				list.add(p5);
				list.add(p6);
				list.add(null);

		//check the size  of no elements in list
		System.out.println("Size : "+ list.size());

		//get the methods in specified index
		//System.out.println(list.get(8));

		//clear methods 
		//list.clear();

		//print the statement
		list.stream().forEach(Product1 -> System.out.println(Product1));

		//contains the methods in true or false
		//System.out.println(list.contains(p6));

		//isEmpty methods
		//System.out.println(list.isEmpty());

		//listIterator
//		ListIterator<HashSetProduct> ite = list.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
	}
}