package View;

import java.util.Scanner;

public class MainConsole {

	public static void main(String[] args) {
		int choixMenuPrincipal = menuPrincipal();
		boolean sortie = false;
		while (sortie =! true) {
			switch(choixMenuPrincipal) {
			case 1 :
				// Gestionnaire d'exercice
				break;
			case 2 : 
				// Gestionnaire de Seance
				break;
			case 3 : 
				// Gestionnaire de programme
				break;
			case 4 :
				// Sortie du programme 
				sortie = true;
				break;
			default :
				System.out.println("Erreur !!");
				break;
			}
		}

	}
	
	public static int menuPrincipal() {
		int choix = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le Menu :");
		System.out.println("	1 - Gestionnaire d'exercice.");
		System.out.println("	2 - Gestionnaire de séance.");
		System.out.println("	3 - Gestionnaire de programme.");
		System.out.println("	4 - Quittez.");
		System.out.println("Entrez votre choix");
		choix = scan.nextInt();

		return choix;
	}
	
	public static int menuExercice() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des exercices : ");
		System.out.println("	1 - Créer un exercice.");
		System.out.println("	2 - Modifier un exercice.");
		System.out.println("	3 - Supprimer un exercice.");
		System.out.println("	4 - Afficher un exercice.");
		System.out.println("	5 - Quittez.");
		System.out.println("Entrez votre choix");
		choix = scan.nextInt();
		return choix;
	}
	
	public static int menuSeance() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des seances : ");
		System.out.println("	1 - Ajouter un exercice.");
		System.out.println("	2 - Supprimer un exercice.");
		System.out.println("	3 - Afficher la seance.");
		System.out.println("	4 - Quittez.");
		System.out.println("Entrez votre choix");
		choix = scan.nextInt();
		return choix;
	}
	
	public static int menuProgramme() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des seances : ");
		System.out.println("	1 - Ajouter une seance.");
		System.out.println("	2 - Supprimer une seance.");
		System.out.println("	3 - Afficher le programe.");
		System.out.println("	4 - Quittez.");
		System.out.println("Entrez votre choix");
		choix = scan.nextInt();
		return choix;
	}

}
