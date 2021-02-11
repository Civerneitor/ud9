package MILESTONE3;

public class Rango extends Empleado {

	private String rango;

	public Rango(double salari, String rango) {
		super(salari, "Employee");
		// TODO Auto-generated constructor stub
		this.rango = rango;
		validaSalari();
		salariFinal();
		super.setSalariBrut_Any(getSalariBrut_Mes()*12);
		salariNet_Mes();
		salariNet_Any();
	}

	@Override
	protected void salariFinal() {
		// TODO Auto-generated method stub
		double salari = this.getSalariBrut_Mes();
		switch (rango) {
		case "Junior":
			salari += salari * 0.1;
			break;
		case "Mid":
			salari += salari * 0.5;
			break;
		case "Senior":
			salari -= salari * 0.15;
			break;
		default:
			rango = "Junior";
			salari = 0;
			break;
		}
		this.setSalariBrut_Mes(salari);
		super.salariFinal();
	}

	@Override
	protected void validaSalari() {
		// crida al pare y funcions propies
		super.validaSalari();
		double salari = getSalariBrut_Mes();
		switch (rango) {
		case "Junior":
			if (salari >= 1600) {
				salari = 1599.99;
			} else if (salari <= 900) {
				salari = 900.01;
			}
			break;
		case "Mid":
			if (salari >= 2500) {
				salari = 2499.99;
			} else if (salari <= 1800) {
				salari = 1800.01;
			}
			break;
		case "Senior":
			if (salari >= 4000) {
				salari = 3999.99;
			} else if (salari <= 2700) {
				salari = 2700.01;
			}
			break;
		default:
			rango = "Junior";
			salari = 900.01;
			break;
		}
		setSalariBrut_Mes(salari);
	}

	protected void salariNet_Mes() {
		// Salari mensual net
		double salarioMes = getSalariNet_Mes();
		double SalariBrut_Mes = getSalariBrut_Mes();
		switch (rango) {
		case "Senior":
			salarioMes = SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS);
			break;
		case "Mid":
			salarioMes = SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS);
			break;
		case "Junior":
			salarioMes = SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS);
			break;
		}
		super.setSalariNet_Mes(salarioMes);
	}

	// Salari anual net.
	protected void salariNet_Any() {
		double salariAny = getSalariNet_Any();
		double SalariBrut_Mes = getSalariBrut_Mes();
		switch (rango) {
		case "Senior":
			salariAny = 12 * (SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS));
			break;
		case "Mid":
			salariAny = 12 * (SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS));
			break;
		case "Junior":
			salariAny = 12 * (SalariBrut_Mes - (SalariBrut_Mes * IRPF_BOSS));
			break;
		}
		super.setSalariNet_Any(salariAny);
	}

	// bonus de rang.
	public void bonus(double salariNet_Any, String tipus) {
		double bonus = 0.0;
		switch (tipus) {
		case "Senior":
			bonus = salariNet_Any * BONO;
			break;
		case "Mid":
			bonus = salariNet_Any * BONO;
			break;
		case "Junior":
			bonus = salariNet_Any * BONO;
			break;
		default:

			break;
		}
		super.setBonus(bonus);
	}

	@Override
	public String toString() {
		return "Rango [rango=" + rango + ", toString()=" + super.toString() + "]";
	}

}
