package april2;

import java.util.ArrayList;

public class Practice1 {
	public static void main(String[] args) {
		Practice p1 = new Practice();
		p1.id = 100;
		p1.name = "Pencil";
		p1.price = 100;

		Practice p2 = new Practice();
		p2.id = 101;
		p2.name = "notebook";
		p2.price = 90;

		//		System.out.println(p1.id+ " "+p1.name+" "+p1.price);
		//		System.out.println(p2.id+ " "+p2.name+" "+p2.price);

		Practice p3 = new Practice();
		p3.id = 102;
		p3.name = "book";
		p3.price = 97;

		Practice p4 = new Practice();
		p4.id = 103;
		p4.name = "pen";
		p4.price = 900;

		ArrayList<Practice> productlist = new ArrayList<>();
		productlist.add(p1);
		productlist.add(p2);
		productlist.add(p3);
		productlist.add(p4);

		//		for(Practice t : productlist) {
		//			System.out.println(t);			
		//		}

		//		for(Practice t : productlist) {
		//			if(t.price<100) {
		//				System.out.println(t);
		//			}
		//		}

		//		for(Practice t : productlist) {
		//			if(t.price>100) {
		//				System.out.println(t);
		//			}
		//		}

		//		double total = 0.0;
		//		for(Practice t : productlist) {
		//			total = total + t.price;
		//			System.out.println("total no price :" + total);
		//		}

		//		for(Practice t : productlist) {
		//			if(t.price<100)
		//				System.out.println(t.name);
		//		}
	}

}
