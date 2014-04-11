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
			{
				this.etatsDesCases[numeroDeLigne][numeroDeColonne] = EtatCase.VIDE;
			}
				
	}

	/**
	 * Permet d'obtenir une case à la position indiquée en
	 * paramètre
	 * @param position : Position de la case à obtenir
	 * @return La case
	 */
	public EtatCase obtenirCase(Position position)
	{
		// TODO(fait) cas d'erreur ? soit return null, soit une exception
		if (position.obtenirLigne()<NOMBRE_DE_LIGNES && position.obtenirColonne()<NOMBRE_DE_COLONNES)
		return this.etatsDesCases[position.obtenirLigne()][position.obtenirColonne()];
		else return null;
	}
	
	/**
	 * Permet de changer l'état d'une case du plateau
	 * @param numeroDeLigne numero de la ligne où se situe la case
	 * @param numeroDeColonne numero de la colonne où se situe la case
	 * @param nouvelEtat etat de la case après la modification
	 */
	public void changerEtatCase(Position position, EtatCase nouvelEtat)
	{
		// TODO (Fait) à completer
		this.etatsDesCases[position.obtenirLigne()][position.obtenirColonne()]=nouvelEtat;
	}
	/**
	 * Permet de représenter le puissance 4 en ASCII ART
	 * 
	 * @return Représentation ASCII du Puissance 4
	 */

	public String toString()
	{
		String puissance4EnAscii = "";
		Position position = new Position(0,0);
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
			{
				position.changerColonne(numeroDeColonne);
			    position.changerLigne(numeroDeLigne);
				puissance4EnAscii += this.obtenirCase(position);
			}
			puissance4EnAscii += "\n";
		}
		return puissance4EnAscii;
	}
}
