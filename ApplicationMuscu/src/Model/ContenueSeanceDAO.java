package Model;

public class ContenueSeanceDAO {

	public void create(int idSeance, int idExercice) {
		ConnexionBDD connexionBDD = new ConnexionBDD();
		String requete = "INSERT INTO contenueseance (idSeance, idExercice) VALUES ('"+ idSeance +"' , '"+ idExercice+ "'); " ; 
		connexionBDD.connectionUpdate(requete);
	}
	
	public void delete(int idSeance, int idExercice) {
		ConnexionBDD connexionBDD = new ConnexionBDD(); 
		String requete = "DELETE FROM contenueseance WHERE idExercice = '" + idExercice + "' AND idSeance ='"+ idSeance +"' ;";
		connexionBDD.connectionUpdate(requete);	 
	}

}
