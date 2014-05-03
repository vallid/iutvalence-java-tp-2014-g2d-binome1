package fr.iutvalence.java.tp.puissance4;

/**
 * Représente le comportement attendu d'un affichage de Puissance4
 * @author sebastienjean
 *
 */
public interface Affichage
{
	
	/**
	 * Afficher la demande de colonne 
	 * @param couleurDuPion la couleur du pion à poser
	 */
	public void afficherDemandeDeColonne(Couleur couleurDuPion);
	
	/**
	 * Afficher un message pour l'erreur "colonne invalide"
	 */
	public void afficherColonneInvalide();
	
	/**
	 * Afficher la grille
	 * @param grille la grille
	 */
	public void afficherGrille(Grille grille);
	
	/**
	 * Afficher la fin de la partie
	 * @param couleurDuPionGagnant la couleur du pion gagnant
	 */
	public void afficherFinDePartie(Couleur couleurDuPionGagnant);

}
