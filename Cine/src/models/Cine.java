package models;
public class Cine {
 
  
    private Asientos asientos[][];
    private double precio;
    private Pelicula pelicula;
 
    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
 
        asientos = new Asientos[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaButacas();
    } 
 
 /*
    public Asientos[][] getAsientos() {
        return asientos;
    }*/
 
    public void setAsientos(Asientos[][] asientos) {
        this.asientos = asientos;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    public Pelicula getPelicula() {
        return pelicula;
    }
 
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
 

    private void rellenaButacas() {
 
        int fila = asientos.length;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                asientos[i][j] = new Asientos((char) ('A' + j), fila);
            }
        }
 
    }
 
 
    public boolean haySitio() {
 
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
 
                if (!asientos[i][j].ocupado()) {
                    return true;
                }
 
            }
        }
 
        return false;
    }
 

    public boolean haySitioButaca(int fila, char letra) {
        return !getAsiento(fila, letra).ocupado();
    }
   
  
    public boolean sePuedeSentar(Espectador e) {
        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());
    }
 

    public void sentar(int fila, char letra, Espectador e) { 
        getAsiento(fila, letra).setEspectador(e);
    }
 

    public Asientos getAsiento(int fila, char letra) {
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }
 
 
    public int getFilas() {
        return asientos.length;
    }
 
    public int getColumnas() {
        return asientos[0].length;
    }
 
   
    public void mostrar() {
 
        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }
 
}