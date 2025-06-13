package april24Collection1;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VecClient1 {
	public static void main(String[] args) {
		VecProduct1 p1 = new VecProduct1(1,"pen",15,"statonary");
		VecProduct1 p2 = new VecProduct1(2,"pencil",10,"statonary");
		VecProduct1 p3 = new VecProduct1(3,"notebook",80,"statonary");
		VecProduct1 p4 = new VecProduct1(4,"book",2330,"statonary");
		VecProduct1 p5 = new VecProduct1(5,"bag",2220,"statonary");
		VecProduct1 p6 = new VecProduct1(6,"ruber",20,"statonary");
		
		Vector<VecProduct1> list = new Vector<>();
		
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
		//System.out.println("Size : "+ list.size());
		
		//get the methods in specified index
		//System.out.println(list.get(8));
		
		//clear methods 
		//list.clear();
		
		//print the statement
		//list.stream().forEach(Product1 -> System.out.println(Product1));
		
		//contains the methods in true or false
		//System.out.println(list.contains(p6));
		
		//isEmpty methods
		//System.out.println(list.isEmpty());
		
		//remove methods
		//System.out.println(list.remove(p6));
		
		//listIterator
//		ListIterator<VecProduct1> ite = list.listIterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		Iterator<VecProduct1> tir = list.iterator();
		while(tir.hasNext())
			System.out.println(tir.next());

	}
}
