package Model;

public class ContenueSeance {
	private int idSeance;
	private int idExercice;
	
	public ContenueSeance(int idSeance, int idExercice) {
		this.idSeance = idSeance;
		this.idExercice = idExercice;
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


	@Override
	public String toString() {
		return "ContenueSeance [idSeance=" + idSeance + ", idExercice=" + idExercice + "]";
	}
	
	
}
