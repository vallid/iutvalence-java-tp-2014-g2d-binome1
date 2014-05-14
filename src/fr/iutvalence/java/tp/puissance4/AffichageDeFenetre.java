package fr.iutvalence.java.tp.puissance4;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
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
		fenetre.setSize(600, 600);

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(7, 6));

		for (int numeroDeBouton = 0; numeroDeBouton < 42; numeroDeBouton++)
		{
			JLabel cases = new JLabel();
			cases.setFocusable(false);
			cases.add(new JLabel(new ImageIcon("images/pasdepion.gif")));
			panel.add(cases);
		}
		fenetre.getContentPane().add(panel);
		fenetre.setVisible(true);

	}
}
