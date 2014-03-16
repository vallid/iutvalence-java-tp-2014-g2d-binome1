package fr.iutvalence.java.tp.puissance4;

// TODO écrire un commentaire plus précis (cela ne crée rien)
/**
 * Permet de créer les cases de la Grille du jeu et savoir si une case est
 * occupée ou non
 * 
 * @author vallid
 * 
 */
public class Case
{
	/**
	 * permet de savoir si la case est occupée
	 */
	// TODO l'attribut ne devrait pas être visible
	private Etat etatCase;

	/**
	 * permet de créer une case non occupée
	 */
	public Case()
	{
		this.etatCase = Etat.NONOCCUPE;
	}

}
