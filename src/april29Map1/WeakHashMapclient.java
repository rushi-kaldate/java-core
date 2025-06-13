package april29Map1;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class WeakHashMapclient {
	public static void main(String[] args) {

		//		WeakHashMap<String, String> map = new WeakHashMap<>();
		//		
		//		String k1 = new String("Java");
		//		String k2 = new String("Java");
		//		
		//		map.put(k1, "Language");
		//		map.put(k2, "Programming");

		//System.out.println(map);

		//		WeakHashMap<String, Integer> map1 = new WeakHashMap<>();
		//		//Set<Integer> s= new HashSet<>();
		//		map1.put("rushi",10);
		//		map1.put("Ram",20);
		//		map1.put("Sita",30);
		//		map1.put("Gita",40);

		WeakHashMap<Integer, String> map2 = new WeakHashMap<>();
		map2.put( 80,"Vivek");
		map2.put(89,"Ishwar");
		map2.put(20,"Ram");
		map2.put(30,"Sita");
		map2.put(40,"Gita");

		map2.remove(80);
		System.out.println(map2);
		//k2 = null;
		System.gc();
//		System.out.println(map);

		//		System.out.println(map.size());
		//		System.out.println(" Size of Entrys : "+ map);
		//
		//		System.out.println(map.values());
		//		System.out.println(map.containsKey("Ram"));
		//
		//		System.out.println(map.containsValue(100));
		//
		//		map.keySet();
		//		System.out.println(map);
		//		
		//		map.clear();
		//		System.out.println(map);
		//		System.out.println(map.isEmpty());
		//
		//		System.out.println(map.remove("Ram", 40));
		//
		//		System.out.println(map1.getOrDefault("hii",0));
		//
		//		System.out.println(map1.replace("Ram", 40)); 
		//
		//		//print the statement
		//		map.forEach((x,y) -> System.out.println(x +" " + y));
		//
		//
		//
		//		//entry, getKey, getValue, iterate
		//		Set<Entry<Integer,String>> a = map2.entrySet();
		//		for(Entry<Integer,String> b : a)
		//			System.out.println(b);
		//		
		//		
		//
		//
		//		System.out.println("Print the value: "+map);
		//
		//		System.out.println("The value are insert: "+map.get(20));
		//
		//		map.forEach((x,y) -> System.out.println(x+ " "+y));
		//		System.out.println(map.size());
		//
		//		System.out.println(map.containsKey("rushi"));
		//		System.out.println(map.containsValue(10));
		//
		//		System.out.println(map.isEmpty());
		//
		//		System.out.println(map.get("rushi"));
		//
		//		System.out.println(map.remove("rushi", 10));
		//		System.out.println(map);
		//
		//		System.out.println(map.values());
		//		System.out.println(map1.replace("rushi", 10, 24));
		//		System.out.println(map1.replace("rushi", 24));
		//		System.out.println(map);
		//
		//		System.out.println(map1.getOrDefault("hii", 50));
		//		System.out.println(map);
		//
		//		map.putAll(map);
		//		System.out.println(map);
		//
		//		Collection<Integer> values = map1.values();
		//		System.out.println(values);
		//
		//		Collection<String> e = map2.values();
		//		for(String t : e)
		//			System.out.println(t);
		//
		//
		//		Set<Integer> keys = map2.keySet();
		//		for(Integer t : keys)
		//			System.out.println(t);
		//
		//		Set<Entry<Integer, String>> key = map2.entrySet();
		//		for(Entry<Integer, String> c : key)
		//			System.out.println(c);	
		//
		//		System.out.println("-------------------------");
		//
		//		Set<Entry<String, Integer>> key1 = map1.entrySet();
		//		for(Entry<String, Integer> t : key1)
		//			System.out.println(t);
		//		
		//		Set<Entry<Integer, String>> key2 = map2.entrySet();
		//		for(Entry<Integer, String> d : key2)
		//		    System.out.println(d.getKey()+ " " +d.getValue());


	}

}
