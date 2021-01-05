package org.acme.geometry;

import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeometryWithCachedEnvelopeTest {

    @Test 
    public void testGeometryWithCachedEnvelopePoint(){
        Geometry g = SampleFactory.createPointA();
        g = new GeometryWithCacheEnveloppe(g);
        Enveloppe a = g.getEnveloppe() ; // calcul et stockage dans cachedEnvelope
        Enveloppe b = g.getEnveloppe() ; // renvoi de cachedEnvelope
        assertSame(a,b);
    }

    @Test 
    public void testGeometryWithCachedEnvelopeLineString(){
        Geometry g = SampleFactory.createLineStringOA();
        g = new GeometryWithCacheEnveloppe(g);
        Enveloppe a = g.getEnveloppe() ; // calcul et stockage dans cachedEnvelope
        Enveloppe b = g.getEnveloppe() ; // renvoi de cachedEnvelope
        assertSame(a,b);
    }
    
    public void useCacheTest() {
    	Geometry original = Mockito.mock(Geometry.class);
    	Enveloppe Bbox = new Enveloppe();
    	Mockito.when(original.getEnveloppe()).thenReturn(Bbox);
    	GeometryWithCacheEnveloppe cache = new GeometryWithCacheEnveloppe(original);
    	Assert.assertSame(Bbox, cache.getEnveloppe());
    	Assert.assertSame(Bbox, cache.getEnveloppe());
    	Mockito.verify(original, Mockito.times(1)).getEnveloppe();
    }
}


