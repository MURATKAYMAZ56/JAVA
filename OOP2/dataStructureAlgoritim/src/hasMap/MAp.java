package hasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MAp {
	/*
	 * https://www.javatpoint.com/java-map click to see
	 * 
	 * HashMap is the implementation of Map, but it doesn't maintain any order. 
	 * LinkedHashMap is the implementation of Map. It inherits  HashMap class. It maintains insertion order. 
	 * TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
	 */
	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("e", 400);
		//map does not let dublicate key exp hm.put("d", 500); will rewrite d:500

// Returns Set view      
		Set<Map.Entry<String, Integer>> st = hm.entrySet();
//Set keySet()	It returns the Set view containing all the keys.
//Set<Map.Entry<K,V>> entrySet()	It returns the Set view containing all the keys and values.
		for (Map.Entry<String, Integer> me : st) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
}
