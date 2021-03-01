package MILESTONE1.main;

import javax.swing.JOptionPane;

import MILESTONE1.models.Coche;
import MILESTONE1.models.Moto;
import MILESTONE1.models.Rueda;

public class VehiculosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int e = Integer.parseInt(JOptionPane.showInputDialog("Escoge vehiculo: Introduce 1 para coche o 2 para moto"));
		if(e==1) {
			Coche coche = creaCoche();
			System.out.println(coche);
		} else {
			Moto moto = creaMoto();
			System.out.println(moto);
		}
	}
	public static Coche creaCoche() {
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
		
		
		Coche coche = new Coche(color, marcac, matricula, a, b, c, d);
		return coche;
	}
	public static Moto creaMoto() {
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
		
		Moto moto = new Moto(color, marcac, matricula, a, b);
		return moto;
	}

}
