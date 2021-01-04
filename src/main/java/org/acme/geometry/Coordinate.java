package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y;
	double notSet = Double.NaN;
	
	public Coordinate() {
		this.setX(notSet);
		this.setY(notSet);
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
	
	public boolean isEmpty() {
		if(!(Double.isNaN(this.getX()) && Double.isNaN(this.getY()))){
			return false;
		}
		else {
			return true; 
		}
	}

}
