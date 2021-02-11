package MILESTONE2;

public class Rango extends Empleado {

	private String rango;
	public Rango(double salari, String rango) {
		super(salari, "Employee");
		// TODO Auto-generated constructor stub
		this.rango=rango;
		validaSalari();
		salariFinal();
	}
	@Override
	protected void salariFinal() {
		// TODO Auto-generated method stub
		double salari = super.getSalari();
		switch(rango) {
		case "Junior":
			salari+=salari*0.1;
			break;
		case "Mid":
			salari+=salari*0.5;
			break;
		case "Senior":
			salari-=salari*0.15;
			break;
		default:
			rango="Junior";
			salari=0;
			break;
		}
		super.setSalari(salari);
		super.salariFinal();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Rank: "+rango;
	}
	@Override
	protected void validaSalari() {
		//crida al pare y funcions propies
		//super.validaSalari();
		double salari = super.getSalari();
		switch (rango) {
		case "Junior":
			if (salari>=1600) {
				salari=1599.99;
			}else if(salari<=900) {
				salari=900.01;
			}
			break;
		case "Mid":
			if (salari>=2500) {
				salari=2499.99;
			}else if (salari<=1800) {
				salari=1800.01;
			}
			break;
		case "Senior":
			if (salari>=4000) {
				salari=3999.99;
			}else if(salari<=2700) {
				salari=2700.01;
			}
			break;
		default:
			rango="Junior";
			salari=900.01;
			break;
		}
		super.setSalari(salari);
	}
}