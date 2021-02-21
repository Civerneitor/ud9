package models;
public class Pelicula {
	
	private static String pelicula;
	private static int duracion;
	private static int edadMinima;
	private static String director;
    
	public Pelicula(String pelicula, int duracion, int edadMinima,String director ) {
		Pelicula.pelicula=" Senyor de los anillos ";
		Pelicula.duracion= 240;
		Pelicula.edadMinima= 14;
		Pelicula.director=" Jackson";
		
		}
    
	





	public static String getPelicula() {
		return pelicula;
	}
	public static void setPelicula(String pelicula) {
		Pelicula.pelicula = pelicula;
	}
	public static int getDuracion() {
		return duracion;
	}
	public static void setDuracion(int duracion) {
		Pelicula.duracion = duracion;
	}
	public static int getEdadMinima() {
		return edadMinima;
	}
	public static void setEdadMinima(int edadMinima) {
		Pelicula.edadMinima = edadMinima;
	}
	public static String getDirector() {
		return director;
	}
	public static void setDirector(String director) {
		Pelicula.director = director;
	}




	@Override
	public String toString() {
		return "["+"Pelicula" + pelicula + "duracion" + duracion + " edadminima" + edadMinima+"director"+director
				+ "]";
	}

	
	
	
	
	
}
