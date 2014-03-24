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
			
		for(int ligne=0;ligne<LARGEUR_GRILLE_DEFAUT;ligne++)
		{
			for(int colonne=0;colonne<LONGUEUR_GRILLE_DEFAUT;colonne++)
			{
				this.cases[colonne][ligne]= new Case();
			}
		}
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
		
		for(int ligne=0;ligne<largeur;ligne++)
		{
			for(int colonne=0;colonne<longueur;colonne++)
			{
				this.cases[colonne][ligne]= new Case();
			}
		}
	}
	
	/**
	 * Permet d'obtenir une case à la colonne et à la ligne indiqués en paramètre
	 * @param colonne : Colonne de la case à obtenir
	 * @param ligne : Ligne de la case à Obtenir
	 * @return La case
	 */
	public Case obtenirCase(int colonne, int ligne)
	{
		return this.cases[colonne][ligne];
	}
	
	/**
	 * Permet de représenter le puissance 4 en ASCII ART
	 * 
	 * @return Représentation ASCII du Puissance 4
	 */
	
	public String afficherPlateau()
	{
		String puissance4EnAscii = "";
		
		for (int ligne=0;ligne<LARGEUR_GRILLE_DEFAUT;ligne++)
		{
			for (int colonne=0;colonne<LONGUEUR_GRILLE_DEFAUT;colonne++)
			{
				puissance4EnAscii += this.obtenirCase(colonne, ligne).obtenirEtat().toString();
				
				if (colonne == 6)
				{
					puissance4EnAscii += "\n";
				}
			}
		}
		return puissance4EnAscii;
	}
}
	