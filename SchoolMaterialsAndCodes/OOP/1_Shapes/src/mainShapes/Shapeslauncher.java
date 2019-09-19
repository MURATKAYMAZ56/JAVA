package mainShapes;

import shapes.Circle;
import shapes.Punt;
import shapes.RechtHook;

public class Shapeslauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle myFirstCircle=new Circle();
		System.out.println("Area of Circle 1 is : "+myFirstCircle.getArea());
		
		Circle secondCircle= new Circle(8);
		System.out.println("Area of Circle 2 is : "+secondCircle.getArea());
		secondCircle.printMezelf();
		
		
		//Maak een object van het type rechthoek met behulp van de default constructor.
		RechtHook desiredRechtHook=new RechtHook();
		System.out.println("default rectangle ->"+"width is "+desiredRechtHook.width+" height is"+desiredRechtHook.height);
		//Maak een object van het type rechthoek met breedte 13 en hoogte 9.
		RechtHook desiredRechtHookWithGivenInputs=new RechtHook(13,9);
		System.out.println("desiredRechtHookWithGivenInputs width is "+desiredRechtHookWithGivenInputs.width+" desiredRechtHookWithGivenInputs height is "+desiredRechtHookWithGivenInputs.height);
		//Maak een object van het type rechthoek met linkerbovenhoek (5, 8) van 7 bij 4.
		RechtHook RecWithGivenHeightWeightAndPoint= new RechtHook(7,4,5,8);
		System.out.println("the Rectangle -> by point "+" ("+RecWithGivenHeightWeightAndPoint.upperLeftCornerX+","+RecWithGivenHeightWeightAndPoint.upperLeftCornerY+")"
		+" width "+RecWithGivenHeightWeightAndPoint.width
		+" height "+RecWithGivenHeightWeightAndPoint.height);
		
		//Print voor elk object de oppervlakte en de omtrek:
		//Een rechthoek van 2 bij 1 heeft een oppervlakte van 2 en een omtrek van 6.
		System.out.println("Een RechtHook with 2 by 1 ->\nthe area is : "+desiredRechtHook.getArea()+"\nthe perimeter is : "+desiredRechtHook.getPerimeter());
	     
		
		Punt myPunt=new Punt(3,8);
		System.out.println("X is :"+myPunt.getCoordinateX());
		myPunt.setCoordinateX(27);
		System.out.println("new X is :"+myPunt.getCoordinateX());
		Circle nogEenCircle=new Circle(5,myPunt);
		nogEenCircle.printMezelf();
		Circle laatsteCircle=new Circle(14,new Punt(5.3,6.2));
		laatsteCircle.printMezelf();
		
		
	}

}
