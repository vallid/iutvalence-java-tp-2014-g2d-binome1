package fr.iutvalence.java.tp.puissance4;

// TODO écrire un commentaire plus précis
/**
 * Permet de créer les cases de la Grille du jeu
 * @author vallid
 *
 */
public class Case
{
	/**
	 * permet de savoir si la case est occupée 
	 */
	// TODO l'attribut ne devrait pas être visible
	public boolean estOccupe;
	
	/**
	 * permet de créer une case non occupée 
	 */
	public Case()
	{
		this.estOccupe = false;	
	}
}
