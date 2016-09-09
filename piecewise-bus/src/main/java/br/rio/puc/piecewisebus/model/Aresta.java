package br.rio.puc.piecewisebus.model;


public class Aresta {
	
	private Vertice source;
	private Vertice target;
	private double custo;
	private String edge_nome;
		
	public Aresta(Vertice origem, Vertice destino, String edge_nome, double distancia) {
		this.edge_nome = edge_nome;
		this.source = origem;
		this.target = destino;
		this.custo = distancia;		
	}

	public double getCost() {
		return custo;
	}

	public void setCost(Double custo) {
		this.custo = custo;
	}

	public String getRoadNome() {
		return edge_nome;
	}

	public void setRoadNome(String edge_nome) {
		this.edge_nome = edge_nome;
	}

	public Vertice getFromNode() {
		return source;
	}

	public void setFromNode(Vertice source) {
		this.source = source;
	}

	public Vertice getToNode() {
		return target;
	}

	public void setToNode(Vertice target) {
		this.target = target;
	}
	
	@Override
	public String toString() {
		return this.source + " , " + this.target;
	}
}
