
public class Lavadora extends Electrodomestico {
	final static private int DEF_CARGA = 5;
	
	private int carga;
	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
		this.carga = DEF_CARGA;
	}

	public Lavadora(int carga, double precio, String color, char clase, int peso) {
		super(precio, color, clase, peso);
		// TODO Auto-generated constructor stub
		this.carga = carga;
	}

	public Lavadora(double precio, int peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
		this.carga = DEF_CARGA;

	}

	public int getCarga() {
		return carga;
	}

	
	protected void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) this.precio+=50;
		
	}
}
