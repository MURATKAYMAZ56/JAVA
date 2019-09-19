package main;

import model.Point;
import model.Rectangle;

public class GeometryLauncher {
	public static void main(String[] args) {

	Point myPoint=new Point(3,7);
	//myPoint.printCoordinates();
	
		//Rectangle rec= new Rectangle(13,8,new Point(5,8));
		rec.getCircumferenceRectangle();
		//System.out.println("Een rechthoek van"+rec.);
		Rectangle recDefault= new Rectangle(4,6);
		Rectangle rec2=new Rectangle(8,9,new Point(3,-2));
		
		System.out.println("deafult rect"+recDefault);
		System.out.println(rec2);
		
  
  
  
	}
}
