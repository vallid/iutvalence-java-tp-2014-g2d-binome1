package fr.iutvalence.java.tp.puissance4;

/**
 * Enumération représentant les différentes directions du plan
 * @author vallid
 *
 */
public enum Direction
{
	HAUT(-1,0),
	BAS(1,0),
	GAUCHE(0,-1),
	DROITE(0,1),
	HAUT_GAUCHE(-1,-1),
	HAUT_DROITE(-1,1),
	BAS_GAUCHE(1,-1),
	BAS_DROITE(1,1);

	/**
	 * Différentiel du numéro de ligne lorsque la direction est prise
	 */
	private final int decalageLigne;
	
	/**
	 * Différentiel du numéro de colonne lorsque la direction est prise
	 */
	private final int decalageColonne;
	
	
	/**
	 * Création d'une direction étant donnés les décalages en ligne/colonne
	 * @param decalageLigne le décalage en ligne
	 * @param decalageColonne le décalage en colonne
	 */
	private Direction(int decalageLigne, int decalageColonne)
	{
		this.decalageLigne = decalageLigne;
		this.decalageColonne = decalageColonne;
	}
	
	/**
	 * Obtenir le décalage en ligne
	 * @return le décalage en ligne
	 */
	public int obtenirDecalageLigne()
	{
		return this.decalageLigne;
	}

	/**
	 * Obtenir le décalage en colonne
	 * @return le décalage en colonne
	 */
	public int obtenirDecalageColonne()
	{
		return this.decalageColonne;
	}

}
