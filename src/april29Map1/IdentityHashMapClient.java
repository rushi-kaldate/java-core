package april29Map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class IdentityHashMapClient {
	public static void main(String[] args) {

//		IdenttityHashMapProduct p1 = new IdenttityHashMapProduct(1,"pen",15,"statonary");
//		IdenttityHashMapProduct p2 = new IdenttityHashMapProduct(2,"pencil",10,"statonary");
//		IdenttityHashMapProduct p3 = new IdenttityHashMapProduct(3,"notebook",80,"statonary");
//		IdenttityHashMapProduct p4 = new IdenttityHashMapProduct(4,"book",2330,"statonary");
//		IdenttityHashMapProduct p5 = new IdenttityHashMapProduct(5,"bag",2220,"statonary");
//		IdenttityHashMapProduct p6 = new IdenttityHashMapProduct(6,"ruber",20,"statonary");

		//IdentityHashMap<Integer, IdenttityHashMapProduct> idhm = new IdentityHashMap<>();
//		idhm.put(1, p1);
//		idhm.put(2, p2);
//		idhm.put(3, p3);

		//idhm.forEach((x,y) -> System.out.println(x+ " " +y));
		
//		IdentityHashMap<String, String> map = new IdentityHashMap<>();
//		
//		String k1 = new String("Java");
//		String k2 = new String("Java ");
//		
//		map.put(k1, "Language");
//		map.put(k2, "Programming");
//		
//		System.out.println(map);
		
		IdentityHashMap<String, String> map = new IdentityHashMap<>();
		
		map.put("hii", "Bye");
		map.put("Good", "Morning");
		
		//System.out.println(map);
//		map.clear();
//		System.out.println("all celar data"+map);
		
		IdentityHashMap<String, Integer> map1 = new IdentityHashMap<>();
		//Set<Integer> s= new HashSet<>();
		map1.put("rushi",10);
		map1.put("Ram",20);
		map1.put("Sita",30);
		map1.put("Gita",40);

		IdentityHashMap<Integer, String> map2 = new IdentityHashMap<>();
		map2.put( 80,"Vivek");
		map2.put(89,"Ishwar");
		map2.put(20,"Ram");
		map2.put(30,"Sita");
		map2.put(40,"Gita");

		System.out.println(map.size());
		System.out.println(" Size of Entrys : "+ map);

		System.out.println(map.values());
		System.out.println(map.containsKey("Ram"));

		System.out.println(map.containsValue(100));

		map.keySet();
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());

		System.out.println(map.remove("Ram", 40));

		System.out.println(map1.getOrDefault("hii",0));

		System.out.println(map1.replace("Ram", 40)); 

		//print the statement
		map.forEach((x,y) -> System.out.println(x +" " + y));



		//entry, getKey, getValue, iterate
		Set<Entry<Integer,String>> a = map2.entrySet();
		for(Entry<Integer,String> b : a)
			System.out.println(b);
		
		


		System.out.println("Print the value: "+map);

		System.out.println("The value are insert: "+map.get(20));

		map.forEach((x,y) -> System.out.println(x+ " "+y));
		System.out.println(map.size());

		System.out.println(map.containsKey("rushi"));
		System.out.println(map.containsValue(10));

		System.out.println(map.isEmpty());

		System.out.println(map.get("rushi"));

		System.out.println(map.remove("rushi", 10));
		System.out.println(map);

		System.out.println(map.values());
		System.out.println(map1.replace("rushi", 10, 24));
		System.out.println(map1.replace("rushi", 24));
		System.out.println(map);

		System.out.println(map1.getOrDefault("hii", 50));
		System.out.println(map);

		map.putAll(map);
		System.out.println(map);

		Collection<Integer> values = map1.values();
		System.out.println(values);

		Collection<String> e = map2.values();
		for(String t : e)
			System.out.println(t);


		Set<Integer> keys = map2.keySet();
		for(Integer t : keys)
			System.out.println(t);

		Set<Entry<Integer, String>> key = map2.entrySet();
		for(Entry<Integer, String> c : key)
			System.out.println(c);	

		System.out.println("-------------------------");

		Set<Entry<String, Integer>> key1 = map1.entrySet();
		for(Entry<String, Integer> t : key1)
			System.out.println(t);

		
	    
		
		


	}

}
