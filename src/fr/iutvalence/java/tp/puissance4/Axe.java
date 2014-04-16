package fr.iutvalence.java.tp.puissance4;

/**
 * Liste des Axes du puissance4
 * @author vallid
 *
 */
public enum Axe
{
	/**
	 * Ligne du puissance4
	 */
	LIGNE(Direction.GAUCHE, Direction.DROITE),
	/**
	 * Colonne du puissance4
	 */
	COLONNE(Direction.HAUT, Direction.BAS),
	/**
	 * Diagonale du puissance 4
	 */
	DIAGONALE1(Direction.HAUT_GAUCHE, Direction.BAS_DROITE),
	/**
	 * Autre diagonale du puissance 4
	 */
	DIAGONALE2(Direction.HAUT_DROITE, Direction.BAS_GAUCHE);
	
	/**
	 * Direction principale de l'axe
	 */
	private final Direction principale;
	/**
	 * Direction opposée à la principale
	 */
	private final Direction secondaire;
	
	/**
	 * Permet de créer un nouvel Axe
	 * @param principale Direction principale de l'Axe
	 * @param secondaire Direction opposée
	 */
	private Axe(Direction principale, Direction secondaire)
	{
		this.principale=principale;
		this.secondaire=secondaire;
	}

	/**
	 * Permet d'obtenir la direction principale de l'axe
	 * @return Direction principale
	 */
	public Direction obtenirPrincipale()
	{
		return this.principale;
	}
	
	/**
	 * Permet d'obtenir la direction secondaire de l'axe
	 * @return Direction secondaire
	 */
	public Direction obtenirSecondaire()
	{
		return this.secondaire;
	}
	
}
