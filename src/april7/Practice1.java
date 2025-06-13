package april7;

public class Practice1 {
	public static void main(String[] args) {
//		Practice p1 = new Practice();
//		
//		System.out.println(p1.toString());
//		System.out.println(p1.hashCode());
//		System.out.println(p1.getClass().getName());
		
		Practice2 p1 = new Practice2(100,"Rushi","java");
		Practice2 p2 = new Practice2(101,"Ram","Python");
		System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getCourse());
		System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getCourse());
	}

}
