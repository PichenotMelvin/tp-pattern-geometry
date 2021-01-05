package org.acme.geometry;

import java.util.ArrayList;

public class LineString implements Geometry{
	
	private ArrayList<Point> listPoints;
	public static final String TYPE = "LINESTRING";
	
	public LineString() {
		this.listPoints = new ArrayList<Point>();
	}
	
	public LineString(ArrayList<Point> listPoints) {
		assert(listPoints != null);
		this.listPoints = listPoints;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return TYPE;
	}
	
	@Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (this.listPoints.size() == 0) {
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
		return listPoints.size();
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
	
	@Override
	public LineString clone() {
		// Pour tester faire un assert not same sur des objets original et cloné
		ArrayList<Point> NewPoints = new ArrayList<Point>(this.getNumPoints());
		for(int i = 0; i < listPoints.size(); i++) {
			NewPoints.add( i, this.getPointN(i).clone()); 
		}
		return new LineString(NewPoints);
	}
	
	@Override
	public Enveloppe getEnveloppe() {
		EnveloppeBuilder envBuilder = new EnveloppeBuilder();
		for(Point pt: listPoints) {
			envBuilder.insert(pt.getCoordinate());
		}
		return envBuilder.build();
		
	}

	
}

