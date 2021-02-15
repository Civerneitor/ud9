
package models;


public class Raices {
    
	//ATRIBUTOS
    private double a;
    private  double b;
    private double c;
     
    //CONSTRUCTORES
    public Raices(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
     
 
    //METODOS
	private void obtenerRaices(){
         
        double x=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double y=(-b-Math.sqrt(getDiscriminante()))/(2*a);
         
        System.out.println("Solucion x"+x);
    
        System.out.println("Solucion y"+y);
     
    }
     
   
    private void obtenerRaiz(){
         
        double x=(-b)/(2*a);
         
        System.out.println("Unica solucion"+x);
  
         
    }
     
  
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
   
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
   
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
     
  
    public void calcular(){
         
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No solucion");
        }
         
    }
 }