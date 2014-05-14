package fr.iutvalence.java.tp.puissance4;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;


public class AffichageDeFenetre implements Runnable 
{

/* (non-Javadoc)
 * @see java.lang.Runnable#run()
 */
@Override
public void run()
{
	JFrame fenetre = new JFrame();
	
	fenetre.setTitle("Puissance 4");
	fenetre.setSize(600, 600);
	
	JPanel panel = new JPanel();
	
	panel.setLayout(new  GridLayout(7,6));
	
	for (int numeroDeBouton = 0; numeroDeBouton<42; numeroDeBouton++){
		JButton bouton = new JButton("");
		bouton.setFocusable(false);
		panel.add(bouton);
		}
	fenetre.getContentPane().add(panel);	
	fenetre.setVisible(true);
	
		

}
}

