package shapes;

public class Punt {
private double coordinateX,coordinateY;





public Punt() {
	this(0,0);
}

public Punt(double coordinateX,double coordinateY) {
	this.coordinateX=coordinateX;
	this.coordinateY=coordinateY;
}

public double getCoordinateX() {
	return coordinateX;
}

public void setCoordinateX(double coordinateX) {
	this.coordinateX = coordinateX;
}

public double getCoordinateY() {
	return coordinateY;
}

public void setCoordinateY(double coordinateY) {
	this.coordinateY = coordinateY;
}
public String toString() {
	return String.format("(%.1f,%.1f)",this.coordinateX,this.coordinateY);
	
	
	//"("+this.coordinateX+" ,"+this.coordinateY+")";
}


}
