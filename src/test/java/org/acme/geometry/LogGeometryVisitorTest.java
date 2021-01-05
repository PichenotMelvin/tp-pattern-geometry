package org.acme.geometry;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogGeometryVisitorTest {
	
	private ByteArrayOutputStream os;
	private PrintStream out;
	
	@Before
	public void setUp() {
		this.os = new ByteArrayOutputStream();
		this.out = new PrintStream(this.os);
	}
	
	@Test
	public void testPointA() throws UnsupportedEncodingException{
		LogGeometryVisitor logVisitor = new LogGeometryVisitor(out);
		Geometry geom = SampleFactory.createPointA();
		geom.accept(logVisitor);
		String output = os.toString("UTF8");
		Assert.assertEquals("Je suis un point avec x=3.0 et y=4.0.", output);
	}
	
	@Test
	public void testLineString() throws UnsupportedEncodingException{
		LogGeometryVisitor logVisitor = new LogGeometryVisitor(out);
		Geometry geom = SampleFactory.createLineStringOA();
		geom.accept(logVisitor);
		String output = os.toString("UTF8");
		Assert.assertEquals("Je suis une polyligne définie par 2 point(s).", output);
	}

    @Test
    public void testGeometryVisitor(){
        LogGeometryVisitor visitor = new LogGeometryVisitor();
        Geometry geometry = SampleFactory.createPointA();
        geometry.accept(visitor);
    }

}
