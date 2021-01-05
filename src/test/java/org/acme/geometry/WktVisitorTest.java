package org.acme.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class WktVisitorTest {
	
	@Test
    public void testWktVisitor(){
        WktVisitor visitor = new WktVisitor();
        Geometry geometry = new Point(new Coordinate(3.0,4.0));
        geometry.accept(visitor);
        assertEquals( "POINT(3.0 4.0)", visitor.getResult() );

        Geometry geometry1 = SampleFactory.createLineStringOA();
        geometry1.accept(visitor);
        assertEquals("LINESTRING(0.0 1.0,3.0 4.0)",visitor.getResult());
    }

	@Test
    public void testWktVisitorLineString(){
        WktVisitor visitor = new WktVisitor();
        Geometry geometry = SampleFactory.createPointA();;
        geometry.accept(visitor);
        Assert.assertEquals( "POINT(3.0 4.0)", visitor.getResult() );
       }
	
    @Test
    public void testWktVisitorPoint(){
        WktVisitor visitor = new WktVisitor();
        Geometry geometry2 = SampleFactory.createLineStringOA();
        geometry2.accept(visitor);
        Assert.assertEquals( "LINESTRING(0.0 1.0,3.0 4.0)", visitor.getResult() );
    }
}
