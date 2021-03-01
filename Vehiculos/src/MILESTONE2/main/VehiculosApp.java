package MILESTONE2.main;

import javax.swing.JOptionPane;

import MILESTONE2.models.Camion;
import MILESTONE2.models.Coche;
import MILESTONE2.models.Conductor;
import MILESTONE2.models.Moto;
import MILESTONE2.models.Rueda;
import MILESTONE2.models.Titular;

public class VehiculosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titular titular = creaTitular();
		int e = Integer.parseInt(JOptionPane.showInputDialog("Escoge vehiculo: Introduce 1 para coche, 2 para moto o cualquier otro número para camión"));
		try {
			Conductor conductor;
			if(e==1) {
				Coche coche = creaCoche(titular);
				if(JOptionPane.showInputDialog("Introduce si el titular será el conductor (S=Sí) ").contentEquals("S")) {
					conductor = creaConductor(coche.getTitular());
				} else {
					conductor = creaConductor();
				}
				coche.setConductor(conductor);
				System.out.println(coche);
			} else if (e==2) {
				Moto moto = creaMoto(titular);
				if(JOptionPane.showInputDialog("Introduce si el titular será el conductor (S=Sí) ").contentEquals("S")) {
					conductor = creaConductor(moto.getTitular());
				} else {
					conductor = creaConductor();
				}
				moto.setConductor(conductor);
				System.out.println(moto);
			} else{
				Camion camion = creaCamion(titular);
				if(JOptionPane.showInputDialog("Introduce si el titular será el conductor (S=Sí) ").contentEquals("S")) {
					conductor = creaConductor(camion.getTitular());
				} else {
					conductor = creaConductor();
			}
				camion.setConductor(conductor);
				System.out.println(camion);
			}
		} catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	public static Conductor creaConductor(Titular t) {
		
		return new Conductor(t.getNombre(), t.getApellidos(), t.getFechaNacimiento(), t.getLicencia(), t.getId(), t.getTipoLicencia(),t.getNombreCompleto(), t.getFechaCaducidad());
	}
	public static Conductor creaConductor() {
		String fechaNacimiento= JOptionPane.showInputDialog("Introduce la fecha de nacimiento del titular");
		String licencia= JOptionPane.showInputDialog("Introduce el identificador de la licencia del titular");
		String nombre= JOptionPane.showInputDialog("Introduce el nombre del titular");
		String apellidos= JOptionPane.showInputDialog("Introduce el apellido");
		int id= Integer.parseInt(JOptionPane.showInputDialog("Introduce el identificador del titular"));
		String fechaCaducidad= JOptionPane.showInputDialog("Introduce la fecha de caducidad de la licencia");
		char tipoLicencia = Character.toUpperCase(JOptionPane.showInputDialog("Introduce el tipo de licencia del titular").charAt(0));
		String nombreCompleto= JOptionPane.showInputDialog("Introduce el nombre completo del titular");
		Conductor conductor = new Conductor(nombre, apellidos, fechaNacimiento, licencia, id, tipoLicencia, nombreCompleto, fechaCaducidad);
		return conductor;
	}
	public static Titular creaTitular() {
		//String fechaNacimiento, String licencia, int id,char tipoLicencia, String nombreCompleto, String fechaCaducidad, boolean seguro, boolean garaje
		String fechaNacimiento= JOptionPane.showInputDialog("Introduce la fecha de nacimiento del titular");
		String licencia= JOptionPane.showInputDialog("Introduce el identificador de la licencia del titular");
		String nombre= JOptionPane.showInputDialog("Introduce el nombre del titular");
		String apellidos= JOptionPane.showInputDialog("Introduce el apellido");
		int id= Integer.parseInt(JOptionPane.showInputDialog("Introduce el identificador del titular"));
		String fechaCaducidad= JOptionPane.showInputDialog("Introduce la fecha de caducidad de la licencia");
		char tipoLicencia = Character.toUpperCase(JOptionPane.showInputDialog("Introduce el tipo de licencia del titular").charAt(0));
		String nombreCompleto= JOptionPane.showInputDialog("Introduce el nombre completo del titular");
		boolean seguro= JOptionPane.showInputDialog("Introduce si el titular tiene seguro (S=Sí) ").contentEquals("S");
		boolean garaje= JOptionPane.showInputDialog("Introduce si el titular tiene garaje (S=Sí)").contentEquals("S");
		Titular titular = new Titular(nombre, apellidos, fechaNacimiento, licencia, id, tipoLicencia, nombreCompleto, fechaCaducidad, seguro, garaje);
		return titular;
		
	}
	
	public static Coche creaCoche(Titular titular) throws Exception {
		String color= JOptionPane.showInputDialog("Introduce el color del coche");
		String marcac= JOptionPane.showInputDialog("Introduce la marca del coche");
		String matricula= JOptionPane.showInputDialog("Introduce la matricula del coche");
		String marca= JOptionPane.showInputDialog("Introduce la marca de la rueda delantera derecha");
		Double diametro = 0.0;
		do{
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda delantera derecha"));
		} while (diametro<0.4 || diametro>4);
		Rueda a = new Rueda(marca,diametro);
		marca= JOptionPane.showInputDialog("Introduce la marca de la rueda delantera izquierda");
		do {
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda delantera izquierda"));
		} while (diametro<0.4 || diametro>4);
		Rueda b = new Rueda(marca,diametro);
		
		marca= JOptionPane.showInputDialog("Introduce la marca de la rueda trasera derecha");
		do{
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda trasera derecha"));
		} while (diametro<0.4 || diametro>4);
		Rueda c = new Rueda(marca,diametro);
		marca= JOptionPane.showInputDialog("Introduce la marca de la rueda trasera izquierda");
		do{
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda trasera izquierda"));
		} while (diametro<0.4 || diametro>4);
		Rueda d = new Rueda(marca,diametro);
		
		
		Coche coche = new Coche(color, marcac, matricula, titular, a, b, c, d);
		return coche;
	}
	public static Moto creaMoto(Titular titular) throws Exception {
		String color= JOptionPane.showInputDialog("Introduce el color de la moto");
		String marcac= JOptionPane.showInputDialog("Introduce la marca de la moto");
		String matricula= JOptionPane.showInputDialog("Introduce la matricula de la moto");
		String marca= JOptionPane.showInputDialog("Introduce la marca de la rueda delantera");
		Double diametro = 0.0;
		do{
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda delantera"));
		} while (diametro<0.4 || diametro>4);
		Rueda a = new Rueda(marca,diametro);
		marca= JOptionPane.showInputDialog("Introduce la marca de la rueda trasera");
		do {
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda trasera"));
		} while (diametro<0.4 || diametro>4);
		Rueda b = new Rueda(marca,diametro);
		
		Moto moto = new Moto(color, marcac, matricula, titular, a, b);
		return moto;
	}
	public static Camion creaCamion(Titular titular) throws Exception {
		String color= JOptionPane.showInputDialog("Introduce el color de la moto");
		String marcac= JOptionPane.showInputDialog("Introduce la marca de la moto");
		String matricula= JOptionPane.showInputDialog("Introduce la matricula de la moto");
		
		Camion camion = new Camion(color, marcac, matricula, titular);
		return camion;
	}

}
