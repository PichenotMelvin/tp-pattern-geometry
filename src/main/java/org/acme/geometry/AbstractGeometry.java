package org.acme.geometry;

import java.util.ArrayList;

public abstract class AbstractGeometry implements Geometry{
	
	private ArrayList<GeometryListener> listeners = new ArrayList<>();
	
	public abstract Geometry clone();

	public String asText() {
		WktVisitor visitor = new WktVisitor();
		accept(visitor);
		return visitor.getResult();
	}

	@Override
	public Enveloppe getEnveloppe() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		accept(builder);
		return builder.build();		
	}
	
	public void triggerChange() {
		for(GeometryListener listener: listeners) {
			listener.onChange(this);
		}
	}
	
	public void addListener(GeometryListener listener) {
		this.listeners.add(listener);
	}
}
