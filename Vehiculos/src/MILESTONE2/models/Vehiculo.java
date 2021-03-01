package MILESTONE2.models;

public class Vehiculo {
	
	
	protected String color;
	protected String matricula;
	protected String marca;
	protected Titular titular;
	protected Conductor conductor;
	
	
	protected Vehiculo(String color, String matricula, String marca, Titular titular) {
		super();
		this.titular=titular;
		this.color = color;
		this.matricula = matricula;
		if(!validaMatricula()) this.matricula=
		this.marca = marca;
	}
	
	private boolean validaMatricula() {
		int letc = 0;//contador de letras
		int numc = 0;//contador de números
		for(int i =0;i<matricula.length();i++) {
			char a= matricula.charAt(i);
			if (a>=65 && a<=90){//Si está entre los valores 65(A) y 90(Z) ascii inclusive
				letc++;
			}else if (a>=97 && a<=122){//Si está entre los valores 97(a) y 122(z) ascii inclusive
				letc++;
			}else if(a>=48 && a<=57){//Si está entre los valores 48(0) y 57(9) ascii inclusive
				numc++;
			}
		}
		if((letc==2 || letc==3) && numc==4 && letc+numc==matricula.length()) return true;
		else return false;
	}

	public void setConductor(Conductor conductor) throws Exception {
		if((conductor.getTipoLicencia()=='B' && this instanceof Coche) || (conductor.getTipoLicencia()=='A' && this instanceof Moto) || (conductor.getTipoLicencia()=='C' && this instanceof Camion))
		this.conductor = conductor;
		else throw new Exception("Error: Licencia del conductor inválida");
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Conductor getConductor() {
		return conductor;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + ", marca=" + marca + ", titular=" + titular
				+ ", conductor=" + conductor + "]";
	}
	
}
