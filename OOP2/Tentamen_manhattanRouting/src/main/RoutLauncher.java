package main;

import model.Route;

public class RoutLauncher {

	public static void main(String[] args) {
		Route route= new Route(3,2);
		route.generateRouteArray();
//System.out.println("ss");
		
		System.out.println(route.makeRandomRoute());
	}

}
