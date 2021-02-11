public class Television extends Electrodomestico {

    final static private boolean DEF_TDT = false;
    final static private double DEF_RESOLUCION = 20;
    
    private double resolucion;
    private boolean tdt;
    
    
    
    public void precioFinal(){
     
    	if (resolucion>40){
            precio+=precio*0.3;
        }
    	if (tdt){
            precio+=50;
        }
        super.precioFinal();
  
        
        
    }
    
    public Television() {
    	super();
        this.tdt = DEF_TDT;
        this.resolucion = DEF_RESOLUCION;
        precioFinal();
    }

    public Television(double precio, String color, char clase, int peso, double resolucion, boolean tdt) {

        super(precio, color, clase, peso);
        this.tdt = tdt;
        this.resolucion = resolucion;
        precioFinal();

      
    }

    public Television(double precio, int peso) {
        super(precio, peso);
        this.tdt = DEF_TDT;
        this.resolucion = DEF_RESOLUCION;
        precioFinal();
    }
}