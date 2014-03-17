package fr.iutvalence.java.tp.puissance4;

// TODO(fait) écrire un commentaire plus précis (cela ne crée rien)
/**
 * Représente une case de la Grille du jeu et son état: Jaune, rouge ou non occupée
 * 
 * @author vallid
 * 
 */
public class Case
{
	/**
	 * permet de savoir l'état de la case
	 */
	// TODO (fait) l'attribut ne devrait pas être visible
	private Etat etatCase;
	
	/**
	 * permet de créer une case non occupée
	 */
	
	public Case()
	{
		this.etatCase = Etat.NONOCCUPE;
	}
	
	public Etat obtenirEtat()
	{
		return this.etatCase;
	}

}
