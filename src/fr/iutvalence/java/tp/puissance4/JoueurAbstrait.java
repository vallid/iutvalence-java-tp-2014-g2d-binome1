package fr.iutvalence.java.tp.puissance4;

/**
 * Implémentation abstraite d'un joueur
 * 
 * @author sebastienjean
 * 
 */
public abstract class JoueurAbstrait implements Joueur
{
	/**
	 * La couleur du pion du joueur
	 */
	private final Couleur couleurDuPion;

	/**
	 * Créer un nouveau joueur abstrait, étant donné la couleur du pion associé
	 * @param couleurDuPion la couleur du pion associé
	 */
	public JoueurAbstrait(Couleur couleurDuPion)
	{
		this.couleurDuPion = couleurDuPion;
	}

	/**
	 * @see fr.iutvalence.java.tp.puissance4.Joueur#obtenirCouleurDuPion()
	 */
	public Couleur obtenirCouleurDuPion()
	{
		return this.couleurDuPion;
	}
}
