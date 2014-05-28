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
				System.out.println(numeroDeColonne);
				Position positionduJetonPose = this.grille.poserJeton(Couleur.values()[numeroDuTour%2], numeroDeColonne);
				System.out.println(positionduJetonPose.obtenirNumeroDeLigne());
				System.out.println(positionduJetonPose.obtenirNumeroDeColonne());
				System.out.println(grille.obtenirCase(positionduJetonPose));
				System.out.println("jeton posé");
				
				if (positionduJetonPose == null)
				{
					this.affichage.afficherColonneInvalide();
					continue;
				}
				this.affichage.afficherGrille(this.grille);
				System.out.println("grille affichee");
				if (this.grille.estPartieGagneeAutourDUnePosition(positionduJetonPose))
				{
					System.out.println("test");
					this.affichage.afficherFinDePartie(joueurCourant.obtenirCouleurDuPion());
					return;
				}
				break;
			}
			
		}
		System.out.println("Match nul");
	}
}
