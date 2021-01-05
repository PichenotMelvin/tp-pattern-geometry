package org.acme.geometry;

import java.util.ArrayList;

public class SampleFactory {
    public static Point createPointO() {
        return new Point(new Coordinate(0.0,0.0));
    }

    public static Point createPointA() {
        return new Point(new Coordinate(3.0,4.0));
    }

    public static LineString createLineStringOA() {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(createPointO());
        points.add(createPointA());
        return new LineString(points);
    }
}