package Model;

import java.util.Arrays;

public class Seance {
	private int idSeance;
	private String nom;
	private Exercice[] seance;
	private String detail;
	
	public Seance(String nom, Exercice[] seance) {
		this.nom = nom;
		this.seance = seance;
	}
	
	public int getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Exercice[] getSeance() {
		return seance;
	}

	public void setSeance(Exercice[] seance) {
		this.seance = seance;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Seance [nom=" + nom + ", seance=" + Arrays.toString(seance) + ", detail=" + detail + "]";
	}
	
	
}
