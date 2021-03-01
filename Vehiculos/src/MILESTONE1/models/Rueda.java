package MILESTONE1.models;

public class Rueda {

	private double diametro;
	private String marca;
	public Rueda(String marca, double diametro) {
		// TODO Auto-generated constructor stub
		this.diametro = diametro;
		this.marca = marca;
		if(this.diametro>4) this.diametro=4;
		else if(this.diametro<0.4) this.diametro = 0.4;
	}
	@Override
	public String toString() {
		return "Rueda [diametro=" + diametro + ", marca=" + marca + "]";
	}

	
}
