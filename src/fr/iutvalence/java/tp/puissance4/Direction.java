package fr.iutvalence.java.tp.puissance4;

public enum Direction
{
	HAUT(-1,0),
	BAS(1,0),
	GAUCHE(0,-1),
	DROITE(0,1),
	HAUT_GAUCHE(-1,-1),
	HAUT_DROITE(-1,1),
	BAS_GAUCHE(1,-1),
	BAS_DROITE(1,1);

	private final int decalageLigne;
	
	private final int decalageColonne;
	
	
	private Direction(int decalageLigne, int decalageColonne)
	{
		this.decalageLigne = decalageLigne;
		this.decalageColonne = decalageColonne;
	}
	
	public int obtenirDecalageLigne()
	{
		return this.decalageLigne;
	}

	public int obtenirDecalageColonne()
	{
		return this.decalageColonne;
	}

}
