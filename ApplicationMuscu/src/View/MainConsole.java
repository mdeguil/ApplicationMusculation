package View;

import java.util.Scanner;

public class MainConsole {

	public static void main(String[] args) {
		int choixMenuPrincipal = menuPrincipal();
		boolean sortie = false;
		while (sortie != true) {
			switch(choixMenuPrincipal) {
			case 1 :
				// Gestionnaire des Exercices
				int choixMenuExercice = menuExercice();
				switch(choixMenuExercice) {
				case 1 : 
					// Crée un exercice
					System.out.println("Bienvenue dans la création d'un exercice !");
					break;
				case 2 : 
					// modifier un exercice
					System.out.println("Bienvenue dans la modification d'un exercice !");
					break;
				case 3 : 
					// supprimer un exercice
					System.out.println("Bienvenue dans la suppresion d'un exercice !");
					break;
				case 4 : 
					// afficher exercice
					System.out.println("Affichage d'un exercice !");
					break;
				case 5 : 
					// revenir au Menu principal
					System.out.println("retour Menu principal !");
					choixMenuPrincipal = menuPrincipal();
					break;
				default : 
					// Cas erreure
					System.out.println("Erreur !!");
					break;
				}
				break;
			case 2 : 
				int choixMenuSeance = menuSeance();
				switch(choixMenuSeance) {
				case 1 : 
					// Crée un seance
					System.out.println("Bienvenue dans la crétion d'une seance !");
					break;
				case 2 : 
					// Ajouter un exercice
					System.out.println("Bienvenue dans l'ajout d'un exercice !");
					break;
				case 3 : 
					// supprimer un exercice
					System.out.println("Bienvenue dans la supression d'un exercice !");
					break;
				case 4 : 
					// afficher la seance
					System.out.println("Voici l'affichage de la seance !");
					break;
				case 5 : 
					// revenir au Menu principal
					System.out.println("retour Menu principal !");
					choixMenuPrincipal = menuPrincipal();
					break;
				default : 
					// Cas erreure
					System.out.println("Erreur !!");
					break;
				}
				break;
			case 3 : 
				// Gestionnaire de programme
				int choixMenuProgramme = menuProgramme();
				switch(choixMenuProgramme) {
				case 1 : 
					// Crée un programme
					System.out.println("Bienvenue dans la crétion d'un programme !");
					break;
				case 2 : 
					// Ajouter un seance
					System.out.println("Bienvenue dans l'ajout d'une seance !");
					break;
				case 3 : 
					// supprimer un seance
					System.out.println("Bienvenue dans la supression d'une seance !");
					break;
				case 4 : 
					// afficher le programme
					System.out.println("Voici l'affichage du programme !");
					break;
				case 5 : 
					// revenir au Menu principal
					System.out.println("retour Menu principal !");
					choixMenuPrincipal = menuPrincipal();
					break;
				default : 
					// Cas erreure
					System.out.println("Erreur !!");
					break;
				}
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
	
	/**
	 * Fonction permettant d'afficher le menu principal de l'application et qui retourne le choix de l'utilisateur
	 * @return
	 */
	public static int menuPrincipal() {
		int choix = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le Menu :");
		System.out.println("	1 - Gestionnaire d'exercice.");
		System.out.println("	2 - Gestionnaire de séance.");
		System.out.println("	3 - Gestionnaire de programme.");
		System.out.println("	4 - Quittez.");
		System.out.println("Entrez votre choix : ");
		choix = scan.nextInt();

		return choix;
	}
	
	/**
	 * Fonction permettant d'afficher le menu de gestion des exercice de l'application et qui retourne le choix de l'utilisateur
	 * @return
	 */
	public static int menuExercice() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des exercices : ");
		System.out.println("	1 - Créer un exercice.");
		System.out.println("	2 - Modifier un exercice.");
		System.out.println("	3 - Supprimer un exercice.");
		System.out.println("	4 - Afficher un exercice.");
		System.out.println("	5 - Quittez.");
		System.out.println("Entrez votre choix : ");
		choix = scan.nextInt();
		choix = verificationNombre(choix,1,5);
		return choix;
	}
	
	/**
	 * Fonction permettant d'afficher le menu de gestion des séance de l'application et qui retourne le choix de l'utilisateur
	 * @return
	 */
	public static int menuSeance() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des seances : ");
		System.out.println("	1 - Crée un seance.");
		System.out.println("	2 - Ajoute exercice.");
		System.out.println("	3 - Supprimer un exercice.");
		System.out.println("	4 - Afficher la seance.");
		System.out.println("	5 - Quittez.");
		System.out.println("Entrez votre choix : ");
		choix = scan.nextInt();
		choix = verificationNombre(choix,1,5);
		return choix;
	}
	
	/**
	 * Fonction permettant d'afficher le menu de gestion de programme de l'application et qui retourne le choix de l'utilisateur
	 * @return
	 */
	public static int menuProgramme() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des seances : ");
		System.out.println("    1 - Créer un programme.");
		System.out.println("	2 - Ajouter une seance.");
		System.out.println("	3 - Supprimer une seance.");
		System.out.println("	4 - Afficher le programe.");
		System.out.println("	5 - Quittez.");
		System.out.println("Entrez votre choix : ");
		choix = scan.nextInt();
		choix = verificationNombre(choix,1,5);
		return choix;
	}

	/**
	 * Fonction permetant de redemander un nombre en fonction des ces borne Max et Min puis retourne le nombre correcte
	 * @param nbr
	 * @param borneMin
	 * @param borneMax
	 * @return
	 */
	public static int verificationNombre(int nbr, int borneMin, int borneMax) {
		Scanner scan = new Scanner(System.in);
		while (nbr < borneMin && nbr > borneMax) {
			System.out.println("Erreur !! Nombre incorrect !");
			System.out.println("Entrez un nouveau nombre : ");
			nbr = scan.nextInt();
		}
		
		return nbr;
	}
}
