package Model;

import java.util.Arrays;

public class Programme {
	private int idProgramme;
	private String nom;
	private Seance[] programme;
	private String detail;
	
	public Programme(String nom, Seance[] programme) {
		this.nom = nom;
		this.programme = programme;

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

	public Seance[] getProgramme() {
		return programme;
	}

	public void setProgramme(Seance[] programme) {
		this.programme = programme;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Programme [idProgramme=" + idProgramme + ", nom=" + nom + ", programme=" + Arrays.toString(programme)
				+ ", detail=" + detail + "]";
	}
	
	
}
