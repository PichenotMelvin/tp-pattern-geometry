package org.acme.geometry;

import java.util.ArrayList;

public class LineString implements Geometry{
	private ArrayList<Point> listPoints;
	public static final String TYPE = "LineString";
	
	public LineString() {
		this.setListPoints(listPoints);
	}
	
	public LineString(ArrayList<Point> listPoints) {
		this.listPoints = listPoints;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "I'm a LineString !";
	}
	
	@Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (this.listPoints.size()==0) {
            return true;
        }
        else {
            return false;
        }
    }
	
	public ArrayList<Point> getListPoints() {
		return listPoints;
	}
	
	public void setListPoints(ArrayList<Point> listPoints) {
		this.listPoints = listPoints;
	}
	
	public int getNumPoints(){
		return this.listPoints.size();
	}
	
	public Point getPointN(int n) {
		if(n < this.listPoints.size()) {
			return this.listPoints.get(n);
		}
		else {
			return null;
		}

	}

	@Override
	public void translate(double dx, double dy) {
        // TODO Auto-generated method stub
        ArrayList<Point> l = this.listPoints;
        for (int i = 0; i < l.size(); i++) {
            l.get(i).translate(dx,dy);
        }
	    
		
	}
}

