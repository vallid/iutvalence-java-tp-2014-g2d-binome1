package fr.iutvalence.java.tp.puissance4;

import javax.swing.SwingUtilities;

public class AffichageGraphique
{
	public static void main(String[] args)
	{

		AffichageDeFenetre ihm = new AffichageDeFenetre();
		SwingUtilities.invokeLater(ihm);
		Joueur[] joueurs = new Joueur[] {ihm, ihm};
		Puissance4 puissance4 = new Puissance4(joueurs, ihm);
		puissance4.jouer();
	}

}
