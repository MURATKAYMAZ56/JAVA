package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetSetWiewOfKeys {
	/*
	 * Get Set view of Keys from Java HashMap example This Java Example shows how to
	 * get a Set of keys contained in HashMap using keySet method of Java HashMap
	 * class.
	 */
	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		hMap.put(1, "firstvalue");
		hMap.put("second", "second Value");
		hMap.put(3, "third Value");

		/// to retrieve first value
		System.out.println("first value :" + hMap.get(1));

		Set ks = hMap.keySet();
		Iterator it = ks.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
