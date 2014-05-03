package fr.iutvalence.java.tp.puissance4;

import java.util.Random;

/**
 * Implémentation aléatoire du joueur
 * @author sebastienjean
 *
 */
public class JoueurAleatoire extends JoueurAbstrait
{
	/**
	 * Un générateur de nombres aléatoires
	 */
	private final Random generateurDeNombresAleatoires;
	
	/**
	 * Créer un nouveau joueur aléatoire
	 * @param couleurDuPion la couleur du pion associé
	 */
	public JoueurAleatoire(Couleur couleurDuPion)
	{
		super(couleurDuPion);
		this.generateurDeNombresAleatoires = new Random();
	}
	
	@Override
	public int obtenirColonne()
	{
		return this.generateurDeNombresAleatoires.nextInt(Grille.NOMBRE_DE_COLONNES);		
	}
}
