package fr.iutvalence.java.tp.puissance4;

/**
 * REprésente une position sur une grille 2D
 * @author vallid
 */
public class Position
{	
	/**
	 * Numéro de ligne
	 */
	private final int numeroDeLigne;

	/**
	 * Numéro de colonne
	 */
	private final int numeroDeColonne;
	
	/**
	 * Créer une nouvelle position étant donnés les numéros de ligne/colonne
	 * @param numeroDeLigne numéro de la ligne
	 * @param numeroDeColonne numéro de la colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroDeLigne=numeroDeLigne;
		this.numeroDeColonne=numeroDeColonne;
	}
	
	/**
	 * Permet d'obtenir le numéro de ligne
	 * @return le numéro de ligne
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}
	
	/**
	 * Permet d'obtenir le numéro de colonne
	 * @return le numéro de colonne
	 */
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
	
	/**
	 * Obtenir la position voisine dans une direction donnée
	 * @param direction la direction
	 * @return la position voisine dans une direction donnée
	 */
	public Position obtenirVoisine(Direction direction)
	{
		return new Position(this.numeroDeLigne+direction.obtenirDecalageLigne(), this.numeroDeColonne+direction.obtenirDecalageColonne());
	}
}
