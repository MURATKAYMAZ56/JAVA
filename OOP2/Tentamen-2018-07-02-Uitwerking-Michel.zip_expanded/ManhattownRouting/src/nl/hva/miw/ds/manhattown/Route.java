package nl.hva.miw.ds.manhattown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.events.Characters;

public class Route {
	
	private final static char AVENUE = 'A';
	private final static char STREET = 'S';

	private int nrOfAvenues = 0;
	private int nrOfStreets = 0;
	
	public String getRoute() {
		return route;
	}


	private Character[] routeList;
	private String route;

	
	public Route(int nrOfAvenues, int nrOfStreets) {
		super();
		this.nrOfAvenues = nrOfAvenues;
		this.nrOfStreets = nrOfStreets;
		
		routeList = new Character[ nrOfAvenues + nrOfStreets ];
		
		initializeRouteArray();
	}
	
	private void initializeRouteArray() {
		for (int i=0; i<nrOfAvenues; i++) {
			routeList[i] = AVENUE;
		}
		for (int i=0; i<nrOfStreets; i++) {
			routeList[ nrOfAvenues + i] = STREET;
		}
	}

	public void makeRandomRoute() {
		List<Character> l = Arrays.asList( routeList );

		Collections.shuffle( l );
		
		route = routeToString( l );
	}
	
	public String makeHomeRoute() {
		MyStack stack = new MyStack();
		
		for (int i=0; i<route.length(); i++ ) {
			stack.push( route.charAt( i ));
		}
		
		String result = "";
		while ( !stack.isEmpty() ) {
			result += stack.pop();
		}
		
		return result;
	}

	public void makeRandomRoute2() {
		List<Character> l = Arrays.asList( routeList );
		
		List<Character> l2 = new ArrayList<>();
		l2.addAll( l );
		
		String result = "";
		for ( int i=l2.size(); i>0 ; i-- ) {
			int index = (int)(Math.random() * i);
			
			result += l2.remove(index);
		}
		route = result;
	}

	private String routeToString(List<Character> routeList2) {
		String result = "";
		
		for ( Character s : routeList ) {
			result += s;
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "Route [route=" + route + "]";
	}
	

	public static void main(String[] args) {
		
		Route r = new Route( 6,3 );
		
		r.makeRandomRoute();
		System.out.println("Route: " + r);
		System.out.println("HomeRoute: " + r.makeHomeRoute());
		
		r.makeRandomRoute();
		System.out.println("Route: " + r);
		System.out.println("HomeRoute: " + r.makeHomeRoute());

		r.makeRandomRoute();
		System.out.println("Route: " + r);
		System.out.println("HomeRoute: " + r.makeHomeRoute());
	}
	
	
}
