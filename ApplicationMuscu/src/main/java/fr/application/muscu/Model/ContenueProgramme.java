package fr.application.muscu.Model;

public class ContenueProgramme {
    private int idProgramme;
    private int idSeance;

    public ContenueProgramme(int idProgramme, int idSeance) {

        this.idProgramme = idProgramme;
        this.idSeance = idSeance;
    }

    public int getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    @Override
    public String toString() {
        return "ContenueProgramme [idProgramme=" + idProgramme + ", idSeance=" + idSeance + "]";
    }
}
