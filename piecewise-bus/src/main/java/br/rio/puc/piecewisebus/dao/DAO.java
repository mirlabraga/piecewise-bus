package br.rio.puc.piecewisebus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.rio.puc.piecewisebus.model.Elements;

public class DAO {

	public List<Elements> getElements() throws ClassNotFoundException,
			SQLException, IOException {

		List<Elements> elements = new ArrayList<Elements>();
		Connection connetion = ConnectionJDBC.getConnection();
		ResultSet rs = null;

		try {

			PreparedStatement sql = connetion
					.prepareStatement("SELECT source, target, road_id, cost FROM grafoteste");
			rs = sql.executeQuery();

			while (rs.next()) {
				Elements element = new Elements();

				element.setSource(rs.getString("source"));
				element.setTarget(rs.getString("target"));
				element.setEdge(rs.getString("road_id"));
				element.setDistance(rs.getDouble("cost"));
				elements.add(element);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.print(e.getMessage());
			System.err.print("[ERRO] UM ERRO OCORREU QUANDO OS ELEMENTOS ESTAVAM SENDO CAPTURADOS");
			System.err.print(e.getMessage());
		}

		connetion.close();
		return elements;
	}
}
