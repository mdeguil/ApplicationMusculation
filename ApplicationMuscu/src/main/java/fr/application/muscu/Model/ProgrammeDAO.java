package fr.application.muscu.Model;

public class ProgrammeDAO {
    public void create(Programme programme) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "INSERT INTO programme (nom,detail) VALUES ('"+ programme.getNom()+"' , '"+ programme.getDetail() + "'); " ;
        connexionBDD.connectionUpdate(requete);
    }

    public void update(Programme programme, int id) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "UPDATE programme SET nom = '"+ programme.getNom()+"', detail = '"+programme.getDetail()+"' WHERE idProgramme = '"+id+"' ;";
        connexionBDD.connectionUpdate(requete);
    }

    public void delete(int id) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "DELETE FROM programme WHERE idProgramme = '" + id + "';";
        connexionBDD.connectionUpdate(requete);
    }

    public void getOne(int id) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "SELECT * FROM contenueprogramme JOIN programme ON programme.idProgramme = contenueprogramme.idProgramme JOIN seance ON contenueprogramme.idSeance = seance.idSeance WHERE contenueprogramme.idProgramme = '"+id+"';";
        connexionBDD.connectionQueryProgrammeUnique(requete);
    }

    public void getAll() {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "SELECT * FROM programme";
        connexionBDD.connectionQueryToutProgramme(requete);
    }
}
