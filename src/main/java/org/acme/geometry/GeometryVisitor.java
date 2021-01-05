package org.acme.geometry;

public interface GeometryVisitor {

		abstract void visit(Point point);
		abstract void visit(LineString lineString);
}
