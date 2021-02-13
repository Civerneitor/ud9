/**
 * 
 */
package models;

/**
 * @author Civerneitor
 *
 */
public class Persona {
	//ATRIBUTOS
	private String nom;
	private int edat;
	private boolean gen;
	
	//CONSTRUCTOR
	protected Persona(String nom, int edat, boolean gen) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.gen = gen;
	}

	//GETTERS
	public String getNom() {
		return nom;
	}


	public int getEdat() {
		return edat;
	}


	public boolean isGen() {
		return gen;
	}
	
	
	
}
