package MILESTONE2.models;

public class Coche extends Vehiculo {
	
	private Rueda rdd;
	private Rueda rdi;
	private Rueda rtd;
	private Rueda rti;
	
	/*public Coche(String color, String matricula, String marca, Titular titular) {
		super(color, matricula, marca, titular);
		// TODO Auto-generated constructor stub
	}*/

	public Coche(String color, String matricula, String marca,  Titular titular, Rueda rdd, Rueda rdi, Rueda rtd, Rueda rti) throws Exception {
		super(color, matricula, marca, titular);
		if(this.titular.getTipoLicencia()=='B') {
			this.rdd = rdd;
			this.rdi = rdi;
			this.rtd = rtd;
			this.rti = rti;
		}
		else throw new Exception("Error: Licencia dle titular inválida");
		
	}

	@Override
	public String toString() {
		return "Coche [rdd=" + rdd + ", rdi=" + rdi + ", rtd=" + rtd + ", rti=" + rti + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
