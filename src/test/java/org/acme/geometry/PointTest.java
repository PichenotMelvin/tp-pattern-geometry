package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertEquals(0.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testOverrideConstructor() {
		Coordinate c = new Coordinate(1.2, 3.2);
		Point p = new Point(c);
		Assert.assertEquals(1.2, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.2, p.getCoordinate().getY(), EPSILON);
		
	}
	@Test
    public void testTranslate() {
     Coordinate c = new Coordinate(3.0,4.0);
        Point p = new Point(c);
        p.translate(1.0,1.0);
        Assert.assertEquals(4.0, p.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(5.0, p.getCoordinate().getY(), EPSILON);
    }

}

