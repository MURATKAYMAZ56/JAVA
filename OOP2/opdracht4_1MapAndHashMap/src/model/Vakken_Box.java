package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Vakken_Box {
//	public Vakken_Box() {
//		
//	}
	Scanner reader;
	Map<String, Integer> hm;
	{

		try {
			reader = new Scanner(new File("src/model/vakcodes.txt"));

		} catch (FileNotFoundException s) {
			System.out.println("File does Not Exist Please Try Again: ");
		}

		hm = new HashMap<String, Integer>();
		while (reader.hasNext()) {
			String course = reader.next();
			int nr = reader.nextInt();

			hm.put(course, nr);
		}

//		Set<Map.Entry<String, Integer>> st = hm.entrySet();
//		for (Map.Entry<String, Integer> me : st) {
//			System.out.print(me.getKey() + ":");
//			System.out.println(me.getValue());
	//	}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Set<Map.Entry<String, Integer>> st = hm.entrySet();
		for (Map.Entry<String, Integer> me : st) {
			sb = sb.append(me.getKey() + " ");
			sb = sb.append(me.getValue() + " ");
			System.out.println(sb);

		}
		return sb.toString();
	}
}
