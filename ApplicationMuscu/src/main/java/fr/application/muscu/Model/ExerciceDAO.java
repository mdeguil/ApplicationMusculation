package fr.application.muscu.Model;

public class ExerciceDAO {
    public void create(Exercice exercice) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "INSERT INTO exercice (nom, muscleSolicite, detail) VALUES ('"+ exercice.getNom()+"' , '"+ exercice.getMuscleSolicite() +"','"+ exercice.getDetail() + "'); " ;
        connexionBDD.connectionUpdate(requete);
    }

    public void update(Exercice exercice, int id) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "UPDATE exercice SET nom = '"+ exercice.getNom()+"', muscleSolicite = '"+exercice.getMuscleSolicite()+"', detail = '"+exercice.getDetail()+"' WHERE idExercice = '"+id+"' ;";
        connexionBDD.connectionUpdate(requete);
    }

    public void delete(int id) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "DELETE FROM exercice WHERE idExercice = '" + id + "';";
        connexionBDD.connectionUpdate(requete);
    }

    public void getOne(int id) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "SELECT * FROM exercice WHERE idExercice = '"+id+"';";
        connexionBDD.connectionQueryExercice(requete);
    }

    public void getAll() {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "SELECT * FROM exercice";
        connexionBDD.connectionQueryExercice(requete);
    }
}
