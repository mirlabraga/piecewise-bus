package br.rio.puc.piecewisebus.model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

	private String nome;
	private List<Aresta> adj;

	public Vertice(String nome) {
		this.nome = nome;
		this.adj = new ArrayList<Aresta>();
	}

	void addAdj(Aresta e) {
		adj.add(e);
	}

	public String getNome() {
		return nome;
	}

	public List<Aresta> getAdjacents() {
		return adj;
	}

	public Double getCostToNode(String nome) {
		for (Aresta e : adj) {
			if (nome.equals(e.getToNode()))
				return e.getCost();
		}
		return null;
	}

	public boolean equals(Object object) {
		if ((object instanceof Vertice) && ((Vertice) object).getNome() == this.nome)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
