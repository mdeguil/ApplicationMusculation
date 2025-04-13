package Model;

public class ContenueSeance {
	private int idSeance;
	private int idExercice;
	private int nbrSerie;
	private int nbrRepetition;
	
	

	public ContenueSeance(int idSeance, int idExercice, int nbrSerie, int nbrRepetition) {
		this.idSeance = idSeance;
		this.idExercice = idExercice;
		this.nbrSerie = nbrSerie;
		this.nbrRepetition = nbrRepetition;
	}


	public int getIdSeance() {
		return idSeance;
	}


	public void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}


	public int getIdExercice() {
		return idExercice;
	}


	public void setIdExercice(int idExercice) {
		this.idExercice = idExercice;
	}


	public int getNbrSerie() {
		return nbrSerie;
	}


	public void setNbrSerie(int nbrSerie) {
		this.nbrSerie = nbrSerie;
	}


	public int getNbrRepetition() {
		return nbrRepetition;
	}


	public void setNbrRepetition(int nbrRepetition) {
		this.nbrRepetition = nbrRepetition;
	}	
	
}
