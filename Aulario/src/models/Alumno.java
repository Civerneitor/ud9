/**
 * 
 */
package models;

import java.util.Random;

/**
 * @author Civerneitor
 *
 */
public class Alumno extends Persona {

	/**
	 * @param nom
	 * @param edat
	 * @param gen
	 */
	//CONSTANTES
	private static int NOVILLOS = 5 ;//probabilidad de ausentarse sobre 10
	//ATRIBUTOS
	private int nota;
	//CONSTRUCTORES
	public Alumno(String nom, int edat, boolean gen) {
		super(nom, edat, gen);
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nom, int edat, boolean gen, int nota) {
		super(nom, edat, gen);
		if(nota>=0 && nota<=10) this.nota = nota;
	}
	
	//GETTERS
	public int getNota() {
		return nota;
	}
	//SETTERS
	public void setNota(int nota) {
		this.nota = nota;
	}
	//METODOS
	public boolean esta() {
		Random rand=new Random();
		if((rand.nextInt(10))<NOVILLOS) {
			return false;
		}else {
			return true;
		}
	}
}
