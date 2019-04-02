package model;

import java.util.Random;

public class Route {
//	Create a Route class, a route can be drawn up based on it
//	number of Avenues and the number of Streets. The constructor process this find and set one
//	array of characters ready to create a route.
//	Write a method makeRandomRoute (), which creates a possible route as in the
//	introduction.
//	Test works in the main class of your method.
	private int numOfavenue;
	private int numOfStreet;
	private String[] routeArray;
	private int routeLength;

	public Route(int aveneu, int street) {
		this.numOfavenue = aveneu;
		this.numOfStreet = street;
		this.routeLength = this.numOfavenue + this.numOfStreet;
		routeArray = new String[routeLength];

	}

	public void generateRouteArray() {
		for (int i = 0; i < numOfavenue; i++) {
			routeArray[i] = "A";
		}
		for (int i = numOfavenue; i < routeLength; i++) {
			routeArray[i] = "S";
		}
//	for(int i=0;i<routeLength;i++) {
//		System.out.print(routeArray[i]);;
//	}

	}

	/*
	 * Assignment b. (5 points) Explain the time complexity of the makeRandomRoute
	 * () method and give the big O notation of it.
	 */
	
	/*
	 * string[] Titles = { "Excellent", "Good", "Super", "REALLY GOOD DOCTOR!", "THANK YOU!", "THE BEST", "EXCELLENT PHYSICIAN", "EXCELLENT DOCTOR" };

	comments_title.Value=Titles[new Random().Next(0,Titles.Length) ] ;*/

	public String makeRandomRoute() {
		// String st.Value=routeArray[new Random().Next(0,routeArray.length) ] ;
		StringBuilder sb = new StringBuilder();
		while (routeLength-- != 0) {
			int character = (int) (Math.random() * routeArray.length);
			sb = sb.append(routeArray[character]);
			// builder.append(routeArray.toString().charAt(character));
		}
		return sb.toString();

	}

}
