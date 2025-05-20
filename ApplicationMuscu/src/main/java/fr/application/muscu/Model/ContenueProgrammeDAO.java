package fr.application.muscu.Model;

public class ContenueProgrammeDAO {
    public void create(int idSeance, int idProgramme) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "INSERT INTO contenueProgramme (idProgramme, idSeance) VALUES ('"+ idSeance +"' , '"+ idProgramme+ "'); " ;
        connexionBDD.connectionUpdate(requete);
    }

    public void delete(int idSeance, int idProgramme) {
        ConnexionBDD connexionBDD = new ConnexionBDD();
        String requete = "DELETE FROM contenueProgramme WHERE idProgramme = '" + idProgramme + "' AND idSeance ='"+ idSeance +"' ;";
        connexionBDD.connectionUpdate(requete);
    }
}
