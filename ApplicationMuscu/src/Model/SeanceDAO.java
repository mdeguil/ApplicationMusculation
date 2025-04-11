package Model;

public class SeanceDAO {

	public void create(Seance seance) {
		ConnexionBDD connexionBDD = new ConnexionBDD();
		String requete = "INSERT INTO seance (nom, detail) VALUES ('"+ seance.getNom()+"' , '"+ seance.getDetail() + "'); " ; 
		connexionBDD.connectionUpdate(requete);
	}
	
	public void update(Seance seance, int id) {
		ConnexionBDD connexionBDD = new ConnexionBDD(); 
		String requete = "UPDATE seance SET nom = '"+ seance.getNom()+"', detail = '"+seance.getDetail()+"' WHERE idSeance = '"+id+"' ;";
		connexionBDD.connectionUpdate(requete);	 
	}
	
	public void delete(int id) {
		ConnexionBDD connexionBDD = new ConnexionBDD(); 
		String requete = "DELETE FROM seance WHERE idSeance = '" + id + "';";
		connexionBDD.connectionUpdate(requete);	 
	}
	
	public void getOne(int id) {
		ConnexionBDD connexionBDD = new ConnexionBDD();
		String requete = "SELECT * FROM seanceexercice JOIN seance ON seance.idSeance = seanceexercice.idSeance JOIN exercice ON seanceexercice.idExercice = exercice.idExercice WHERE seanceexercice.idSeance = '"+id+"';"; 
		connexionBDD.connectionQueryExercice(requete);
	}

	public void getAll() {
		ConnexionBDD connexionBDD = new ConnexionBDD();
		String requete = "SELECT * FROM seance "; 
		connexionBDD.connectionQueryToutSeance(requete);
	}
}
