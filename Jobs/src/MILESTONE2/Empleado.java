package MILESTONE2;

public class Empleado {
	private double salari;
	private String tipus;
	
	public Empleado(double salari, String tipus) {
		super();
		this.salari = salari;
		this.tipus = tipus;
		
		if(!(this instanceof Rango)) {
			validaSalari();
			salariFinal();
		}
		else this.tipus = "Employee";
	}
	//Comproba que el nom del tipus sigui correcte i aplica la modificació de SalariBrut_Mes respecte al tipus.
	//si el tipus no es correcte posem SalariBrut_Mes 0 i tipus Volunteer per defecte.
	protected void salariFinal() {
		
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
	
	protected void validaSalari() {
		switch (tipus) {
		case "Manager":
			if (salari<3000) {
				salari=3000.01;
			}else if(salari>5000) {
				salari=4999.99;
			}
			break;
		case "Boss":
			if (salari<8000) {
				salari=8000.01;
			}
			break;
		case "Employee":
			if (salari<900) {
				salari=900.01;
			}else if(salari>4000) {
				salari=3999.99;
			}
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
	
	protected double getSalari() {
		return salari;
	}
	protected void setSalari(double salari) {
		this.salari = salari;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tipus+": "+salari;
	}
	
	
	
}