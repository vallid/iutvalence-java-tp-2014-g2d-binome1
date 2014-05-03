package fr.iutvalence.java.tp.puissance4;

/**
 * Représente une partie de puissance 4
 * 
 * @author vallid
 * 
 */
public class Puissance4
{
	/**
	 * Les joueurs
	 */
	private final Joueur[] joueurs;
	
	/**
	 * Le plateau du jeu
	 */
	private final Grille grille;

	/**
	 * Créer une nouvelle partie de puissance4 sur une grille de 7*6
	 * @param joueurs les joueurs
	 * 
	 */
	public Puissance4(Joueur[] joueurs)
	{
		this.grille = new Grille();
		this.joueurs = joueurs;
		
	}

	/**
	 * Démarrer la partie de Puissance4
	 */
	public void jouer()
	{		
		for (int numeroDuTour=1; numeroDuTour<= Grille.NOMBRE_DE_COLONNES*Grille.NOMBRE_DE_LIGNES; numeroDuTour++)
		{
			int offsetJoueurCourant = (numeroDuTour % 2);
			Joueur joueurCourant = this.joueurs[offsetJoueurCourant];
			System.out.println("Joueur "+offsetJoueurCourant+1+" : colonne ?");
			while (true)
			{
				int numeroDeColonne = joueurCourant.obtenirColonne();
				Position positionduJetonPose = this.grille.poserJeton(joueurCourant.obtenirCouleurDuPion(), numeroDeColonne);
				if (positionduJetonPose == null)
				{
					System.out.println("Position invalide ! ");
					continue;
				}
				
				if (this.grille.estPartieGagneeAutourDUnePosition(positionduJetonPose))
				{
					System.out.println("Gagne !");
					return;
				}
				break;
			}
			
		}
		System.out.println("Match nul");
	}
}
