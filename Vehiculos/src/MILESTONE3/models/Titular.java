package MILESTONE3.models;

public class Titular extends Persona {
	private int id;
	private char tipoLicencia;
	private String nombreCompleto;
	private String fechaCaducidad;
	private boolean seguro;
	private boolean garaje;
	public Titular(String nombre, String apellidos, String fechaNacimiento, String licencia, int id,
			char tipoLicencia, String nombreCompleto, String fechaCaducidad, boolean seguro, boolean garaje) {
		super(nombre, apellidos, fechaNacimiento, licencia);
		this.id = id;
		this.tipoLicencia = tipoLicencia;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
		this.seguro = seguro;
		this.garaje = garaje;
	}
	public char getTipoLicencia() {
		return tipoLicencia;
	}
	public int getId() {
		return id;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	@Override
	public String toString() {
		return "Titular [id=" + id + ", tipoLicencia=" + tipoLicencia + ", nombreCompleto=" + nombreCompleto
				+ ", fechaCaducidad=" + fechaCaducidad + ", seguro=" + seguro + ", garaje=" + garaje + ", toString()="
				+ super.toString() + "]";
	}


	
	
}
