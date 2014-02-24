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
	public final Joueur joueur1;
	/**
	 * joueur 2
	 */
	public final Joueur joueur2;
	/**
	 * plateau du jeu 
	 */
	public final Grille plateau;
	
	
	
	/**
	 * crée une nouvelle partie de puissance4 
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
	
}
