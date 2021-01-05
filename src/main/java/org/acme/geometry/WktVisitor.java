package org.acme.geometry;

public class WktVisitor implements GeometryVisitor{
	
	private StringBuilder buffer;
	
	public WktVisitor() {
		this.buffer = new StringBuilder();
	}
	
	public String getResult(){
		return buffer.toString();
	}

	@Override
	public void visit(Point point) {
		WktWriter writer = new WktWriter();
		buffer.append(writer.write(point));
		System.out.println(writer.write(point));
	}

	@Override
	public void visit(LineString lineString) {
		WktWriter writer = new WktWriter();
		buffer.append(writer.write(lineString));
		System.out.println(writer.write(lineString));
	}
	

}
