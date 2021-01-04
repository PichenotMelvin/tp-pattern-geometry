package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y;
	
	public Coordinate() {
		this.setX(0.0);
		this.setY(0.0);
	}
	
	public Coordinate(double X, double Y) {
		this.setX(X);
		this.setY(Y);
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
