package fr.iutvalence.java.tp.puissance4;

// TODO(Fait) corriger le commentaire
/**
 * Représente une grille de Puissance4
 * 
 * @author vallid
 */
public class Grille
{
	/**
	 * la longueur par defaut de la grille
	 */
	public static final int NOMBRE_DE_LIGNES = 6;

	/**
	 * la largeur par defaut de la grille
	 */
	public static final int NOMBRE_DE_COLONNES = 7;

	/**
	 * tableau de cases pour définir la grille
	 */
	public EtatCase[][] etatsDesCases;

	// TODO(fait) écrire un commentaire plus précis (comment est initialisée la
	// grille ?)
	/**
	 * Permet de créer une grille de taille par defaut : 7 colonnes et 6 lignes
	 * Les cases de la grille sont non occupées
	 */
	public Grille()
	{
		this.etatsDesCases = new EtatCase[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				this.etatsDesCases[numeroDeLigne][numeroDeColonne] = EtatCase.VIDE;
	}

	/**
	 * Permet d'obtenir une case à la colonne et à la ligne indiqués en
	 * paramètre
	 * 
	 * @param numeroDeLigne
	 *            : Colonne de la case à obtenir
	 * @param numeroDeColonne
	 *            : Ligne de la case à Obtenir
	 * @return La case
	 */
	public EtatCase obtenirCase(int numeroDeLigne, int numeroDeColonne)
	{
		// TODO(fait) cas d'erreur ? soit return null, soit une exception
		if (numeroDeLigne<NOMBRE_DE_LIGNES && numeroDeColonne<NOMBRE_DE_COLONNES)
		return this.etatsDesCases[numeroDeLigne][numeroDeColonne];
		else return null;
	}
	
	/**
	 * Permet de changer l'état d'une case du plateau
	 * @param numeroDeLigne numero de la ligne où se situe la case
	 * @param numeroDeColonne numero de la colonne où se situe la case
	 * @param nouvelEtat etat de la case après la modification
	 */
	public void changerEtatCase(int numeroDeLigne, int numeroDeColonne, EtatCase nouvelEtat)
	{
		// TODO (Fait) à completer
		this.etatsDesCases[numeroDeLigne][numeroDeColonne]=nouvelEtat;
	}
	/**
	 * Permet de représenter le puissance 4 en ASCII ART
	 * 
	 * @return Représentation ASCII du Puissance 4
	 */

	public String toString()
	{
		String puissance4EnAscii = "";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				puissance4EnAscii += this.obtenirCase(numeroDeLigne, numeroDeColonne);
			puissance4EnAscii += "\n";
		}
		return puissance4EnAscii;
	}
}
