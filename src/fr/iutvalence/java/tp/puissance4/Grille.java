package fr.iutvalence.java.tp.puissance4;

// TODO(Fait) corriger le commentaire
/**
 * Représente une grille de Puissance4
 * @author vallid
 */
public class Grille
{
	/**
	 * la longueur par defaut de la grille
	 */
	public static final int LONGUEUR_GRILLE_DEFAUT = 7;
	
	/**
	 * la largeur par defaut de la grille
	 */
	public static final int LARGEUR_GRILLE_DEFAUT = 6;

	/**
	 * tableau de cases pour définir la grille 
	 */
	public Case[][] cases;

	// TODO(fait) écrire un commentaire plus précis (comment est initialisée la grille ?)
	/**
	 * Permet de créer une grille de taille par defaut : 7 colonnes et 6 lignes
	 * Les cases de la grille sont non occupées
	 */
	public Grille()
	{
		 this.cases = new Case[LONGUEUR_GRILLE_DEFAUT][LARGEUR_GRILLE_DEFAUT];
		 
	}
	
	// TODO (fait)écrire un commentaire plus précis (comment est initialisée la grille ?)
	/**
	 * Permet de créer une nouvelle grille avec une longueur et une largeur choisie
	 * Les cases de la grille sont non occupées
	 * 
	 * @param longueur longueur choisie
	 * @param largeur largeur choisie 
	 */
	public Grille (int longueur,int largeur)
	{
		this.cases = new Case [longueur][largeur];
	}
}
	