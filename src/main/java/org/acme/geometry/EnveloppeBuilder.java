package org.acme.geometry;

import java.util.ArrayList;

public class EnveloppeBuilder {
	
	private ArrayList<Point> listPoints;
	
	public EnveloppeBuilder() {
		this.listPoints = new ArrayList<Point>();
	}
	
	public void insert(Coordinate coordinate) {
		listPoints.add(new Point(coordinate));
	}
	
	public Enveloppe build() {
		
		LineString linestrg = new LineString(listPoints);
		if(linestrg.getNumPoints() < 2) {
			return new Enveloppe();
		}
		else {
			Coordinate bottomLeft = linestrg.getPointN(0).getCoordinate();
			Coordinate topRight =  linestrg.getPointN(0).getCoordinate();
			
			for(int i = 1 ; i < linestrg.getNumPoints(); i++) {
				double Xi = linestrg.getPointN(i).getCoordinate().getX();
				double Yi = linestrg.getPointN(i).getCoordinate().getY();
				
				if(Xi < bottomLeft.getX() && Yi< bottomLeft.getY()){
					bottomLeft = new Coordinate(Xi, Yi);
				}
				if(Xi > bottomLeft.getX() && Yi > bottomLeft.getY()) {
					topRight = new Coordinate(Xi, Yi);
				}
			}
			return new Enveloppe(bottomLeft, topRight);
		}

	}

	public ArrayList<Point> getListPoints() {
		return listPoints;
	}

	public void setListPoints(ArrayList<Point> listPoints) {
		this.listPoints = listPoints;
	}
	

}
