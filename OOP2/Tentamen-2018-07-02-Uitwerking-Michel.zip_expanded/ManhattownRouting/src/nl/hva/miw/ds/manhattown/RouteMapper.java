package nl.hva.miw.ds.manhattown;

import java.util.HashMap;
import java.util.Map;

public class RouteMapper {
	
	private Map<String, Integer> map = new HashMap<>();
	
	
	public void add( Route r ) {
		
		Integer cnt =  map.get( r.getRoute() );
		
		if ( cnt == null ) {
			map.put( r.getRoute(), 1);
		} else {
			map.put( r.getRoute(), cnt + 1);
		}
	}
	
	public void printMap() {
		for ( String s : map.keySet() ) {
			int cnt = map.get(s);
			
			System.out.println("Route " + s + " Count " + cnt);
		}
	}
	
	public static void main(String[] args) {
		RouteMapper map = new RouteMapper();
		Route r = new Route( 3,3);
		
		for ( int i=0; i<100; i++ ) {
			r.makeRandomRoute();
			
			map.add( r );
		}
		
		map.printMap();
	}
	
}
