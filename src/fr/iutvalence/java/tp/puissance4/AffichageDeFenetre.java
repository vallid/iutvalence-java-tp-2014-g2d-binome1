package fr.iutvalence.java.tp.puissance4;


import javax.swing.JFrame;


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
	fenetre.setVisible(true);
		

}
}
