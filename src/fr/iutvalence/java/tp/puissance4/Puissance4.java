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
			if (this.estPartieGagneeAutourDUnePosition(this.poserJeton(EtatCase.ROUGE,
					colonne)))
			{
				System.out.println("Le joueur 1 gagne la partie !");
				break;
			}
			System.out.println(this.grille);

			System.out
					.println("Joueur 2, entrez la colonne dans laquelle vous voulez poser un jeton");
			colonne = saisieUtilisateur.nextInt();
			if (this.estPartieGagneeAutourDUnePosition(this.poserJeton(EtatCase.JAUNE,
					colonne)))
			{
				System.out.println("Le joueur 1 gagne la partie !");
				break;
			}
			System.out.println(this.grille);
		}
	}

	/**
	 * Tenter de poser un jeton dans une colonne de la grille.
	 * 
	 * @param couleur
	 *            la couleur du jeton à poser
	 * @param numeroDeColonne
	 *            le numéro de colonne où poser le jeton
	 * 
	 * @return la position où le jeton a été posée, ou null si la colonne était
	 *         pleine.
	 * 
	 */
	private Position poserJeton(EtatCase couleur, int numeroDeColonne)
	{
		for (int numeroDeLigne = Grille.NOMBRE_DE_LIGNES - 1; numeroDeLigne >= 0; numeroDeLigne--)
		{
			Position position = new Position(numeroDeLigne, numeroDeColonne);
			if (this.grille.obtenirCase(position) == EtatCase.VIDE)
			{
				this.grille.changerEtatCase(position, couleur);
				return position;
			}
		}
		return null;
	}

	/**
	 * Permet de savoir si la partie est gagnée, quel que soit l'axe, autour
	 * d'une position
	 * 
	 * @param position
	 *            la position
	 * @return <tt>true</tt> si la partie est gagnée autour de la position
	 */
	private boolean estPartieGagneeAutourDUnePosition(Position position)
	{
		for (Axe axe : Axe.values())
			if (this.estPartieGagneeAutourDUnePositionEtDansUnAxe(position, axe))
				return true;
		return false;
	}

	/**
	 * Permet de savoir si la partie est gagnée autour d'une position dans un
	 * axe donné
	 * 
	 * @param position
	 *            la position
	 * @param axe
	 *            l'axe
	 * 
	 * @return <tt>true</tt> si la partie est gagnée autour de la position dans l'axe
	 */
	private boolean estPartieGagneeAutourDUnePositionEtDansUnAxe(Position position, Axe axe)
	{
		int nombreDeJetonsDansLaDirectionPrincipale = this
				.obtenirNombreDeJetonsAlignesDansUneDirection(position,
						axe.obtenirPrincipale());
		int nombreDeJetonsDansLaDirectionSecondaire = this
				.obtenirNombreDeJetonsAlignesDansUneDirection(position,
						axe.obtenirSecondaire());
		return (nombreDeJetonsDansLaDirectionPrincipale
				+ nombreDeJetonsDansLaDirectionSecondaire + 1 >= 4);
	}

	/**
	 * @param position
	 * @param direction
	 * @return
	 */
	/**
	 * Permet de connaitre le nombre de jetons alignés sur une direction
	 * 
	 * @param position
	 *            Position d'où l'on commence à compter
	 * @param direction
	 *            Direction où l'on compte
	 * @return Le nombre de jetons alignés
	 */
	private int obtenirNombreDeJetonsAlignesDansUneDirection(Position position,
			Direction direction)
	{
		int nombreDeJetonsAlignes = 0;
		Position positionSuivante = position.obtenirVoisine(direction);
		while (true)
		{
			if (this.grille.estHorsDeLaGrille(positionSuivante))
				break;
			if (this.grille.obtenirCase(positionSuivante) != this.grille
					.obtenirCase(position))
				break;
			nombreDeJetonsAlignes++;
		}
		return nombreDeJetonsAlignes;
	}

}
