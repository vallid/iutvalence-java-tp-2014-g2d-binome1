package fr.iutvalence.java.tp.puissance4;

/**
 * définition d'une partie de puissance 4
 * @author vallid
 *
 */
public class Puissance4
{
	// TODO (fait) l'attribut ne devrait pas être visible
	/**
	 * joueur 1
	 */
	private final Joueur joueur1;

	// TODO (fait) l'attribut ne devrait pas être visible
	/**
	 * joueur 2
	 */
	private final Joueur joueur2;
	
	// TODO (fait)l'attribut ne devrait pas être visible
	/**
	 * plateau du jeu 
	 */
	private final Grille plateau;
	
	// TODO (fait) écrire un commentaire plus précis 
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
	
}
