package MILESTONE1.models;

public class Coche extends Vehiculo {
	
	private Rueda rdd;
	private Rueda rdi;
	private Rueda rtd;
	private Rueda rti;
	
	public Coche(String color, String matricula, String marca) {
		super(color, matricula, marca);
		// TODO Auto-generated constructor stub
	}

	public Coche(String color, String matricula, String marca, Rueda rdd, Rueda rdi, Rueda rtd, Rueda rti) {
		super(color, matricula, marca);
		this.rdd = rdd;
		this.rdi = rdi;
		this.rtd = rtd;
		this.rti = rti;
	}

	@Override
	public String toString() {
		return "Coche [rdd=" + rdd + ", rdi=" + rdi + ", rtd=" + rtd + ", rti=" + rti + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
