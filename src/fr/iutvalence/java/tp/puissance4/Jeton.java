package fr.iutvalence.java.tp.puissance4;

// TODO (fait) écrire un commentaire plus précis (cette classe ne crée rien)
/**
 * défini les caractéristiques du Jeton
 * 
 * @author vallid
 * 
 */
public class Jeton
{

	// TODO (fait)réécrire les constantes sous la forme d'une énumération
	// "Couleur"

	// TODO (fait) l'attribut ne devrait pas être visible
	/**
	 * Couleur du jeton
	 */
	private Etat etatJeton;

	// TODO (fait) écrire le constructeur sans paramètre
	public Jeton()
	{
		this.etatJeton = Etat.JAUNE;

	}
}
