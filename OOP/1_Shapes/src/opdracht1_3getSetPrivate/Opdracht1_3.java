package opdracht1_3getSetPrivate;

import shapes.Punt;

/*
 * The purpose of this assignment is to adjust the Rectangle class. 
 * The class must use  of encapsulation. 
 * The attributes must be private and accessible only through get and set methods.
 * Furthermore, the class uses the existing class Point for determining the position,
 * i.e. the upper left corner. Finally, the constructors use constructor chaining.
 * */

/*Change the class Rectangle you created in assignment 1.1:
a. Replace the upperLeftCornerX and upperLeftCornerY attributes with one attribute
upperLeftCorner type Point.
b. Make all attributes private and create a get and a set method for each attribute.
c. Modify the constructors using constructor chaining and care for
adaptation to the new attribute.
d. For advanced users: Change the containsPoint (double pointX, double pointY) into one
containsPoint (Point point) method.

*/
/*2. Test the class by doing the following in the main method:
a. Create an object of the type point with coordinates (5,8).
b. Create a rectangle using the default constructor.
c. Create an object of the type rectangle with width 13 and height 9.
d. Create an object of the rectangle type with top left corner the point of assignment 2a with
dimensions 7 by 4.
e. Print out the information of each object:
Rectangle 1 is a rectangle of 2 by 1 with upper left corner (0,0).
f. Print the area and perimeter for each object:
A rectangle of 2 by 1 has an area of ​​2 and a circumference
of 6.
g. Create an object point with coordinates (6, -5).
h. For advanced users: Check for each object if the point (6, -5) is in the rectangle.
Rectangle 1 contains point (6, -5): false
*/
public class Opdracht1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle myRec = new Rectangle();
		myRec.setWidth(13);
		myRec.setHeight(9);
		myRec.setUpperLeftCorner(new Punt(5, 8));

		System.out.println("width is: " + myRec.getWidth() + " height is : " + myRec.getHeight());
		System.out.println("the point is "+"("+myRec.getUpperLeftCorner().getCoordinateX()+" ,"
		+myRec.getUpperLeftCorner().getCoordinateY()+" )");
		
		Rectangle myRec2= new Rectangle(4,5,new Punt(3,2));
		System.out.println("myRec2 is ");
		

	}

}
