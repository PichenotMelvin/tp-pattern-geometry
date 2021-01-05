package org.acme.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WktWriterTest {

    @Test
    public void testWktPointFilled(){
        Point p = SampleFactory.createPointA();
        WktWriter writer = new WktWriter();
        assertEquals("POINT(3.0 4.0)", writer.write(p));

        Point eP = new Point();
        assertEquals("POINT EMPTY", writer.write(eP));
    }

    @Test
    public void testWktLineString(){
        LineString oa = SampleFactory.createLineStringOA();
        WktWriter writer = new WktWriter();
        assertEquals("LINESTRING(0.0 1.0,3.0 4.0)", writer.write(oa));

        LineString eOA = new LineString();
        assertEquals("LINESTRING EMPTY", writer.write(eOA));
    }


}
