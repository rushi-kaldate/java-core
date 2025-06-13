package april24Collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LALClient {
	public static void main(String[] args) {
		LALProduct p1 = new LALProduct(1,"pen",15,"statonary");
		LALProduct p2 = new LALProduct(2,"pencil",10,"statonary");
		LALProduct p3 = new LALProduct(3,"notebook",80,"statonary");
		LALProduct p4 = new LALProduct(4,"book",2330,"statonary");
		LALProduct p5 = new LALProduct(5,"bag",2220,"statonary");
		LALProduct p6 = new LALProduct(6,"ruber",20,"statonary");

		LinkedList<LALProduct> list = new LinkedList<>();

		//add of elements in the object of list
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);

		//allow the null in multiple
		//		list.add(p4);
		//		list.add(p5);
		//		list.add(p6);

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
		
		//remove the methods
		//System.out.println(list.remove(p5));

		//listIterator
//		ListIterator<LALProduct> ite = (ListIterator<LALProduct>) list.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		
		//iterator
		Iterator<LALProduct> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
