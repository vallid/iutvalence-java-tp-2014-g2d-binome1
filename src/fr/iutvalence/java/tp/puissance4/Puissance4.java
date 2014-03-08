package fr.iutvalence.java.tp.puissance4;

/**
 * définition d'une partie de puissance 4
 * @author vallid
 *
 */
public class Puissance4
{
	// TODO l'attribut ne devrait pas être visible
	/**
	 * joueur 1
	 */
	public final Joueur joueur1;

	// TODO l'attribut ne devrait pas être visible
	/**
	 * joueur 2
	 */
	public final Joueur joueur2;
	
	// TODO l'attribut ne devrait pas être visible
	/**
	 * plateau du jeu 
	 */
	public final Grille plateau;
	
	// TODO écrire un commentaire plus précis 
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
