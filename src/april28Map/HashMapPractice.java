package april28Map;

import java.text.CollationKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//Set<Integer> s= new HashSet<>();
		map.put("rushi",10);
		map.put("Ram",20);
		map.put("Sita",30);
		map.put("Gita",40);

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put( 80,"Vivek");
		map1.put(89,"Ishwar");
		map1.put(20,"Ram");
		map1.put(30,"Sita");
		map1.put(40,"Gita");

		//System.out.println(map.size());
		//System.out.println(" Size of Entrys : "+ map);

		//System.out.println(map.values());
		//System.out.println(map.containsKey("Ram"));

		//System.out.println(map.containsValue(100));

		//		s = map.keySet();
		//		System.out.println(s);
		//		map.clear();
		//		System.out.println(map);
		//		System.out.println(map.isEmpty());

		//System.out.println(map.remove("Ram", 40));

		//System.out.println(map.getOrDefault("hii",0));

		//System.out.println(map.replace("Ram", 40)); 

		//print the statement
		//map.forEach((x,y) -> System.out.println(x +" " + y));



		//entry, getKey, getValue, iterate
		//        for(Map.Entry<Integer, String> e : map.entrySet()) {
		//        	System.out.println(e.getKey()+ " " +e.getValue());
		//        }


		//System.out.println("Print the value: "+map);

		//System.out.println("The value are insert: "+map.get(20));

		//map.forEach((x,y) -> System.out.println(x+ " "+y));
		//System.out.println(map.size());

		//		System.out.println(map.containsKey("rushi"));
		//		System.out.println(map.containsValue(10));

		//System.out.println(map.isEmpty());

		//System.out.println(map.get("rushi"));

		//		System.out.println(map.remove("rushi", 10));
		//		System.out.println(map);

		//System.out.println(map.values());
		//System.out.println(map.replace("rushi", 10, 24));
		//		System.out.println(map.replace("rushi", 24));
		//		System.out.println(map);

		//		System.out.println(map.getOrDefault("hii", 50));
		//		System.out.println(map);

		//		map.putAll(map1);
		//		System.out.println("Merged map :"+ map);

		//		Collection<Integer> values = map1.values();
		//		System.out.println(values);
		
//		Collection<String> e = map1.values();
//		for(String t : e)
//			System.out.println(t);
		

//		Set<Integer> keys = map1.keySet();
//		for(Integer t : keys)
//		System.out.println(t);
		
//		Set<Entry<Integer, String>> key = map1.entrySet();
//		for(Entry<Integer, String> keys : key)
//			System.out.println(keys);	
		
//		System.out.println("-------------------------");
		
//		Set<Entry<String, Integer>> key1 = map.entrySet();
//		for(Entry<String, Integer> t : key1)
//			System.out.println(t);
		
		
	}

}
