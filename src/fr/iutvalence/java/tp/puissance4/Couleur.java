package fr.iutvalence.java.tp.puissance4;

/**
 * Représente les différents états possibles d'une case
 */

public enum Couleur
{
	/**
	 * La couleur rouge
	 */
	ROUGE,
	/**
	 * La couleur jaune
	 */
	JAUNE;

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
			return " ";
	}
}