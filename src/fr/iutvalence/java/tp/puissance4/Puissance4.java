package fr.iutvalence.java.tp.puissance4;

import java.util.Scanner;

/**
 * Représente une partie de puissance 4
 * 
 * @author vallid
 * 
 */
public class Puissance4
{
	/**
	 * Le plateau du jeu
	 */
	private final Grille grille;

	/**
	 * Créer une nouvelle partie de puissance4 sur une grille de 7*6
	 * 
	 */
	public Puissance4()
	{
		this.grille = new Grille();
	}

	/**
	 * Démarrer la partie de Puissance4
	 */
	public void jouer()
	{
		Scanner saisieUtilisateur = new Scanner(System.in);

		System.out
				.println("la partie va commencer. Joueur 1: Pions rouges, Joueur 2: Pions jaunes.");
		System.out.println(this.grille);

		while (true)
		{
			System.out
					.println("Joueur 1, entrez la colonne dans laquelle vous voulez poser un jeton");
			int colonne = saisieUtilisateur.nextInt();
			if (this.grille.estPartieGagneeAutourDUnePosition(this.grille.poserJeton(EtatCase.ROUGE,
					colonne)))
			{
				System.out.println("Le joueur 1 gagne la partie !");
				break;
			}
			System.out.println(this.grille);

			System.out
					.println("Joueur 2, entrez la colonne dans laquelle vous voulez poser un jeton");
			colonne = saisieUtilisateur.nextInt();
			if (this.grille.estPartieGagneeAutourDUnePosition(this.grille.poserJeton(EtatCase.JAUNE,
					colonne)))
			{
				System.out.println("Le joueur 1 gagne la partie !");
				break;
			}
			System.out.println(this.grille);
		}
	}
}
