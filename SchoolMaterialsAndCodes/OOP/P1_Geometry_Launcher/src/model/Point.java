package model;

public class Point {

	private double coordinateX;
	private double coordinateY;

	public Point(double coordinateX, double coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public Point() {
		this(0, 0);
	}

	@Override
	public String toString() {
		return String.format("(%.2f,%.2f)",this.coordinateX,this.coordinateY);
				//"Point [coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + "]";
	}
	

}
