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
		if (this.estGagnee(this.poserJeton(EtatCase.ROUGE, 0)))
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
	 *
	 */
	private Position poserJeton(EtatCase couleur, int numeroDeColonne)
	{
		
		
		for (int numeroDeLigne = this.grille.NOMBRE_DE_LIGNES-1; numeroDeLigne >=0; numeroDeLigne--)
		{
			Position position = new Position(numeroDeLigne, numeroDeColonne);
			if (this.grille.obtenirCase(position)==EtatCase.VIDE)
			{
				this.grille.changerEtatCase(position, couleur);
				return position;
			}
		}
		return null;
	}
		
	/**
	 * Test si la partie est gagnée
	 * @param position Position à tester
	 * @param couleur Couleur à tester
	 * @return True si la partie est gagnée
	 */
	private boolean estGagnee(Position position)
	{
		for (Axe axe : Axe.values())
			if (this.estGagneAxe(position, axe)) return true;
		return false;
	}
	
	public boolean estGagneAxe(Position position, Axe axe)
	{
		int nombreDeJetonsDansLaDirectionPrincipale = this.nombreDeJetonsAlignesDansUneDirection(position, axe.obtenirPrincipale());
		int nombreDeJetonsDansLaDirectionSecondaire = this.nombreDeJetonsAlignesDansUneDirection(position, axe.obtenirSecondaire());
		return (nombreDeJetonsDansLaDirectionPrincipale + nombreDeJetonsDansLaDirectionSecondaire + 1 >= 4);		
	}
	
	private int nombreDeJetonsAlignesDansUneDirection(Position position, Direction direction)
	{
		int nombreDeJetonsAlignes = 0;
		Position positionSuivante = position.voisine(direction);
		while (true)
		{
			if (this.grille.estHorsDeLaGrille(positionSuivante)) 
				break;
			if (this.grille.obtenirCase(positionSuivante) != this.grille.obtenirCase(position))
				break;
			nombreDeJetonsAlignes++;
		}
		return nombreDeJetonsAlignes;
	}

}
