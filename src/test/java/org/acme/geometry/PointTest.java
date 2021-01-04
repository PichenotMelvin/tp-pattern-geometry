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

}

