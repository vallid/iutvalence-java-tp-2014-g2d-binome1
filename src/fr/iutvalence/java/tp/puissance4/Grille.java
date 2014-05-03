package fr.iutvalence.java.tp.puissance4;

/**
 * Représente une grille de Puissance4
 * 
 * @author vallid
 */
public class Grille
{
	/**
	 * Le nombre de lignes
	 */
	public static final int NOMBRE_DE_LIGNES = 6;

	/**
	 * Le nombre de colonnes
	 */
	public static final int NOMBRE_DE_COLONNES = 7;

	/**
	 * Les états des cases de la grille
	 */
	public EtatCase[][] etatsDesCases;

	/**
	 * Création d'une grille vide
	 */
	public Grille()
	{
		this.etatsDesCases = new EtatCase[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)

				this.etatsDesCases[numeroDeLigne][numeroDeColonne] = EtatCase.VIDE;				
	}

	/**
	 * Obtenir l'état de la case une position donnée
	 * @param position la position
	 * @return l'état de la case la position donnée
	 */
	public EtatCase obtenirCase(Position position)
	{
		if (position.obtenirNumeroDeLigne()<NOMBRE_DE_LIGNES && position.obtenirNumeroDeColonne()<NOMBRE_DE_COLONNES)
		return this.etatsDesCases[position.obtenirNumeroDeLigne()][position.obtenirNumeroDeColonne()];
		
		return null;
	}
	

	/**
	 * Modifier l'état de la case une position donnée
	 * @param position la position
	 * @param nouvelEtat le nouvel état de la case
	 */
	public void changerEtatCase(Position position, EtatCase nouvelEtat)
	{
		// TODO traiter le cas d'erreur (débordement de grille)
		this.etatsDesCases[position.obtenirNumeroDeLigne()][position.obtenirNumeroDeColonne()]=nouvelEtat;
	}

	/**
	 * Obtenir une représentation en ASCII-art
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String puissance4EnAscii = "";
		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				puissance4EnAscii += this.obtenirCase(new Position(numeroDeLigne, numeroDeColonne));
			puissance4EnAscii += "\n";
		}
		return puissance4EnAscii;
	}

	/**
	 * Savoir si une position est hors de la grille
	 * @param position la position
	 * @return <tt>true</tt> si la position est hors de la grille
	 */
	public boolean estHorsDeLaGrille(Position position)
	{
		// TODO retourner le test, ce serait plus clair
		if (position.obtenirNumeroDeLigne() >=0 && position.obtenirNumeroDeLigne()< NOMBRE_DE_LIGNES)
			if (position.obtenirNumeroDeColonne()>=0 && position.obtenirNumeroDeColonne()< NOMBRE_DE_COLONNES)
				return true;
		return false;
	}
}
