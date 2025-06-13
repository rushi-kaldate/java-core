package april4;

import java.util.ArrayList;

public class C1 {
	public static void main(String[] args) {
		P1 x = new P1(1,"Rushi",200);
		P1 y = new P1(2,"Ram",300);
		P1 z= new P1(3,"Sita",400);
		P1 q = new P1(4,"gita",500);

		ArrayList<P1> plist = new ArrayList<P1>();
		
		plist.add(x);
		plist.add(y);
		plist.add(z);
		plist.add(q);
		
		x.setId(-90);
		x.setId(100);
		
		for(P1 m : plist)
			System.out.println(m.getId()+" "+m.getName()+" "+m.getPrice());
		
		
	}

}
