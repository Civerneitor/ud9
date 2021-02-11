
public class Videojuego implements Entregable {

//Constantes
	final private static int DEF_HESTIMADAS = 10;
	final private static boolean DEF_ENTREGADO = false;
//ATRIBUTOS
	private String titulo;
	private int hEstimadas;
	private boolean entregado;
	private String genero;
	private String creador;
	private String compania;

// Implementamos constructores.
	public Videojuego() {
		this.hEstimadas = DEF_HESTIMADAS;
		this.entregado = DEF_ENTREGADO;
	}

	public Videojuego(String titulo, int hestimadas) {
		this.titulo = titulo;
		this.hEstimadas = hestimadas;
		this.entregado = DEF_ENTREGADO;
	}

	public Videojuego(String titulo, int hEstimadas, String genero, String creador, String compania) {

		this.titulo = titulo;
		this.hEstimadas = hEstimadas;
		this.genero = genero;
		this.creador = creador;
		this.compania = compania;
		this.entregado = DEF_ENTREGADO;

	}

//get and set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int gethEstimadas() {
		return hEstimadas;
	}

	public void sethEstimadas(int hEstimadas) {
		this.hEstimadas = hEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", hEstimadas=" + hEstimadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + ", compania=" + compania + "]";
	}
	
	@Override
	public void devolver() {
		this.entregado=false;
	}
	
	@Override
	public void entregar() {
		this.entregado=true;
	}

	
	//Devolvemos el mayor de la comparacion de ambos objetos basándonos en el número de horas estimadas.
	public Videojuego compareTo(Object a) {
		if (a instanceof Videojuego) {
			Videojuego b = (Videojuego) a;
			if(this.gethEstimadas() > b.gethEstimadas()) return this;
			else return b;
		}
		return null;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

}

