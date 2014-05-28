package fr.iutvalence.java.tp.puissance4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class BouttonDepotPion extends JButton 
{

	private final int numeroDeColonne;
	private boolean estOccupee;

	public BouttonDepotPion(int numeroDeColonne)
	{
		super(""+numeroDeColonne);
		this.numeroDeColonne = numeroDeColonne;	
		this.estOccupee=false;
	}
	
	public int obtenirNumeroDeColonne()
	{
		return numeroDeColonne;
	}
	
	public boolean obtenirOccupation()
	{
		return this.estOccupee;
	}
	
	public void poserPion(Couleur couleur)
	{
		this.setIcon(new ImageIcon(couleur.toString()+".png"));
	}


}
