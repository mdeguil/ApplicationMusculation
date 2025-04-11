package Model;

import java.util.Arrays;

public class Programme {
	private int idProgramme;
	private String nom;
	private String detail;
	
	public Programme(String nom, String detail) {
		this.nom = nom;
		this.detail = detail;

	}

	public int getIdProgramme() {
		return idProgramme;
	}

	public void setIdProgramme(int idProgramme) {
		this.idProgramme = idProgramme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Programme [idProgramme=" + idProgramme + ", nom=" + nom + ", detail=" + detail + "]";
	}
	
	
}
