package fr.iutvalence.java.tp.puissance4;

// TODO(fait) écrire le commentaire

/**
 * Représente les différents états possibles d'une case 
 */

// TODO (fait) renommer (plus explicite)

public enum EtatsCase
{
	// TODO (fait) écrire un commentaire pour chaque constante
	/**
	 * La case est occupée par un jeton rouge
	 */
	ROUGE,
	/**
	 * La case est occupée par un jeton Jaune
	 */
	JAUNE,
	/**
	 * La case n'est occupée par aucun jeton
	 */
	NONOCCUPE;
	
	/**
	 * Attribue une représentation en ASCII à chaque état
	 */
	public String toString()
{
if (this == ROUGE) return "R";
if (this == JAUNE) return "J";
else return "N";
}
	
}