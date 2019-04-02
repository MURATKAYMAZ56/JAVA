package geometry;

public class Punt {
	private int coordinateX;

	private int coordinateY;
public Punt() {
	this.coordinateX=0;
	this.coordinateY=0;
}
	public Punt(int i, int y) {
		this.coordinateX = i;
		this.coordinateY = y;
	}

//	public Punt(int i, int y) {
//		// TODO Auto-generated constructor stub
//	}

	public int getX() {
		return coordinateX;
	}

	public int getY() {
		return coordinateY;
	}
}
