package fr.iutvalence.java.tp.puissance4;

/**
 * les caracteristiques de la grille de Puissance4
 * @author vallid
 *
 */
public class Grille
{
	/**
	 * la longueur par defaut de la grille est 7
	 * la largeur par defaut de la grille est 6
	 */
	public static final int LONGUEUR_GRILLE_DEFAUT = 7 ;
	public static final int LARGEUR_GRILLE_DEFAUT = 6 ;
	
	/** Crée une nouvelle grille
	 */
	public grille()
	{
		Case[LONGUEUR_GRILLE_DEFAUT][LARGEUR_GRILLE_DEFAUT] grille = new Grille ;
	}
	
}
