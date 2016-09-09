package br.rio.puc.piecewisebus.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Grafo {

	private Set<Vertice> vertices;
	private Set<Aresta> arestas;

	public Grafo() {
		vertices = new HashSet<Vertice>();
		arestas = new HashSet<Aresta>();
	}

	public Vertice addVertice(String nome) {

		System.out.println("TOTAL DE VÉRTICES:" + vertices.size());
		System.out.println("CRIANDO O VERTICE:" + nome);
		Vertice vertice = new Vertice(nome);

		if(!vertices.contains(vertice)) {
			vertices.add(vertice);
			System.out.println("ADICIONADO VERTICES:" + vertice);
		}
		
		return this.getVertice(nome);
	}
	
	public Vertice getVertice(String nome) {
		
		for (Vertice vertice : vertices) {
			if (vertice.getNome().equals(nome)) {
				return vertice;
			}
		}
		return null;
	}

	public Aresta addAresta(Vertice origem, Vertice destino, String edge,
			double distancia) {

		Aresta aresta = new Aresta(origem, destino, edge, distancia);
		origem.addAdj(aresta);
		arestas.add(aresta);
		System.out.println("ADICIONADO ARESTA:" + aresta);
		return aresta;

	}

	public String toString() {

		String r = "";

		for (Vertice u : vertices) {
			r += u.getNome() + " -> ";
			for (Aresta e : u.getAdjacents()) {
				Vertice v = e.getToNode();
				r += v.getNome() + "(" + e.getCost() + ")" + ", ";
			}
			r += "\n";
		}
		return r;

	}
}