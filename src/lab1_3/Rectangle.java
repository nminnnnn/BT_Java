package lab1_3;

public class Rectangle {
	private float length = 1f ;
	private float width = 1f ;
	
	public Rectangle() {
//		float length = 1f;
//		float width = 1f;
	
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
		
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2 * (length + width);
	}
	public String toString() {
		return "Rectangle[length = "+ length + ", width = " + width;
	}
}
