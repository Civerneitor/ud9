package MILESTONE2.models;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected String licencia;
	public Persona(String nombre, String apellidos, String fechaNacimiento, String licencia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.licencia = licencia;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", licencia=" + licencia + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getLicencia() {
		return licencia;
	}
	
	
}
