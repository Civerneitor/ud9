package MILESTONE1.models;



public class Moto extends Vehiculo {
	
	private Rueda rd;
	private Rueda rt;
	
	public Moto(String color, String matricula, String marca) {
		super(color, matricula, marca);
		// TODO Auto-generated constructor stub
	}

	public Moto(String color, String matricula, String marca, Rueda rd, Rueda rt) {
		super(color, matricula, marca);
		this.rd = rd;
		this.rt = rt;
	}

	@Override
	public String toString() {
		return "Moto [rd=" + rd + ", rt=" + rt + ", toString()=" + super.toString() + "]";
	}
	
	
}
