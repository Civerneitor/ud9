public class Serie implements Entregable{
	//ATRIBUTOS
    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    //CONSTANTES
    final private static int DEF_NTEMPORADAS = 3;
    final private static boolean DEF_ENTREGADO = false;
    
    
    /**
     * Generamos constructor por defecto
     */
    public Serie() {
    	this.temporadas = DEF_NTEMPORADAS;
    	this.entregado = DEF_ENTREGADO;
    }

    /**
     * Hacemos el constructor de los dos parametros titulo y creador
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.temporadas = DEF_NTEMPORADAS;
    	this.entregado = DEF_ENTREGADO;
    }

    /**
     * @param titulo
     * @param temporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, int NumTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas=NumTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = DEF_ENTREGADO;
    }

    /*Ponemos los getters y setters de todos los atributos menos entregado*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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

    @Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado=true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado=false;

	}
	//Devolvemos el mayor de la comparacion de ambos objetos basandonos en el número de temporadas.
	public Serie compareTo(Object a) {
		if (a instanceof Serie) {
			Serie b = (Serie) a;
			if(this.getTemporadas() > b.getTemporadas()) return this;
			else return b;
		}
		return null;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
}