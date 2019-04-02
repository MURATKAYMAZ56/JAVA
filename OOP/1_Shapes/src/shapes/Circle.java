package shapes;

public class Circle {

	private double radius;
	private Punt middelpunt;
	
	private final static double DEFAULT_RADIUS=1.0;
	
	
	public Circle() {
		this(DEFAULT_RADIUS);
		/*
		radius=1;
		this.centerX= 0;
		this.centerY=0;
		*/
	}
	
	public Circle(double radius) {
		this(radius,new Punt());
// or
//		this.radius=radius;
//		this.centerX= 0;
//		this.centerY=0;
		
	}
	public Circle(double radius,Punt middelpunt) {
		this.radius=radius;
		this.middelpunt=middelpunt;
		
		
	}
	
	
	public double getArea() {
		return Math.PI*radius*radius;
		
	}
	public void printMezelf() {
		System.out.printf("Circle met radius %.2f en middelpunt (%.2f,%.2f)",this.radius,this.middelpunt.getCoordinateX(),this.middelpunt.getCoordinateY());
	}

}
