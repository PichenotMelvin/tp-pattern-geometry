package org.acme.geometry;

public class GeometryWithCacheEnveloppe implements Geometry, GeometryListener{
	
	private Geometry original;
	private Enveloppe  cachedEnveloppe;
	
	public GeometryWithCacheEnveloppe(Geometry original) {
		this.original = original;
		this.original.addLister(this);
	}
	
	public String getType() {
		return this.original.getType();
	}

	@Override
	public boolean isEmpty() {
		return this.original.isEmpty();
	}

	@Override
	public void translate(double dx, double dy) {	
		this.original.translate(dx, dy);
	}

	@Override
	public Geometry clone() {
		return null;
	}

	@Override
	public Enveloppe getEnveloppe() {
		if(this.cachedEnveloppe == null) {
			this.cachedEnveloppe = this.original.getEnveloppe();
		}
		return this.original.getEnveloppe();
	}

	@Override
	public void accept(GeometryVisitor visitor) {
		this.original.accept(visitor);
	}

	@Override
	public void onchangeGeometry(Geometry geometry) {
		this.cachedEnveloppe = null;
	}

	@Override
	public void addLister(GeometryListener listener) {
		this.original.addLister(this);
	}
	@Override
	public void triggerChange() {
		this.original.triggerChange();
	}
	

}
