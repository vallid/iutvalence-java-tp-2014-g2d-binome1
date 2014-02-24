package fr.iutvalence.java.tp.puissance4;

/**
 * les caracteristiques de la grille de Puissance4
 * 
 * @author vallid
 * 
 */
public class Grille
{
	/**
	 * la longueur par defaut de la grille est 7 
	 */
	public static final int LONGUEUR_GRILLE_DEFAUT = 7;
	/**
	 * la largeur par defaut de la grille est 6
	 */
	public static final int LARGEUR_GRILLE_DEFAUT = 6;

	/**
	 * tableau de cases pour définir la grille 
	 */
	public Case[][] cases;

	/**
	 * Crée une nouvelle grille de taille par defaut 
	 */
	public Grille()
	{
		 this.cases = new Case[LONGUEUR_GRILLE_DEFAUT][LARGEUR_GRILLE_DEFAUT];
		 
	}
	/**
	 * crée une nouvelle grille de taille choisie par l'utilisateur 
	 * @param longueur :longueur choisie
	 * @param largeur :largeur choisie 
	 */
	public Grille (int longueur,int largeur)
	{
		this.cases = new Case [longueur][largeur];
	}
}
	