package fr.iutvalence.java.tp.puissance4;

// TODO(fait) écrire un commentaire plus précis
/**
 * Permet de créer les cases de la Grille du jeu
 * et savoir  si une case est occupée ou non 
 * @author vallid
 *
 */
public class Case
{
	/**
	 * permet de savoir si la case est occupée 
	 */
	// TODO (fait) l'attribut ne devrait pas être visible
	private boolean estOccupe;
	
	/**
	 * permet de créer une case non occupée 
	 */
	public Case()
	{
		this.estOccupe = false;	
	}
}
