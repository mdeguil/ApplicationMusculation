package Model;

public class Exercice {
	private int idExercice;
	private String nom;
	private String MuscleSolicite;
	private String detail;
	
	public Exercice(String nom, String muscleSolicite, String detail) {
		this.nom = nom;
		this.MuscleSolicite = muscleSolicite;
		this.detail = detail;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Exercice [idExercice=" + idExercice + ", nom=" + nom + ", MuscleSolicite=" + MuscleSolicite
				+ ", detail=" + detail + "]";
	}

	
	
}
