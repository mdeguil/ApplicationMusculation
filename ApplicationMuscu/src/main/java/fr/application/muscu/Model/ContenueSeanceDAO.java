package fr.application.muscu.Model;

public class ContenueSeanceDAO {
    public void create(ContenueSeance contenueSeance) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "INSERT INTO contenueseance (idSeance, idExercice, nbrSerie, nbrRepetition) VALUES ('"+ contenueSeance.getIdSeance() +"' , '"+ contenueSeance.getIdExercice() + "' , '"+ contenueSeance.getNbrSerie()+ "', '"+ contenueSeance.getNbrRepetition() + "); " ;
        connexionBDD.connectionUpdate(requete);
    }

    public void delete(int idSeance, int idExercice) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "DELETE FROM contenueseance WHERE idExercice = '" + idExercice + "' AND idSeance ='"+ idSeance +"' ;";
        connexionBDD.connectionUpdate(requete);
    }

    public void update(ContenueSeance contenueSeance) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "UPDATE contenueseance SET nbrSerie = '" + contenueSeance.getNbrSerie() +"', nbrRepetition = '"+ contenueSeance.getNbrRepetition() +"' WHERE idSeance = '"+ contenueSeance.getIdSeance() +"'AND idExercice ='"+ contenueSeance.getIdExercice() + "' ;";
        connexionBDD.connectionUpdate(requete);
    }
}
