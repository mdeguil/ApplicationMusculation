package Model;

import java.sql.*;

public class ConnexionBDD {
	
	public void connectionUpdate(String requete) {
		String url = "jdbc:mysql://localhost:3306/bddappmusculation";
		String user = "mysql";
		String pass = "mysql";
		
		try {
			Connection connect = DriverManager.getConnection(url, user, pass);
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(requete);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}
	
	public void connectionQueryExercice(String requete) {
		String url = "jdbc:mysql://localhost:3306/bddappmusculation";
		String user = "mysql";
		String pass = "mysql";
		
		try {
			Connection connect = DriverManager.getConnection(url, user, pass);
			Statement stmt = connect.createStatement();
			ResultSet result = stmt.executeQuery(requete);
			// Afficher les information
			while (result.next()) {
				// mettre chaque collone 
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("IdExercice : " + result.getInt("idExercice"));
				System.out.println("Nom : " + result.getString("nom"));
				System.out.println("Musclue solicité : "+ result.getString("muscleSolicite"));
				System.out.println("Détails : "+ result.getString("detail"));
			}
			System.out.println("-------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}
	
	public void connectionQuerySeanceUnique(String requete) {
		String url = "jdbc:mysql://localhost:3306/bddappmusculation";
		String user = "mysql";
		String pass = "mysql";
		
		try {
			Connection connect = DriverManager.getConnection(url, user, pass);
			Statement stmt = connect.createStatement();
			ResultSet result = stmt.executeQuery(requete);
			// Afficher les information
			while (result.next()) {
				// mettre chaque collone 
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Exercice : " + result.getString("nom"));
				System.out.println("Nombre série : "+ result.getString("nbrSerie"));
				System.out.println("Nombre de répétition : "+ result.getString("nbrRepetition"));
			}
			System.out.println("-------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}
	
	public void connectionQueryToutSeance(String requete) {
		String url = "jdbc:mysql://localhost:3306/bddappmusculation";
		String user = "mysql";
		String pass = "mysql";
		
		try {
			Connection connect = DriverManager.getConnection(url, user, pass);
			Statement stmt = connect.createStatement();
			ResultSet result = stmt.executeQuery(requete);
			// Afficher les information
			while (result.next()) {
				// mettre chaque collone 
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("IdSeance : " + result.getInt("idSeance"));
				System.out.println("Nom : " + result.getString("nom"));
				System.out.println("Détails : "+ result.getString("detail"));
			}
			System.out.println("-------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}
	
}
