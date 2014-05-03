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
		if (position.obtenirNumeroDeLigne()<NOMBRE_DE_LIGNES && position.obtenirNumeroDeColonne()<NOMBRE_DE_COLONNES)
		return this.etatsDesCases[position.obtenirNumeroDeLigne()][position.obtenirNumeroDeColonne()];
		else return null;
	}
	

	/**
	 * @param position Position de la case que l'on veut modifier
	 * @param nouvelEtat Nouvel état de la case
	 */
	public void changerEtatCase(Position position, EtatCase nouvelEtat)
	{
		// TODO (Fait) à completer
		this.etatsDesCases[position.obtenirNumeroDeLigne()][position.obtenirNumeroDeColonne()]=nouvelEtat;
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
				puissance4EnAscii += this.obtenirCase(new Position(numeroDeLigne, numeroDeColonne));
			puissance4EnAscii += "\n";
		}
		return puissance4EnAscii;
	}

	public boolean estHorsDeLaGrille(Position positionSuivante)
	{
		if (positionSuivante.obtenirNumeroDeLigne() >=0 && positionSuivante.obtenirNumeroDeLigne()< NOMBRE_DE_LIGNES)
			if (positionSuivante.obtenirNumeroDeColonne()>=0 && positionSuivante.obtenirNumeroDeColonne()< NOMBRE_DE_COLONNES)
				return true;
		return false;
	}
}
