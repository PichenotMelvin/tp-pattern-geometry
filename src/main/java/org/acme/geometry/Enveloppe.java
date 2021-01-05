package org.acme.geometry;

public class Enveloppe {
	
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Enveloppe() {
		this.bottomLeft = new Coordinate();
		this.topRight = new Coordinate();
	}
	
	public Enveloppe(Coordinate bottomleft, Coordinate topright) {
		assert(bottomLeft != null && topright != null);
		this.bottomLeft = bottomleft;
		this.topRight = topright;
	}
	
	public boolean isEmpty() {
		return bottomLeft.isEmpty() || topRight.isEmpty();
		
	}
	
	public double getXmin() {
		return bottomLeft.getX();
	}
	
	public double getXmax() {
		return topRight.getX();
	}
	
	public double getYmin() {
		return bottomLeft.getY();
	}
	
	public double getYmax() {
		return topRight.getY();
	}
}
