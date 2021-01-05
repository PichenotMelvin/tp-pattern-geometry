package org.acme.geometry;

public class Point extends AbstractGeometry{
	
	private Coordinate coordinate;
	public static final String TYPE = "POINT";

	public Point() {
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
		this.setCoordinate(coordinate);
	}
	
	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public Enveloppe getEnveloppe() {
		return new Enveloppe(this.getCoordinate(), this.getCoordinate());
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public void translate(double dx, double dy) {
		this.coordinate = new Coordinate(
				this.coordinate.getX() + dx,
				this.coordinate.getY() + dy);
		triggerChange();
		
	}
	
	public boolean isEmpty() {
		if(Double.isNaN(this.getCoordinate().getX()) || Double.isNaN(this.getCoordinate().getY())){
			return true;
		}
		else {
			return false; 
		}
	}
	
	@Override
	public Point clone() {
		return new Point(coordinate);
	}

	
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);		
	}

	@Override
	public void addLister(GeometryListener listener) {
		// TODO Auto-generated method stub
		
	}

}
