package fr.iutvalence.java.tp.puissance4;

import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AffichageDeFenetre implements Runnable,Affichage,ActionListener,Joueur
{

	public static boolean aJoue;
	public static int numeroColonne;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
		
	public void run()
	{
		JFrame fenetre = new JFrame();

		fenetre.setTitle("Puissance 4");
		fenetre.setSize(500,500);
		fenetre.setResizable(false);
		
		JSplitPane puissance4 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		puissance4.setDividerSize(0);
		puissance4.setResizeWeight(1.0);
		
		JPanel grilleDeCases = new JPanel();
		grilleDeCases.setLayout(new GridLayout(6, 7));
		
		for (int numeroDeBouton = 0; numeroDeBouton < 42; numeroDeBouton++)
		{
			JLabel cases = new JLabel(new ImageIcon("images/pasdepion.png"));
			cases.setFocusable(false);
			grilleDeCases.add(cases);
		}
		
		JPanel bouttons = new JPanel();
		bouttons.setLayout(new GridLayout(1,7));
		
		for (int numeroBouton=0;numeroBouton<7;numeroBouton++)
		{
			BouttonDepotPion boutton = new BouttonDepotPion(numeroBouton);
			boutton.setFocusable(true);
			bouttons.add(boutton);
			boutton.addActionListener(this);
		}
		
		puissance4.setTopComponent(bouttons);
		puissance4.setBottomComponent(grilleDeCases);
		fenetre.getContentPane().add(puissance4);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public int obtenirColonne()
	{
		System.out.println("obtenir colonne");
		aJoue=false;
		while (!aJoue);
		System.out.println("fin obtenir colonne");
		return numeroColonne;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		System.out.println("click");
		BouttonDepotPion bouton =(BouttonDepotPion)event.getSource();
		numeroColonne=bouton.obtenirNumeroDeColonne();
		aJoue=true;
		System.out.println("fin click");
	}
	
	@Override
	public void afficherDemandeDeColonne(Couleur couleurDuPion)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void afficherColonneInvalide()
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afficherGrille(Grille grille)
	{
		
	}
	@Override
	public void afficherFinDePartie(Couleur couleurDuPionGagnant)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public Couleur obtenirCouleurDuPion()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
