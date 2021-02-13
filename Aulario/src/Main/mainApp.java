/**
 * 
 */
package Main;

import models.Profesor;
import models.Alumno;
import models.Aula;

/**
 * @author Civerneitor
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generamos profesores
		Profesor x = new Profesor("Juan",37,false,"Matematicas");
		Profesor y = new Profesor("Juana",38,true,"Filosofia");
		Profesor z = new Profesor("Juanjo",47,false,"Fisica");
		//Generamos Alumnos
		Alumno a = new Alumno("Josito",13,false,5);
		Alumno b = new Alumno("Josefa",13,true,2);
		Alumno c = new Alumno("Jorge",13,false,0);
		Alumno d = new Alumno("Jaimito",13,false,1);
		Alumno e = new Alumno("Jacinta",13,true,7);
		Alumno f = new Alumno("Jin",13,false,9);
		Alumno g = new Alumno("Jana",13,true,6);
		Alumno h = new Alumno("Jupiter",13,false,10);
		Alumno i = new Alumno("Jonias",13,false,6);
		Alumno j = new Alumno("Judas",13,false,8);
		Alumno k = new Alumno("Joseph",13,false,10);
		Alumno l = new Alumno("Julk",13,false,3);
		Alumno m = new Alumno("Jamon",15,false,6);
		//Generamos Aulas
		Aula magna = new Aula(123, 8, "Matematicas",x);
		Aula ulises = new Aula(124, 8, "Filosofia",y);
		Aula lambda = new Aula(125, 8, "Fisica",z);
		//Añadimos alumnos a las aulas
		magna.addAlumno(a);
		magna.addAlumno(b);
		magna.addAlumno(c);
		magna.addAlumno(d);
		magna.addAlumno(e);
		magna.addAlumno(f);
		magna.addAlumno(g);
		magna.addAlumno(h);
		ulises.addAlumno(i);
		ulises.addAlumno(j);
		ulises.addAlumno(k);
		lambda.addAlumno(l);
		lambda.addAlumno(m);
		
		if(magna.lista()) {//Comprovamos si el aula está lista para dar clase
			System.out.println("En el aula "+magna.getNum()+" se puede dar clase");
			System.out.println("Los alumnos siguientes están aprobados:");
			Alumno[] alumnos= magna.getLista();
			for(int n=0; n<magna.getAforo();n++) {//chicos
				if(alumnos[n].getNota()>=5 && alumnos[n].isGen()==false) System.out.println("El alumno "+alumnos[n].getNom()+" está aprobado con nota "+alumnos[n].getNota());
			}
			for(int n=0; n<magna.getAforo();n++) {//chicas
				if(alumnos[n].getNota()>=5 && alumnos[n].isGen()==true) System.out.println("La alumna "+alumnos[n].getNom()+" está aprobada con nota "+alumnos[n].getNota());
			}
		}
		if(ulises.lista()) {
			System.out.println("En el aula "+ulises.getNum()+" se puede dar clase");
			System.out.println("Los alumnos siguientes están aprobados:");
			Alumno[] alumnos= ulises.getLista();
			for(int n=0; n<ulises.getAforo();n++) {
				if(alumnos[n].getNota()>=5 && alumnos[n].isGen()==false) System.out.println("El alumno "+alumnos[n].getNom()+" está aprobado con nota "+alumnos[n].getNota());
			}
			for(int n=0; n<ulises.getAforo();n++) {
				if(alumnos[n].getNota()>=5 && alumnos[n].isGen()==true) System.out.println("La alumna "+alumnos[n].getNom()+" está aprobada con nota "+alumnos[n].getNota());
			}
		}
		if(lambda.lista()) {
			System.out.println("En el aula "+lambda.getNum()+" se puede dar clase");
			System.out.println("Los alumnos siguientes están aprobados:");
			Alumno[] alumnos= lambda.getLista();
			for(int n=0; n<lambda.getAforo();n++) {
				if(alumnos[n].getNota()>=5 && alumnos[n].isGen()==false) System.out.println("El alumno "+alumnos[n].getNom()+" está aprobado con nota "+alumnos[n].getNota());
			}
			for(int n=0; n<lambda.getAforo();n++) {
				if(alumnos[n].getNota()>=5 && alumnos[n].isGen()==true) System.out.println("La alumna "+alumnos[n].getNom()+" está aprobada con nota "+alumnos[n].getNota());
			}
		}
		
	}

}
