package hashMap;

import java.util.HashMap;

public class CheckingKeyAndValueExistance {
	
	//to check whether key or value exist or not  use containskey() and containsValue()

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "one");
		map.put(2, "two");
		map.put(3, "three");
		
		System.out.println(existKey("1",map));
		System.out.println(existKey("4",map));
		
		System.out.println(existValue("three",map));
		System.out.println(existValue("four",map));
		
		
	}

	/// key exits ile alakali methodolusturmak istedim fakat arg key type nasil
	/// olacak?
//	public <T> void keyExist(<T> key) {
//		
//	}

	public static boolean existKey(String key, HashMap map) {
		return map.containsKey(key);

	}
	public static boolean existValue(String value, HashMap map) {
		return map.containsValue(value);

	}

}
