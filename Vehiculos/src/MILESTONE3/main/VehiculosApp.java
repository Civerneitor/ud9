package MILESTONE3.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import MILESTONE3.models.Camion;
import MILESTONE3.models.Coche;
import MILESTONE3.models.Conductor;
import MILESTONE3.models.Moto;
import MILESTONE3.models.Persona;
import MILESTONE3.models.Rueda;
import MILESTONE3.models.Titular;
import MILESTONE3.models.Vehiculo;

public class VehiculosApp {
	public static void main(String[] args) {
		// MEJORAS: Hay que mejorar el programa para que el main se separe más en funciones ya que se repite bastante código. 
		List<Persona> listaPersonas = new ArrayList<Persona>();
		List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		int menu = 0;
		try {
			do {
				menu = Integer.parseInt(JOptionPane.showInputDialog(
						"¿Deseas crear un vehículo o una persona? (1=vehiculo, 2=persona, cualquier otro para salir del programa listando todos los vehiculos y personas creados)"));
				if (menu == 2) {
					listaPersonas.add(creaConductor());
				} else if (menu == 1) {
					int idt = Integer.parseInt(JOptionPane.showInputDialog(
							"Introduce el ID del titular, si no existe se creará uno"));
					Titular titular = null;
					boolean existe = false;
					for(Persona persona : listaPersonas) {
						if(((Titular) persona).getId()==idt) {
							titular = (Titular) persona;
							existe = true;
						}
					}
					if(existe == false) {
						titular = creaTitular();
						listaPersonas.add(titular);
					}
					else existe=false;
					int e = Integer.parseInt(JOptionPane.showInputDialog(
							"Escoge vehiculo: Introduce 1 para coche, 2 para moto o cualquier otro número para camión"));

					Conductor conductor = null;
					if (e == 1) {
						Coche coche = creaCoche(titular);
						if (JOptionPane.showInputDialog("Introduce si el titular será el conductor (S=Sí) ")
								.contentEquals("S")) {
							conductor = creaConductor(coche.getTitular());
						} else {
							if (JOptionPane.showInputDialog("Introduce si el conductor ya existe (S=Sí) ")
									.contentEquals("S")) {
								int id = Integer.parseInt(JOptionPane.showInputDialog(
										"Introduce el ID del conductor"));
								boolean encontrado = false;
								for(Persona persona : listaPersonas) {//Miramos si existe el conductor
									
									if(((Conductor) persona).getId()==id) {
										conductor = (Conductor) persona;
										encontrado = true;
									}
								}
								
								
								if (encontrado == false) {
									for(Persona persona : listaPersonas) {//Miramos si existe el titular
										if(((Titular) persona).getId()==id) {
											conductor = creaConductor((Titular) persona);
											listaPersonas.add(conductor);
											encontrado = true;
										}
									}
									if(encontrado == false) {
										conductor = creaConductor();
										listaPersonas.add(conductor);
									}
								}
								encontrado = false;
							}else {
								conductor = creaConductor();
								listaPersonas.add(conductor);
							}
						}
						coche.setConductor(conductor);
						listaVehiculos.add(coche);
						System.out.println(coche);
					} else if (e == 2) {
						Moto moto = creaMoto(titular);
						if (JOptionPane.showInputDialog("Introduce si el titular será el conductor (S=Sí) ")
								.contentEquals("S")) {
							conductor = creaConductor(moto.getTitular());
						} else {
							if (JOptionPane.showInputDialog("Introduce si el conductor ya existe (S=Sí) ")
									.contentEquals("S")) {
								int id = Integer.parseInt(JOptionPane.showInputDialog(
										"Introduce el ID del conductor"));
								boolean encontrado = false;
								for(Persona persona : listaPersonas) {//Miramos si existe el conductor
									
									if(((Conductor) persona).getId()==id) {
										conductor = (Conductor) persona;
										encontrado = true;
									}
								}
								
								
								if (encontrado == false) {
									for(Persona persona : listaPersonas) {//Miramos si existe el titular
										if(((Titular) persona).getId()==id) {
											conductor = creaConductor((Titular) persona);
											listaPersonas.add(conductor);
											encontrado = true;
										}
									}
									if(encontrado == false) {
										conductor = creaConductor();
										listaPersonas.add(conductor);
									}
								}
								encontrado = false;
							}else {
								conductor = creaConductor();
								listaPersonas.add(conductor);
							}
						}
						moto.setConductor(conductor);
						listaVehiculos.add(moto);
						System.out.println(moto);
					} else {
						Camion camion = creaCamion(titular);
						if (JOptionPane.showInputDialog("Introduce si el titular será el conductor (S=Sí) ")
								.contentEquals("S")) {
							conductor = creaConductor(camion.getTitular());
						} else {
							if (JOptionPane.showInputDialog("Introduce si el conductor ya existe (S=Sí) ")
									.contentEquals("S")) {
								int id = Integer.parseInt(JOptionPane.showInputDialog(
										"Introduce el ID del conductor"));
								boolean encontrado = false;
								for(Persona persona : listaPersonas) {//Miramos si existe el conductor
									
									if(((Conductor) persona).getId()==id) {
										conductor = (Conductor) persona;
										encontrado = true;
									}
								}
								
								
								if (encontrado == false) {
									for(Persona persona : listaPersonas) {//Miramos si existe el titular
										if(((Titular) persona).getId()==id) {
											conductor = creaConductor((Titular) persona);
											listaPersonas.add(conductor);
											encontrado = true;
										}
									}
									if(encontrado == false) {
										conductor = creaConductor();
										listaPersonas.add(conductor);
									}
								}
								encontrado = false;
							}else {
								conductor = creaConductor();
								listaPersonas.add(conductor);
							}
						}
						camion.setConductor(conductor);
						listaVehiculos.add(camion);
						System.out.println(camion);
					}
				}
			} while (menu != 1 && menu != 2);
			System.out.println("Personas titulares:");
			for(Persona persona : listaPersonas) {//Imprimimos los titulares
				
				if(persona instanceof Titular) {
					System.out.println((Titular) persona);
				}
			}
			System.out.println("Personas conductoras:");
			for(Persona persona : listaPersonas) {//Imprimimos los conductores
				
				if(persona instanceof Conductor) {
					System.out.println((Conductor) persona);
				}
			}
			System.out.println("Vehiculos:");
			for(Vehiculo vehiculo : listaVehiculos) {//Imprimimos los conductores
				
				if(vehiculo instanceof Coche) {
					System.out.println((Coche) vehiculo);
				}
				else if(vehiculo instanceof Moto) {
					System.out.println((Moto) vehiculo);
				}
				else if(vehiculo instanceof Camion) {
					System.out.println((Camion) vehiculo);
				}
			}
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}

	public static Conductor creaConductor(Titular t) {

		return new Conductor(t.getNombre(), t.getApellidos(), t.getFechaNacimiento(), t.getLicencia(), t.getId(),
				t.getTipoLicencia(), t.getNombreCompleto(), t.getFechaCaducidad());
	}

	public static Conductor creaConductor() {
		String fechaNacimiento = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del titular");
		String licencia = JOptionPane.showInputDialog("Introduce el identificador de la licencia del titular");
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del titular");
		String apellidos = JOptionPane.showInputDialog("Introduce el apellido");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el identificador del titular"));
		String fechaCaducidad = JOptionPane.showInputDialog("Introduce la fecha de caducidad de la licencia");
		char tipoLicencia = Character
				.toUpperCase(JOptionPane.showInputDialog("Introduce el tipo de licencia del titular").charAt(0));
		String nombreCompleto = JOptionPane.showInputDialog("Introduce el nombre completo del titular");
		Conductor conductor = new Conductor(nombre, apellidos, fechaNacimiento, licencia, id, tipoLicencia,
				nombreCompleto, fechaCaducidad);
		return conductor;
	}

	public static Titular creaTitular() {
		// String fechaNacimiento, String licencia, int id,char tipoLicencia, String
		// nombreCompleto, String fechaCaducidad, boolean seguro, boolean garaje
		String fechaNacimiento = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del titular");
		String licencia = JOptionPane.showInputDialog("Introduce el identificador de la licencia del titular");
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del titular");
		String apellidos = JOptionPane.showInputDialog("Introduce el apellido");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el identificador del titular"));
		String fechaCaducidad = JOptionPane.showInputDialog("Introduce la fecha de caducidad de la licencia");
		char tipoLicencia = Character
				.toUpperCase(JOptionPane.showInputDialog("Introduce el tipo de licencia del titular").charAt(0));
		String nombreCompleto = JOptionPane.showInputDialog("Introduce el nombre completo del titular");
		boolean seguro = JOptionPane.showInputDialog("Introduce si el titular tiene seguro (S=Sí) ").contentEquals("S");
		boolean garaje = JOptionPane.showInputDialog("Introduce si el titular tiene garaje (S=Sí)").contentEquals("S");
		Titular titular = new Titular(nombre, apellidos, fechaNacimiento, licencia, id, tipoLicencia, nombreCompleto,
				fechaCaducidad, seguro, garaje);
		return titular;

	}

	public static Coche creaCoche(Titular titular) throws Exception {
		String color = JOptionPane.showInputDialog("Introduce el color del coche");
		String marcac = JOptionPane.showInputDialog("Introduce la marca del coche");
		String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche");
		String marca = JOptionPane.showInputDialog("Introduce la marca de la rueda delantera derecha");
		Double diametro = 0.0;
		do {
			diametro = Double
					.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda delantera derecha"));
		} while (diametro < 0.4 || diametro > 4);
		Rueda a = new Rueda(marca, diametro);
		marca = JOptionPane.showInputDialog("Introduce la marca de la rueda delantera izquierda");
		do {
			diametro = Double
					.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda delantera izquierda"));
		} while (diametro < 0.4 || diametro > 4);
		Rueda b = new Rueda(marca, diametro);

		marca = JOptionPane.showInputDialog("Introduce la marca de la rueda trasera derecha");
		do {
			diametro = Double
					.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda trasera derecha"));
		} while (diametro < 0.4 || diametro > 4);
		Rueda c = new Rueda(marca, diametro);
		marca = JOptionPane.showInputDialog("Introduce la marca de la rueda trasera izquierda");
		do {
			diametro = Double
					.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda trasera izquierda"));
		} while (diametro < 0.4 || diametro > 4);
		Rueda d = new Rueda(marca, diametro);

		Coche coche = new Coche(color, marcac, matricula, titular, a, b, c, d);
		return coche;
	}

	public static Moto creaMoto(Titular titular) throws Exception {
		String color = JOptionPane.showInputDialog("Introduce el color de la moto");
		String marcac = JOptionPane.showInputDialog("Introduce la marca de la moto");
		String matricula = JOptionPane.showInputDialog("Introduce la matricula de la moto");
		String marca = JOptionPane.showInputDialog("Introduce la marca de la rueda delantera");
		Double diametro = 0.0;
		do {
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda delantera"));
		} while (diametro < 0.4 || diametro > 4);
		Rueda a = new Rueda(marca, diametro);
		marca = JOptionPane.showInputDialog("Introduce la marca de la rueda trasera");
		do {
			diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diametro de la rueda trasera"));
		} while (diametro < 0.4 || diametro > 4);
		Rueda b = new Rueda(marca, diametro);

		Moto moto = new Moto(color, marcac, matricula, titular, a, b);
		return moto;
	}

	public static Camion creaCamion(Titular titular) throws Exception {
		String color = JOptionPane.showInputDialog("Introduce el color de la moto");
		String marcac = JOptionPane.showInputDialog("Introduce la marca de la moto");
		String matricula = JOptionPane.showInputDialog("Introduce la matricula de la moto");

		Camion camion = new Camion(color, marcac, matricula, titular);
		return camion;
	}
}
