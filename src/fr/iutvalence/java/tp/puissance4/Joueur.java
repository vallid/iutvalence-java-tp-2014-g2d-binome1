package fr.iutvalence.java.tp.puissance4;

/**
 * Représente le comportement attendu d'un joueur de puissance4
 * @author sebastienjean
 *
 */
public interface Joueur
{
	/**
	 * Obtenir la colonne où le jeton doit être posé
	 * @return la colonne où le jeton doit être posé
	 */
	public int obtenirColonne();
	
	/**
	 * Obtenir la couleur du pion associé
	 * @return la couleur du pion associé
	 */
	public Couleur obtenirCouleurDuPion();
}
