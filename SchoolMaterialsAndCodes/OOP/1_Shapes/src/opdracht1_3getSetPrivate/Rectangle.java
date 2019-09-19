package opdracht1_3getSetPrivate;

import shapes.Punt;

public class Rectangle {

	private double width;
	private double height;
	private  Punt upperLeftCorner;
	
	public Rectangle() {
		//this(2,1,0);
	}
	public Rectangle(double width,double height) {
		this(width,height, new Punt());
		
	}
	public Rectangle(double width,double height,Punt upperLeftCorner) {
		
		this.width=width;
		this.height=height;
		this.upperLeftCorner=upperLeftCorner;
		
		
	}
	public  double getArea() {
		return width*height;
	}
	public  double getPerimeter() {
		return 2*(width+height);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public  Punt getUpperLeftCorner() {
		return upperLeftCorner;
	}
	public void setUpperLeftCorner(Punt upperLeftCorner) {
		this.upperLeftCorner = upperLeftCorner;
	}
	public void printRectangle() {
		System.out.println();
	}
	
	
	
}
