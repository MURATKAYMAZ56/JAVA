package model;

public class Rectangle {
	private float width = 2;
	private float height = 1;
	private Point upperLeftCorner;

	public Rectangle() {
		this(2, 1);

	}

	public Rectangle(float width, float height) {
		this(width, height, new Point());
	}

	public Rectangle(float width, float height, Point upperLeftCorner) {

		this.width = width;
		this.height = height;
		this.upperLeftCorner = upperLeftCorner;
		
	}
	

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Point getUpperLeftCorner() {
		return upperLeftCorner;
	}

	public void setUpperLeftCorner(Point upperLeftCorner) {
		this.upperLeftCorner = upperLeftCorner;
	}

	public float getRectangleArea() {

		return 2 * height * width;
	}

	public float getCircumferenceRectangle() {
		return 2*(width+height);
	}

	@Override
	public String toString() {
		
		return //"Rectangle [width=" + width + ", height=" + height + ", upperLeftCorner=" + upperLeftCorner + "]";
				String.format("Een rechthoek van %.2f by %.2f met  linkerbovenhoek(leftuppercorner) %s ",this.width,this.height,this.upperLeftCorner);
				
	}
	

}
