package Model;

public class Exercice {
	private int idExercice;
	private String nom;
	private String MuscleSolicite;
	private int nombreSerie;
	private int nombreRepetition;
	private String detail;
	private int poid;
	
	public Exercice(String nom, String muscleSolicite) {
		this.nom = nom;
		this.MuscleSolicite = muscleSolicite;
	}

	public int getIdExercice() {
		return idExercice;
	}

	public void setIdExercice(int idExercice) {
		this.idExercice = idExercice;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMuscleSolicite() {
		return MuscleSolicite;
	}

	public void setMuscleSolicite(String muscleSolicite) {
		MuscleSolicite = muscleSolicite;
	}

	public int getNombreSerie() {
		return nombreSerie;
	}

	public void setNombreSerie(int nombreSerie) {
		this.nombreSerie = nombreSerie;
	}

	public int getNombreRepetition() {
		return nombreRepetition;
	}

	public void setNombreRepetition(int nombreRepetition) {
		this.nombreRepetition = nombreRepetition;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	@Override
	public String toString() {
		return "Exercice [idExercice=" + idExercice + ", nom=" + nom + ", MuscleSolicite=" + MuscleSolicite
				+ ", nombreSerie=" + nombreSerie + ", nombreRepetition=" + nombreRepetition + ", detail=" + detail
				+ ", poid=" + poid + "]";
	}
	
}
