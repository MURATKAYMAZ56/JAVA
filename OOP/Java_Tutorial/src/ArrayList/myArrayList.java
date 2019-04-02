package ArrayList;

import java.util.ArrayList;

public class myArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myArr= new ArrayList<String>();
		myArr.add("Murat");
		myArr.add("metallica");
		System.out.println(myArr.get(0));
		System.out.println("array in uzunlugu= "+myArr.size());
		System.out.println("index of metalica is  "+ myArr.indexOf("metallica"));

	}

}
  