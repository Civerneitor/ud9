package MILESTONE1;

public class Empleado {

	private double salari;
	private String tipus;
	
	public Empleado(double salari, String tipus) {
		super();
		this.salari = salari;
		this.tipus = tipus;
		salariFinal();
	}
	//Comproba que el nom del tipus sigui correcte i aplica la modificació de SalariBrut_Mes respecte al tipus.
	//si el tipus no es correcte posem SalariBrut_Mes 0 i tipus Volunteer per defecte.
	private void salariFinal() {
		
		switch(tipus) {
		case "Manager":
			salari+=salari*0.1;
			break;
		case "Boss":
			salari+=salari*0.5;
			break;
		case "Employee":
			salari-=salari*0.15;
			break;
		case "Volunteer":
			salari=0;
			break;
		default:
			tipus="Volunteer";
			salari=0;
			break;
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tipus+": "+salari;
	}
	
}
