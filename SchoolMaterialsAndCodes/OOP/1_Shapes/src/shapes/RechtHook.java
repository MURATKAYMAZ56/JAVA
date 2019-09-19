package shapes;

public class RechtHook {
	
	//Declareer de variabelen width, height, upperLeftCornerX, upperLeftCornerY.
	public double width, height;
	public int upperLeftCornerX, upperLeftCornerY;
	//public static final  double WIDTH=1;
	
	
	
	//Maak een default constructor Rectangle(), waarbij de rechthoek in (0,0) staat met zijden 2 bij 1.
public RechtHook() {
	this(2,1);
	
//	width=2;
//	height=1;
//	upperLeftCornerX=0;
//	upperLeftCornerY=0;
	
	
	
}

//Maak een constructor Rectangle(width, height), waarbij je de breedte en hoogte van een 
//rechthoek object kunt meegeven en waarbij de rechthoek in (0,0) staat.


public RechtHook(double width,double height){
	this(width,height,0,0);
	
//	this.width=width;
//	this.height=height;
//	upperLeftCornerX=0;
//	upperLeftCornerY=0;
	
}

//Maak een all-args constructor waarbij je aan alle attributen een waarde kunt meegeven.

public RechtHook(double width,double height,int upperLeftCornerX,int upperLeftCornerY){
	//this(width,height,0,0);
	this.width=width;
	this.height=height;
	this.upperLeftCornerX=upperLeftCornerX;
	this.upperLeftCornerY=upperLeftCornerY;
	
}
//Maak de methoden getArea(), getCircumference() die de oppervlakte en de omtrek van de
//rechthoek teruggeven op basis van de width en de height van een Rectangle object.

public  double getArea() {
	return width*height;
}
public  double getPerimeter() {
	return 2*(width+height);
}
//Voor gevorderden: Schrijf een methode containsPoint(pointX, pointY). De laatste methode
//geeft een boolean terug die aangeeft of het meegeven punt wel of niet in de rechthoek zit.

//For advanced users: Write a method containsPoint (pointX, pointY). The last method
//returns a boolean indicating whether or not the yield point is in the rectangle.
























}

