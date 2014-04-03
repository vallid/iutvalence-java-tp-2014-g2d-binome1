package fr.iutvalence.java.tp.puissance4;

/**
 * définition d'une partie de puissance 4
 * 
 * @author vallid
 * 
 */
public class Puissance4
{
	/**
	 * joueur 1
	 */
	private final Joueur joueur1;

	/**
	 * joueur 2
	 */
	private final Joueur joueur2;

	/**
	 * plateau du jeu
	 */
	private final Grille grille;

	/**
	 * Permet de créer une nouvelle partie de puissance4 sur une grille de 7*6
	 * 
	 */
	public Puissance4()
	{
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		this.grille = new Grille();
	}

	/**
	 * lance la partie de Puissance4
	 */
	public void jouer()
	{
		System.out.println("la partie va commencer");
		System.out.println(this.grille);
	}

	/**
	 * Permet de poser un jeton dans une colonne de la grille.
	 * 
	 * @param couleur
	 *            Couleur du jeton
	 * @param numeroDeColonne
	 *            Colonne où poser le jeton
	 */
	private boolean poserJeton(EtatCase couleur, int numeroDeColonne)
	{
		int numeroDeLigne;
		for (numeroDeLigne=0;numeroDeLigne<Grille.NOMBRE_DE_LIGNES; numeroDeLigne++)
			if (this.grille.obtenirCase(numeroDeLigne, numeroDeColonne) == EtatCase.VIDE) break;
			numeroDeLigne++;
		if (numeroDeLigne == Grille.NOMBRE_DE_LIGNES) return false;
		this.grille.changerEtatCase(numeroDeLigne, numeroDeColonne, couleur);
		return true;
	}

}
