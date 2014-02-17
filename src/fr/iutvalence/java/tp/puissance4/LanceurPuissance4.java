package fr.iutvalence.java.tp.puissance4;
/**
 * Permet de lancer une partie de Puissance4
 * @author vallid
 * 
 */
public class LanceurPuissance4
{ 
	/**
	 * Creation et démarrage d'une partie de Puissance 4
	 * @param args les arguments de la ligne de commande (aucun pour l'instant)
	 */
	public static void main (String[]args)
	{
		Puissance4 jeu; 
		jeu = new Puissance4();
		jeu.jouer();
	}
}
