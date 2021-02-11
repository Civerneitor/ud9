package MAIN;
//import MILESTONE1.Empleado;
//import MILESTONE2.Empleado;
//import MILESTONE2.Rango;
import MILESTONE3.Empleado;
import MILESTONE3.Rango;


public class JobsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MILESTONE1");
		//MILESTONE1
		Empleado a = new Empleado(10000,"Boss");
		Empleado b = new Empleado(1000,"Manager");
		Empleado c = new Empleado(100,"Employee");
		Empleado d = new Empleado(10000000,"Volunteer");
		Empleado e = new Empleado(1000000000,"hola");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		//MILESTONE2
		//Comment if use MILESTON1 package
		System.out.println("MILESTONE2");

		Rango x = new Rango(100,"Junior");
		Rango y = new Rango(1000,"Mid");
		Rango z = new Rango(10000,"Senior");
		Rango w = new Rango(100000000,"Sonia");
		System.out.println(x.toString());
		System.out.println(y.toString());
		System.out.println(z.toString());
		System.out.println(w.toString());
		//MILESTONE3
		//Comment if use MILESTON1 or MILESTONE2 package
		System.out.println("MILESTONE3");

		a.bonificacio();
		b.bonificacio(4000);
		e.bonificacio(500);
		d.bonificacio(150);
		x.bonificacio();
		w.bonificacio(1000000);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(e.toString());
		System.out.println(d.toString());
		System.out.println(x.toString());
		System.out.println(w.toString());
	}

}
