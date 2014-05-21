package fr.iutvalence.java.tp.puissance4;

import javax.swing.ImageIcon;

import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class AffichageDeFenetre implements Runnable
{

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
		
		JPanel grille = new JPanel();
		grille.setLayout(new GridLayout(6, 7));
		
		for (int numeroDeBouton = 0; numeroDeBouton < 42; numeroDeBouton++)
		{
			JLabel cases = new JLabel(new ImageIcon("images/pasdepion.png"));
			cases.setFocusable(false);
			grille.add(cases);
		}
		
		JPanel bouttons = new JPanel();
		bouttons.setLayout(new GridLayout(1,7));
		
		for (int numeroBouton=1;numeroBouton<8;numeroBouton++)
		{
			BouttonDepotPion boutton = new BouttonDepotPion(numeroBouton);
			boutton.setFocusable(true);
			bouttons.add(boutton);
		}
		
		puissance4.setTopComponent(bouttons);
		puissance4.setBottomComponent(grille);
		fenetre.getContentPane().add(puissance4);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
