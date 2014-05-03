package fr.iutvalence.java.tp.puissance4;

/**
 * Implémentation d'un affichage en mode texte
 * 
 * @author sebastienjean
 * 
 */
public class AffichageConsole implements Affichage
{

	@Override
	public void afficherDemandeDeColonne(Couleur couleurDuPion)
	{
		System.out.println("Joueur " + couleurDuPion + " : colonne ?");
	}

	@Override
	public void afficherColonneInvalide()
	{
		System.out.println("Position invalide ! ");
	}

	@Override
	public void afficherGrille(Grille grille)
	{

		String puissance4EnAscii = "";
		for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++)
				puissance4EnAscii += grille.obtenirCase(new Position(
						numeroDeLigne, numeroDeColonne));
			puissance4EnAscii += "\n";
		}
		System.out.println(puissance4EnAscii);

	}

	@Override
	public void afficherFinDePartie(Couleur couleurDuPionGagnant)
	{
		switch (couleurDuPionGagnant)
		{
		case ROUGE:
		case JAUNE:
			System.out.println("Gagne !");
			break;
		default:
			System.out.println("Match nul !");
		}
	}

}
