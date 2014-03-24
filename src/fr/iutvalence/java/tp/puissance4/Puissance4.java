package fr.iutvalence.java.tp.puissance4;

/**
 * définition d'une partie de puissance 4
 * @author vallid
 *
 */
public class Puissance4
{
	/**
	 * joueur 1
	 */
	private final Joueur joueur1;

	/**
	 * joueur 2
	 */
	private final Joueur joueur2;
	
	/**
	 * plateau du jeu 
	 */
	private final Grille plateau;
	
	/**
	 * Permet de créer une nouvelle partie de puissance4 sur une grille de 7*6
	 * 
	 */
	public Puissance4()
	{
		this.joueur1= new Joueur();
		this.joueur2= new Joueur();
		this.plateau= new Grille();	
	}
	
	/**
	 * lance la partie de Puissance4
	 */
	public void jouer()
	{
		System.out.println("la partie va commencer");
	}
	
	/**
	 * Permet de poser un jeton dans une colonne de la grille.
	 * @param couleur Couleur du jeton
	 * @param colonne Colonne où poser le jeton
	 */
	public void poserJeton(EtatsCase couleur,int colonne)
	{
		int ligne=0;
		while(plateau.obtenirCase(colonne, ligne).obtenirEtat()!=EtatsCase.NONOCCUPE);
		{
			ligne++;
		}
		plateau.obtenirCase(colonne, ligne).changerEtatCase(couleur);
	}
	
}
