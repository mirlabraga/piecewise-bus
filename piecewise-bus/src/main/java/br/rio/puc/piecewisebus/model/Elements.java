package br.rio.puc.piecewisebus.model;

public class Elements {

	private String origem;
	private String destino;
	private String edge;
	private double distance;
		
	public String getSource() {
	    return this.origem;
	  }
	public void setSource(String origem) {
	    this.origem = origem;
	  }
	
	public String getTarget() {
	    return this.destino;
	  }
	public void setTarget(String destino) {
	    this.destino = destino;
	  }
	
	public String getEdge() {
	    return this.edge;
	  }
	public void setEdge(String edge) {
	    this.edge = edge;
	  }
	
	public double getDistance() {
	    return this.distance;
	  }
	public void setDistance(double distance) {
	    this.distance = distance;
	  }
}
