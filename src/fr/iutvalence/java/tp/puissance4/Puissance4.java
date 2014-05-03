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
	 * L'affichage
	 */
	private final Affichage affichage;
	
	/**
	 * Le plateau du jeu
	 */
	private final Grille grille;

	/**
	 * Créer une nouvelle partie de puissance4 sur une grille de 7*6
	 * @param joueurs les joueurs
	 * 
	 */
	public Puissance4(Joueur[] joueurs, Affichage affichage)
	{
		this.grille = new Grille();
		this.joueurs = joueurs;
		this.affichage = affichage;
		
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
			this.affichage.afficherDemandeDeColonne(joueurCourant.obtenirCouleurDuPion());
			while (true)
			{
				int numeroDeColonne = joueurCourant.obtenirColonne();
				Position positionduJetonPose = this.grille.poserJeton(joueurCourant.obtenirCouleurDuPion(), numeroDeColonne);
				if (positionduJetonPose == null)
				{
					this.affichage.afficherColonneInvalide();
					continue;
				}
				this.affichage.afficherGrille(this.grille);
				if (this.grille.estPartieGagneeAutourDUnePosition(positionduJetonPose))
				{
					this.affichage.afficherFinDePartie(joueurCourant.obtenirCouleurDuPion());
					return;
				}
				break;
			}
			
		}
		System.out.println("Match nul");
	}
}
