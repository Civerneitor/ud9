package models;
public class Asientos {
 
    private char letra;
    private int fila;
    private Espectador espectador; 
 
   
    public Asientos(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null; 
    }
 
    public char getLetra() {
        return letra;
    }
 
    public void setLetra(char letra) {
        this.letra = letra;
    }
 
    public int getFila() {
        return fila;
    }
 
    public void setFila(int fila) {
        this.fila = fila;
    }
 
    public Espectador getEspectador() {
        return espectador;
    }
 
    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
 
    
    public boolean ocupado() {
        return espectador != null;
    }
 
    @Override
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letra + " y " + espectador;
        }
 
        return "Asiento: " + fila + letra + "  vacio ";
 
    }
 
}
