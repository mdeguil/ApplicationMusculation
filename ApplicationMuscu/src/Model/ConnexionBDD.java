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
			System.out.println("Voici le resultat de vortre requete : ");
			while (result.next()) {
				// mettre chaque collone 
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("IdClient : " + result.getInt("id"));
				System.out.println("Nom : " + result.getString("nom"));
				System.out.println("Musclue solicité : "+ result.getString("muscleSolicite"));
				System.out.println("Détails : "+ result.getString("detail"));
			}
			System.out.println("-------------------------------------------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	}
	
}
