package nl.hva.miw.ds.manhattown;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	List<Character> list = new ArrayList<>();
	
	public void push( Character c  ) {
		list.add(c);
	}

	public Character pop() {
		
		if ( list.isEmpty() ) return null;
		
		return list.remove( list.size() -1 );
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}