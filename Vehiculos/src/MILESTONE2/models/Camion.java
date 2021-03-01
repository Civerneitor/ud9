package MILESTONE2.models;

public class Camion extends Vehiculo {
	//Asumimos que Camión no necesita que se le introduzcan ruedas ya que no se solicita en el enunciado
	

	public Camion(String color, String matricula, String marca, Titular titular) throws Exception {
		super(color, matricula, marca, titular);
		if(this.titular.getTipoLicencia()=='C') {
			
		} else throw new Exception("Error: Permiso inválido");
	}

	@Override
	public String toString() {
		return "Camion [toString()=" + super.toString() + "]";
	}
	

}
