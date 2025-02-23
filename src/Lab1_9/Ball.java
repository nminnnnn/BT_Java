package Lab1_9;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float XDelta;
	private float YDelta;
	public Ball(float x, float y, int radius, float XDelta, float YDelta) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.XDelta = XDelta;
		this.YDelta = YDelta;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float getXDelta() {
		return XDelta;
	}
	public void setXDelta(float XDelta) {
		this.XDelta = XDelta;
	}
	public float getYDelta() {
		return YDelta;
	}
	public void setYDelta(float YDelta) {
		this.YDelta = YDelta;
	}
	public void move() {
		x += XDelta;
		y += YDelta;
	}
	public void reflectHorizontal() {
		// TODO Auto-generated method stub
		XDelta = - XDelta;

	}
	public void reflectVertical() {
		// TODO Auto-generated method stub
		YDelta = - YDelta;
	}
	@Override
	public String toString() {
		return "Ball[(" + x + ", " + y + "), speed=(" + XDelta + ", " + YDelta + ")]";
	}
	
}
