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
		this.poserJeton(EtatCase.ROUGE, 2);
		System.out.println(this.grille);
		this.poserJeton(EtatCase.JAUNE, 2);
		System.out.println(this.grille);
		
	}

	/**
	 * Permet de poser un jeton dans une colonne de la grille.
	 * 
	 * @param couleur
	 *            Couleur du jeton
	 * @param numeroDeColonne
	 *            Colonne où poser le jeton
	 * @return True si le jeton peut être posé, ou False si la colonne est déjà pleine
	 */
	private boolean poserJeton(EtatCase couleur, int numeroDeColonne)
	{
		
		int numeroDeLigne;
		Position position = new Position(0,0);
		for (numeroDeLigne=Grille.NOMBRE_DE_LIGNES-1;numeroDeLigne>=-1;numeroDeLigne--)
		{
			position.changerColonne(numeroDeColonne);
		    position.changerLigne(numeroDeLigne);
			if (this.grille.obtenirCase(position) == EtatCase.VIDE) break;	
		}
			if (position.obtenirLigne() == -1) return false;
		this.grille.changerEtatCase(position, couleur);
		return true;
	}
}
