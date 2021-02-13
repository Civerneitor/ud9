/**
 * 
 */
package models;

import java.util.Random;

/**
 * @author Civerneitor
 *
 */
public class Profesor extends Persona {

	/**
	 * @param nom
	 * @param edat
	 * @param gen
	 */
	//CONSTANTES
	private static double AUSENCIA = 2 ;//Probabilidad de ausentarse sobre 10
	//ATRIBUTOS
	private String asignatura;
	
	//CONSTRUCTORES
	public Profesor(String nom, int edat, boolean gen, String asignatura) {
		super(nom, edat, gen);
		if (asignatura=="Matematicas" || asignatura=="Filosofia" || asignatura=="Fisica") {
			this.asignatura = asignatura;
		}else {
			this.asignatura = "Matematicas";
		}
		
	}
	
	//GETTERS
	public String getAsignatura() {
		return asignatura;
	}
	//SETTERS
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	//METODOS
	public boolean esta() {
		Random rand=new Random();
		if((rand.nextInt(10))<AUSENCIA) {
			System.out.println("no está ");
			return false;
		}else {
			return true;
		}
	}
}
