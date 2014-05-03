package fr.iutvalence.java.tp.puissance4;
import java.util.Scanner;

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
		Scanner saisieUtilisateur = new Scanner(System.in); 
		
		System.out.println("la partie va commencer. Joueur 1: Pions rouges, Joueur 2: Pions jaunes.");
		System.out.println(this.grille);
		
		while(true)
		{
			System.out.println("Joueur 1, entrez la colonne dans laquelle vous voulez poser un jeton");
			int colonne = saisieUtilisateur.nextInt();
			if (this.estGagnee(this.poserJeton(EtatCase.ROUGE, colonne)))
			{
				System.out.println("Le joueur 1 gagne la partie !");
				break;
			}
			System.out.println(this.grille);
			
			System.out.println("Joueur 2, entrez la colonne dans laquelle vous voulez poser un jeton");
			colonne = saisieUtilisateur.nextInt();
			if (this.estGagnee(this.poserJeton(EtatCase.JAUNE, colonne)))
			{
				System.out.println("Le joueur 1 gagne la partie !");
				break;
			}
			System.out.println(this.grille);
		}
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
	 * Permet de savoir si la partie est gagnée
	 * @param position Position a tester
	 * @return True si la partie est gagnée
	 */
	private boolean estGagnee(Position position)
	{
		for (Axe axe : Axe.values())
			if (this.estGagneAxe(position, axe)) return true;
		return false;
	}
	
	/**
	 * Permet de savoir si la partie est gagnée selon un axe
	 * @param position Position à tester
	 * @param axe Axe a tester
	 * @return True si la partie est gagnée
	 */
	public boolean estGagneAxe(Position position, Axe axe)
	{
		int nombreDeJetonsDansLaDirectionPrincipale = this.nombreDeJetonsAlignesDansUneDirection(position, axe.obtenirPrincipale());
		int nombreDeJetonsDansLaDirectionSecondaire = this.nombreDeJetonsAlignesDansUneDirection(position, axe.obtenirSecondaire());
		return (nombreDeJetonsDansLaDirectionPrincipale + nombreDeJetonsDansLaDirectionSecondaire + 1 >= 4);		
	}
	
	/**
	 * @param position
	 * @param direction
	 * @return
	 */
	/**
	 * Permet de connaitre le nombre de jetons alignés sur une direction
	 * @param position Position d'où l'on commence à compter
	 * @param direction Direction où l'on compte
	 * @return Le nombre de jetons alignés
	 */
	private int nombreDeJetonsAlignesDansUneDirection(Position position, Direction direction)
	{
		int nombreDeJetonsAlignes = 0;
		Position positionSuivante = position.obtenirVoisine(direction);
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
