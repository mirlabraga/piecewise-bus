package br.rio.puc.piecewisebus.main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.rio.puc.piecewisebus.dao.DAO;
import br.rio.puc.piecewisebus.model.Elements;
import br.rio.puc.piecewisebus.model.Grafo;
import br.rio.puc.piecewisebus.model.Vertice;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException, IOException {
		
		DAO dao = new DAO();
		List<Elements> elements = dao.getElements();

		Grafo grafo = new Grafo();

		for (Elements element : elements) {

			Vertice source = grafo.addVertice(element.getSource().trim());
			Vertice target = grafo.addVertice(element.getTarget().trim());
			
			grafo.addAresta(source, target, element.getEdge().trim(), element.getDistance());
			
			System.out.println(grafo);
		}
	}
}
