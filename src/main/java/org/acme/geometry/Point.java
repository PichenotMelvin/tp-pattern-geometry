package org.acme.geometry;

public class Point implements Geometry{
	private Coordinate coordinate;
	public static final String TYPE = "Point";


	public Point() {
		this.setCoordinate(new Coordinate());
	}
	
	public Point(Coordinate coordinate) {
		this.setCoordinate(coordinate);
	}
	@Override
	public String getType() {
		return "I'm a Point !";
	}
	
	@Override
    public boolean isEmpty() {
        if ( Double.isNaN(this.getCoordinate().getX()) || Double.isNaN(this.getCoordinate().getY())) {
            return true;
        }
        else return false;
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
		
	}

}
