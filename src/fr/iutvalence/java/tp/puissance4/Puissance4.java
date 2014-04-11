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
		if (this.estGagneeColonne(this.poserJeton(EtatCase.ROUGE, 2),EtatCase.ROUGE)==true)
			System.out.println("La partie est gagnée");
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
	private Position poserJeton(EtatCase couleur, int numeroDeColonne)
	{
		
		int numeroDeLigne;
		Position position = new Position(0,0);
		for (numeroDeLigne=Grille.NOMBRE_DE_LIGNES-1;numeroDeLigne>=-1;numeroDeLigne--)
		{
			position.changerColonne(numeroDeColonne);
		    position.changerLigne(numeroDeLigne);
			if (this.grille.obtenirCase(position) == EtatCase.VIDE) break;	
		}
		this.grille.changerEtatCase(position, couleur);
		return position;
	}
	
	/**
	 * Test si la partie est gagnée en ligne
	 * @param position Position à teset
	 * @param couleur Couleur à tester
	 * @return True si la partie est gagnée
	 */
	private boolean estGagneeLigne(Position position, EtatCase couleur)
	{
		int compteur=0;
		while(this.grille.obtenirCase(position)==couleur)
		{
			position.changerColonne(position.obtenirColonne()-1);
		}
		position.changerColonne(position.obtenirColonne()+1);
		
		while(this.grille.obtenirCase(position)==couleur)
		{
			compteur++;
			position.changerColonne(position.obtenirColonne()+1);
		}
		
		if (compteur==4) return true;
		return false;
	}
	
	/**
	 * Test si la partie est gagnée en colonne
	 * @param position Position à tester
	 * @param couleur Couleur à Teset
	 * @return True si la partie est gagnée
	 */
	private boolean estGagneeColonne(Position position ,EtatCase couleur)
	{
		int compteur=0;
	while (this.grille.obtenirCase(position)==couleur)
	{
		compteur++;
		position.changerLigne(position.obtenirLigne()+1);
		
	}
	if (compteur==4) return true;
	return false;
	}
	
	/**
	 * Test si la partie est gagnée
	 * @param position Position à tester
	 * @param couleur Couleur à tester
	 * @return True si la partie est gagnée
	 */
	private boolean estGagnee(Position position ,EtatCase couleur)
	{
		return this.estGagneeColonne(position, couleur)||this.estGagneeLigne(position, couleur);
	}
}
