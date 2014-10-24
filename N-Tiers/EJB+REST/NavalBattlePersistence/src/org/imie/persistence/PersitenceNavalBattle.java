package org.imie.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import model.Joueur;


/**
 * @author imie
 *
 */
@Named("jdbc")
public class PersitenceNavalBattle implements IPersistenceNavalBattle {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.imie.persistence.IPersistenceNavalBattle#getAllJoueurs()
	 */
	@Override
	public List<Joueur> getAllJoueurs() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<Joueur> retour = new ArrayList<Joueur>();
		try {
			connection = openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT pseudo FROM joueur");

			while (resultSet.next()) {
				Joueur joueur = new Joueur();
				joueur.setPseudo(resultSet.getString("pseudo"));
				retour.add(joueur);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			closeJDBC(connection, statement, resultSet);
		}
		return retour;
	}

	protected Connection openConnection() throws SQLException {
		Connection connection;
		connection = DriverManager
				.getConnection("jdbc:postgresql://localhost:5432/imie",
						"postgres", "postgres");
		return connection;
	}

	protected void closeJDBC(Connection connection, Statement statement,
			ResultSet resultSet) {
		try {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
