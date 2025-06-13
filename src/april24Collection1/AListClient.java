package april24Collection1;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class AListClient {
	public static void main(String[] args) {

		AListProduct p1 = new AListProduct(100,"Pen",20,"Stationary");
		AListProduct p2 = new AListProduct(101,"Pencil",10,"Stationary");
		AListProduct p3 = new AListProduct(102,"notebbok",50,"Stationary");
		AListProduct p4 = new AListProduct(103,"mouse",990,"Stationary");
		AListProduct p5 = new AListProduct(104,"bag",1000,"Stationary");
		AListProduct p6 = new AListProduct(105,"book",80,"Stationary");

		Vector<AListProduct> list = new Vector<>();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);

		//duplicate value allow
		//		list.add(p4);
		//		list.add(p5);
		//		list.add(p6);
		//		list.add(null);
		//		list.add(null);
		//		list.add(null);

		//		clear methods
//		list.clear();
//		System.out.println(list);
		
		//get methods
		//System.out.println(list.get(4));
		
		
		//System.out.println(list.isEmpty());

		//size the methods
		//System.out.println("size :"+ list.size());
		//print the statement
		//list.stream().forEach(s ->System.out.println(s));


		//list.forEach(System.out :: println);



		//remove the methods
		//System.out.println(list.remove(p4));

		//contains the methods
        System.out.println(list.contains(p2));
		
		//iterator
        Iterator<AListProduct> itr = list.iterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
        
        //ListIterator
        ListIterator<AListProduct> ite = list.listIterator();
        while(ite.hasNext())
        	System.out.println(ite.next());
			
//				for(AListProduct p :list)
//					System.out.println(p);

		//		for(int i=0; i<list.size();++i)
		//			System.out.println(list.get(i));




		//for loop
		//enhanced for
		//iterator
		//listiterator
	}

}
