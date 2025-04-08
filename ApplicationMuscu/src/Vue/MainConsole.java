package Vue;

import java.util.Scanner;
import Model.*;

public class MainConsole {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choixMenuPrincipal = menuPrincipal();
		boolean sortie = false;
		while (sortie != true) {
			switch(choixMenuPrincipal) {
			case 1 :
				// Gestionnaire des Exercices
				ExerciceDAO exerciceDAO = new ExerciceDAO();
				int choixMenuExercice = menuExercice();
				switch(choixMenuExercice) {
				case 1 : 
					// Crée un exercice
					System.out.println("Bienvenue dans la création d'un exercice !");
					String nomExercice;
					String muscleSolicite = "";
					String detailExercice;	
					System.out.println("Entrer le nom de l'exercice : ");
					nomExercice = scan.nextLine();
					System.out.println("Entrer le muscle solicite lors de cette l'exercice : ");
					int menuMuscle = choixMuscle();
					switch (menuMuscle) {
					case 1 : 
						muscleSolicite = "Adbominaux";
						break;
					case 2 : 
						muscleSolicite = "Biceps";
						break;
					case 3 : 
						muscleSolicite = "Triceps";
						break;
					case 4 : 
						muscleSolicite = "Jambes";
						break;
					case 5 : 
						muscleSolicite = "Pectoraux";
						break;
					case 6 : 
						muscleSolicite = "Deltoides";
						break;
					case 7 : 
						muscleSolicite = "Dos";
						break;
					case 8 : 
						muscleSolicite = "Autres";
						break;
					default : 
						System.out.println("Erreur !!");
						break;
					}
						
					System.out.println("Entrer les detail de l'exercice : ");
					detailExercice = scan.nextLine();					
					Exercice exercice = new Exercice(nomExercice, muscleSolicite, detailExercice);
					exerciceDAO.create(exercice);
					break;
				case 2 : 
					// modifier un exercice
					System.out.println("Bienvenue dans la modification d'un exercice !");
					System.out.println("Entrer l'id de l'exercice à modifier : ");
					int idExercice = scan.nextInt();
					scan.nextLine();
					String nomExerciceModif;
					String muscleSoliciteModif = "";
					String detailExerciceModif;	
					System.out.println("Entrer le nouveau nom de l'exercice : ");
					nomExerciceModif = scan.nextLine();
					System.out.println("Entrer le nouveau muscle solicite lors de cette l'exercice : ");
					int menuMuscleModifier = choixMuscle();
					switch (menuMuscleModifier) {
					case 1 : 
						muscleSoliciteModif = "Adbominaux";
						break;
					case 2 : 
						muscleSoliciteModif = "Biceps";
						break;
					case 3 : 
						muscleSoliciteModif = "Triceps";
						break;
					case 4 : 
						muscleSoliciteModif = "Jambes";
						break;
					case 5 : 
						muscleSoliciteModif = "Pectoraux";
						break;
					case 6 : 
						muscleSoliciteModif = "Deltoides";
						break;
					case 7 : 
						muscleSoliciteModif = "Dos";
						break;
					case 8 : 
						muscleSoliciteModif = "Autres";
						break;
					default : 
						System.out.println("Erreur !!");
						break;
					}
					System.out.println("Entrer les nouveaux detail de l'exercice : ");
					detailExerciceModif = scan.nextLine();					
					Exercice exerciceModifier = new Exercice(nomExerciceModif, muscleSoliciteModif, detailExerciceModif);
					exerciceDAO.update(exerciceModifier,idExercice);
					break;
				case 3 : 
					// supprimer un exercice
					System.out.println("Bienvenue dans la suppresion d'un exercice !");
					System.out.println("Entrer l'id de l'exercice à supprimer : ");
					int idSup = scan.nextInt();
					scan.nextLine();
					exerciceDAO.delete(idSup);
					break;
				case 4 : 
					// afficher les exercice
					System.out.println("Affichage des exercices !");
					exerciceDAO.getAll();
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
				SeanceDAO seanceDAO = new SeanceDAO();
				int choixMenuSeance = menuSeance();
				switch(choixMenuSeance) {
				case 1 : 
					// Crée un seance
					System.out.println("Bienvenue dans la crétion d'une seance !");	
					
					System.out.println("Entrez le nom de la séance : ");
					String nomSeance = scan.nextLine();
					System.out.println("Entrez les détails de la séance : ");
					String detailSeance = scan.nextLine();
					
					Seance seance = new Seance(nomSeance, detailSeance);
					
					seanceDAO.create(seance);
					
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
					System.out.println("Voici l'affichage des seance !");
					seanceDAO.getAll();
					break;
				case 6 : 
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
				System.out.println("Erreur!!");
				break;
			}
		}
		
		System.out.println("Au revoir !!");

	}
	
	/**
	 * Affiche le Menu principal de l'applications
	 * @return le choix de l'utilisateur 
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
		scan.nextLine();
		choix = verificationNombre(choix,1,4);
		return choix;
	}
	
	/**
	 * Permettant d'afficher le menu de gestion des exercice de l'application
	 * @return Le choix de l'utilisateur
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
		scan.nextLine();
		choix = verificationNombre(choix,1,5);
		return choix;
	}
	
	/**
	 * Permettant d'afficher le menu de gestion des séance de l'application
	 * @return Le choix de l'utilisateur
	 */
	public static int menuSeance() {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenu dans le gestionnaire des seances : ");
		System.out.println("	1 - Crée un seance.");
		System.out.println("	2 - Ajoute exercice.");
		System.out.println("	3 - Supprimer un exercice.");
		System.out.println("	4 - Afficher la seance.");
		System.out.println("    5 - Afficher tout les seance");
		System.out.println("	6 - Quittez.");
		System.out.println("Entrez votre choix : ");
		choix = scan.nextInt();
		scan.nextLine();
		choix = verificationNombre(choix,1,6);
		return choix;
	}
	
	/**
	 * Permettant d'afficher le menu de gestion de programme de l'application 
	 * @return Le choix de l'utilisateur
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
		scan.nextLine();
		choix = verificationNombre(choix,1,5);
		return choix;
	}

	/**
	 * Permetant de redemander un nombre en fonction des ces borne Max et Min
	 * @param nbr
	 * @param borneMin
	 * @param borneMax
	 * @return Le nombre entre les bornes Min et Max
	 */
	public static int verificationNombre(int nbr, int borneMin, int borneMax) {
		Scanner scan = new Scanner(System.in);
		while (nbr < borneMin || nbr > borneMax) {
			System.out.println("Erreur !! Nombre incorrect !");
			System.out.println("Entrez un nouveau nombre : ");
			nbr = scan.nextInt();
			scan.nextLine();
		}
		
		return nbr;
	}

	public static int choixMuscle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voici les Muscle disponnible : ");
		System.out.println("   1 - Adbominaux");
		System.out.println("   2 - Biceps");
		System.out.println("   3 - Triceps");
		System.out.println("   4 - Jambes");
		System.out.println("   5 - Pectoraux");
		System.out.println("   6 - Deltoides");
		System.out.println("   7 - Dos");
		System.out.println("   8 - Autres");
		int choix = scanner.nextInt();
		scanner.nextLine();
		choix = verificationNombre(choix,1,8);
		return choix;
	}
}
