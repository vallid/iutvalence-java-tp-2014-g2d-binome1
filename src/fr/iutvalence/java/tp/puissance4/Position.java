package fr.iutvalence.java.tp.puissance4;

/**
 * @author vallid
 * Position sur le plateau
 */
public class Position
{	
	/**
	 * Numéro de Ligne de la position
	 */
	private final int numeroLigne;

	/**
	 * Numéro de Colonne de la position
	 */
	private final int numeroColonne;
	
	/**
	 * Permet de créer une nouvelle position
	 * @param ligne numéro de la ligne de la position
	 * @param colonne numéro de la colonne de la position
	 */
	public Position(int ligne, int colonne)
	{
		this.numeroLigne=ligne;
		this.numeroColonne=colonne;
	}
	
	/**
	 * Permet d'obtenir la ligne d'une position
	 * @return ligne de la position
	 */
	public int obtenirLigne()
	{
		return this.numeroLigne;
	}
	
	/**
	 * Permet d'obtenir la colonne d'une position
	 * @return colonne de la position
	 */
	public int obtenirColonne()
	{
		return this.numeroColonne;
	}
	
	public Position voisine(Direction direction)
	{
		return new Position(this.numeroLigne+direction.obtenirDecalageLigne(), this.numeroColonne+direction.obtenirDecalageColonne());
	}
}
