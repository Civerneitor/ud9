package Main;

import Model.Libros;

public class LibreriaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros libro1 = new Libros("0252154551960", "La paqui","Tito Francisco",5003);
		System.out.println(libro1);
		Libros libro2 = new Libros("5689741236541", "El Rey mono", "Kim Tae Hyun", 204);
		System.out.println(libro2);
		if (libro1.getNumpag() >= libro2.getNumpag()) {
			System.out.println("Libro 1: "+libro1.getTitulo()+". tiene más páginas, en concreto: "+libro1.getNumpag());
		}else if(libro1.getNumpag()<=libro2.getNumpag()){
			System.out.println("Libro 2: "+libro2.getTitulo()+". tiene más páginas, en concreto: "+libro2.getNumpag());
		}
	}

}
