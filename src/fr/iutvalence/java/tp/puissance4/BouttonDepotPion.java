package fr.iutvalence.java.tp.puissance4;

import javax.swing.JButton;

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
	
	public void poserPion()
	{
		
	}
}
