package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor{

	private PrintStream out;
	
	public LogGeometryVisitor() {
		this(System.out);
	}
	
	public LogGeometryVisitor(PrintStream out) {
		this.setOut(out);
	}
	@Override
	public void visit(Point point) {
		System.out.println("Je suis un point avec x=" +  point.getCoordinate().getX() + " et y=" + point.getCoordinate().getX() + ".");
		
	}

	@Override
	public void visit(LineString lineString) {
		System.out.println("Je suis une polyligne définie par " + String.valueOf(lineString.getNumPoints()) + " point(s).");
		
	}

	public PrintStream getOut() {
		return out;
	}

	public void setOut(PrintStream out) {
		this.out = out;
	}

}

