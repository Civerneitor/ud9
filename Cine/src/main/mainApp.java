package main;
import java.util.Scanner;
import models.Cine;
import models.Espectador;
import models.Metodos;
import  models.Pelicula;
public class mainApp {
 
    public static void main(String[] args) {
 
        Pelicula pelicula = new Pelicula("Seño de los anillos", 190 , 14 , "Jackson");
        
        Scanner sn = new Scanner(System.in);
         
        System.out.println("Introduce el numero de filas");
        int filas=sn.nextInt();
 
        System.out.println("Introduce el numero de columnas");
        int columnas=sn.nextInt();
         
        System.out.println("precio de la entrada de cine");
        double precio=sn.nextDouble();
         
        Cine cine = new Cine(filas, columnas, precio, pelicula);
 
        System.out.println("Introduce el numero de espectadores a crear");
        int numEspectadores = sn.nextInt();
 
        Espectador e;
        int fila;
        char letra;
 
        System.out.println("Espectadores generados: ");
        for (int i = 0; i < numEspectadores; i++) {
 
         
            e = new Espectador(
                   Metodos.nombres[Metodos.generaNumeroEnteroAleatorio(0, Metodos.nombres.length - 1)], 
                    Metodos.generaNumeroEnteroAleatorio(10, 30),
                    Metodos.generaNumeroEnteroAleatorio(1, 10)); 
                      System.out.println(e);
            do {
 
                fila = Metodos.generaNumeroEnteroAleatorio(0, cine.getFilas() - 1);
                letra = (char) Metodos.generaNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas()-1));
 
            } while(!cine.haySitioButaca(fila, letra) && cine.haySitio());
 
         
            if (cine.sePuedeSentar(e)) {
                e.pagar(cine.getPrecio()); 
                cine.sentar(fila, letra, e);
            }
 
        }
 
        System.out.println("");
        cine.mostrar(); 
         
        System.out.println("Fin");
 
    }
 
}
