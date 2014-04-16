package fr.iutvalence.java.tp.puissance4;

public enum Axe
{
	LIGNE(Direction.GAUCHE, Direction.DROITE),
	COLONNE(Direction.HAUT, Direction.BAS),
	DIAGONALE1(Direction.HAUT_GAUCHE, Direction.BAS_DROITE),
	DIAGONALE2(Direction.HAUT_DROITE, Direction.BAS_GAUCHE);
	
	private final Direction principale;
	private final Direction secondaire;
	
	private Axe(Direction principale, Direction secondaire)
	{
		this.principale=principale;
		this.secondaire=secondaire;
	}

	public Direction obtenirPrincipale()
	{
		return this.principale;
	}
	
	public Direction obtenirSecondaire()
	{
		return this.secondaire;
	}
	
}
