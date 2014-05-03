package fr.iutvalence.java.tp.puissance4;

/**
 * Représente les différents états possibles d'une case
 */

public enum EtatCase
{
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
	VIDE;

	/**
	 * @see java.lang.Enum#toString()
	 */
	public String toString()
	{
		if (this == ROUGE)
			return "R";
		if (this == JAUNE)
			return "J";
		else
			return "V";
	}

}