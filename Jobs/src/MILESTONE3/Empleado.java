package MILESTONE3;

public class Empleado {

	static final double IRPF_BOSS = 0.32;
	static final double IRPF_MANAGER = 0.26;
	static final double IRPF_SENIOR = 0.24;
	static final double IRPF_MID = 0.15;
	static final double IRPF_JUNIOR = 0.02;
	static final int AJUT = 300;
	static final double BONO = 0.10;

	private double SalariBrut_Mes;
	private String tipus;
	private double SalariNet_Mes;
	private double SalariNet_Any;
	private double SalariBrut_Any;
	private double bonus;

	public Empleado(double salari, String tipus) {
		super();
		this.SalariBrut_Mes = salari;
		this.tipus = tipus;
		if (!(this instanceof Rango)) {
			validaSalari();
			salariFinal();
			SalariBrut_Any=SalariBrut_Mes*12;
			salariNet_Mes();
			salariNet_Any();
		}
		else
			this.tipus = "Employee";
	}

	//Getters and Setters
	protected double getSalariNet_Mes() {
		return SalariNet_Mes;
	}

	protected double getSalariNet_Any() {
		return SalariNet_Any;
	}

	protected double getSalariBrut_Any() {
		return SalariBrut_Any;
	}

	protected void setSalariNet_Mes(double salariNet_Mes) {
		SalariNet_Mes = salariNet_Mes;
	}

	protected void setSalariNet_Any(double salariNet_Any) {
		SalariNet_Any = salariNet_Any;
	}

	protected void setSalariBrut_Any(double salariBrut_Any) {
		SalariBrut_Any = salariBrut_Any;
	}
	protected double getSalariBrut_Mes() {
		return SalariBrut_Mes;
	}

	protected void setSalariBrut_Mes(double salari) {
		this.SalariBrut_Mes = salari;
	}

	protected double getBonus() {
		return bonus;
	}

	protected void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	// Comproba que el nom del tipus sigui correcte i aplica la modificació de
	// SalariBrut_Mes respecte al tipus.
	// si el tipus no es correcte posem SalariBrut_Mes 0 i tipus Volunteer per defecte.
	protected void salariFinal() {

		switch (tipus) {
		case "Manager":
			SalariBrut_Mes += SalariBrut_Mes * 0.1;
			break;
		case "Boss":
			SalariBrut_Mes += SalariBrut_Mes * 0.5;
			break;
		case "Employee":
			SalariBrut_Mes -= SalariBrut_Mes * 0.15;
			break;
		case "Volunteer":
			SalariBrut_Mes = 0;
			break;
		default:
			tipus = "Volunteer";
			SalariBrut_Mes = 0;
			break;
		}
	}

	

	protected void salariNet_Mes() {

		switch (tipus) {
		case "Manager":
			SalariNet_Mes = SalariBrut_Mes - SalariBrut_Mes * IRPF_MANAGER;
			break;
		case "Boss":
			SalariNet_Mes = SalariBrut_Mes - SalariBrut_Mes * IRPF_BOSS;
			break;
		case "Employee":
			SalariNet_Mes = SalariBrut_Mes - SalariBrut_Mes * IRPF_SENIOR;
			break;
		default:
			//tipus = "Volunteer";
			SalariNet_Mes = SalariBrut_Mes;
			break;
		}
	}

	protected void salariNet_Any() {
		switch (tipus) {
		case "Manager":
			SalariNet_Any = 12 * (SalariBrut_Mes - (SalariBrut_Mes * IRPF_MANAGER));
			break;
		case "Boss":
			SalariNet_Any = 12 * (SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS));
			break;
		case "Employee":
			SalariNet_Mes = 12 * (SalariBrut_Mes - (SalariBrut_Mes * IRPF_SENIOR));
			break;
		default:
			//tipus = "Ajut";
			SalariNet_Any = SalariNet_Mes*12;
			break;
		}

	}

	protected void ajut() {
		if (tipus == "Volunteer") {
			bonus = AJUT;
		}
	}
	protected void ajut(double b) {
		if (tipus == "Volunteer") {
			if (b>300) b = AJUT;
			bonus = b;
		}
	}

	

	@Override
	public String toString() {
		return "Empleado [SalariBrut_Mes=" + Math.floor(SalariBrut_Mes*100)/100 + ", tipus=" + tipus + ", SalariNet_Mes=" + Math.floor(SalariNet_Mes*100)/100
				+ ", SalariNet_Any=" + Math.floor(SalariNet_Any*100)/100 + ", SalariBrut_Any=" + Math.floor(SalariBrut_Any*100)/100 + ", bonus=" + Math.floor(bonus*100)/100 + "]";
	}
	protected void validaSalari() {
		switch (tipus) {
		case "Manager":
			if (SalariBrut_Mes<=3000) {
				SalariBrut_Mes=3000.01;
			}else if(SalariBrut_Mes>=5000) {
				SalariBrut_Mes=4999.99;
			}
			break;
		case "Boss":
			if (SalariBrut_Mes<=8000) {
				SalariBrut_Mes=8000.01;
			}
			break;
		case "Employee":
			if (SalariBrut_Mes<=900) {
				SalariBrut_Mes=900.01;
			}else if(SalariBrut_Mes>=4000) {
				SalariBrut_Mes=3999.99;
			}
			break;
		case "Volunteer":
			SalariBrut_Mes=0;
			break;
		default:
			tipus="Volunteer";
			SalariBrut_Mes=0;
			break;
		}
	}
	
	public void bonificacio() {
		if (tipus!="Volunteer") {
			bonus = SalariNet_Any * BONO;
		}else {
			ajut();
		}
	}
	public void bonificacio(double b) {
		if (tipus!="Volunteer") {
			bonus = SalariNet_Any * BONO;
		}else {
			ajut(b);
		}
	}
}