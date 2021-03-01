package MILESTONE3.models;

public class Conductor extends Persona{
	private int id;
	private char tipoLicencia;
	private String nombreCompleto;
	private String fechaCaducidad;

	public Conductor(String nombre, String apellidos, String fechaNacimiento, String licencia, int id,
			char tipoLicencia, String nombreCompleto, String fechaCaducidad) {
		super(nombre, apellidos, fechaNacimiento, licencia);
		this.id = id;
		this.tipoLicencia = tipoLicencia;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
	}

	public char getTipoLicencia() {
		return tipoLicencia;
	}

	@Override
	public String toString() {
		return "Conductor [id=" + id + ", tipoLicencia=" + tipoLicencia + ", nombreCompleto=" + nombreCompleto
				+ ", fechaCaducidad=" + fechaCaducidad + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}
	
	
}
