package models;
public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;

    
	
	public Espectador(String nombre, int edad, double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getDinero() {
		return dinero;
	}


	public void setDinero(double dinero) {
		this.dinero = dinero;   
	}

  public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }

  
  
  public void pagar(double precio) {
      dinero -= precio;
  }
  


@Override
public String toString() {
	return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
}


public boolean tieneEdad(int edadMinima) {
	// TODO Auto-generated method stub
	
	return edad>=edadMinima;
}



}
