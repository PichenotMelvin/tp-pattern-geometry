package org.acme.geometry;

public class WktWriter {
	
	private static final String empty = "EMPTY";
	
	public WktWriter() {
		
	}

	public String write(Geometry geometry) {
		String type = geometry.getType();
		boolean emptyGeom = geometry.isEmpty();
		if ( geometry instanceof Point ){
		    Point point = (Point)geometry;
		    if(emptyGeom) {
		    	return type + empty;
		    }
		    else {
		    	return type + "(" + point.getCoordinate().getX() + " " + point.getCoordinate().getY() + ")";	 
		    }
		}else if ( geometry instanceof LineString ){
		    LineString lineString = (LineString)geometry;
		    if(emptyGeom) {
		    	return type + empty;
		    }
		    else {
		    	String output = type + "(";
		    	for(int i = 0; i < lineString.getNumPoints(); i++) {
		    		if(i == lineString.getNumPoints() - 1) {
		    			output = output.concat(String.valueOf(lineString.getPointN(i).getCoordinate().getX()) + " " + String.valueOf(lineString.getPointN(i).getCoordinate().getY()));
		    		}
		    		else {
		    			output = output.concat(String.valueOf(lineString.getPointN(i).getCoordinate().getX()) + " " + String.valueOf(lineString.getPointN(i).getCoordinate().getY()) + ",");
		    		}
		    		
		    	}
		    	return output + ")";	 
		    }
		}else{
		    throw new RuntimeException("geometry type not supported");
		}
	}
}
