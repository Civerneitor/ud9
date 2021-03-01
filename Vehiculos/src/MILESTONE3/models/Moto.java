package MILESTONE3.models;



public class Moto extends Vehiculo {
	
	private Rueda rd;
	private Rueda rt;

	public Moto(String color, String matricula, String marca, Titular titular, Rueda rd, Rueda rt) throws Exception {
		super(color, matricula, marca, titular);
		if(this.titular.getTipoLicencia()=='A') {
			this.rd = rd;
			this.rt = rt;
		} else throw new Exception("Error: Licencia del titular inválida");
	}

	@Override
	public String toString() {
		return "Moto [rd=" + rd + ", rt=" + rt + ", toString()=" + super.toString() + "]";
	}
	
	
}
