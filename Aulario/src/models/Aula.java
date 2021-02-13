/**
 * 
 */
package models;

/**
 * @author Civerneitor
 *
 */
public class Aula {
	//ATRIBUTOS
	private int num;
	private int aforoMax;
	private String materia;
	private Profesor profesor;
	private Alumno[] lista;
	private int aforo;
	//CONSTRUCTORES
	public Aula(int num, int aforoMax, String materia, Profesor profesor) {
		super();
		if(aforoMax<=0) aforoMax=1;
		if (materia=="Matematicas" || materia=="Filosofia" || materia=="Fisica") {
			this.materia = materia;
		}else {
			this.materia = "Matematicas";
		}
		if(profesor.getAsignatura().equals(materia)) {
			this.num = num;
			this.aforoMax = aforoMax;
			this.profesor = profesor;
			this.lista = new Alumno[aforoMax];
			this.aforo = 0;
		}else {
			this.num = num;
			this.aforoMax = aforoMax;
			this.profesor = profesor;
			this.lista = new Alumno[aforoMax];
			this.aforo = 0;
		}
	}
	//GETTERS
	public int getNum() {
		return num;
	}

	public int getAforoMax() {
		return aforoMax;
	}

	public String getMateria() {
		return materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public Alumno[] getLista() {
		return lista;
	}

	public int getAforo() {
		return aforo;
	}
	//METODOS
	public void addAlumno(Alumno alumn) {
		if(aforo<aforoMax) {
			lista[aforo]=alumn;
			if(aforo<aforoMax) aforo++;
		}
	}
	public boolean lista() {
		if(profesor.esta()) {//miramos si el profesor está
			int c=0;
			for(int i=0;i<aforo;i++) {
				if (lista[i].esta()) {//miramos si el alumno está y acumulamos
					c++;
				}
			}
			if (c>aforo/2) return true;//miramos si están la más de la mitad de los alumnos
			else return false;
		}else return false;
	}
	
}
