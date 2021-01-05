package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y;
	double notSet = Double.NaN;

	
	public Coordinate() {
		this.x = notSet;
		this.y = notSet;
	}
	
	public Coordinate(double X, double Y) {
		this.x = X;
		this.y = Y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public boolean isEmpty() {
		return Double.isNaN(x) || Double.isNaN(y);
	}

}
