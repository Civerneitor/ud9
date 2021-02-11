
public class VideoclubApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Videojuego listaVideojuegos[] = new Videojuego[5];
	
	    listaVideojuegos[0] = new Videojuego();
	    listaVideojuegos[1] = new Videojuego("The witcher 3", 30);
	    listaVideojuegos[2] = new Videojuego("FIFA2020",0, "Deportes", "Hakira Toriyama", "EA");
	    listaVideojuegos[3] = new Videojuego("Super Mario Bros", 30, "Plataforma", "Luigi", "Nintento");
	    listaVideojuegos[4] = new Videojuego("Final fantasy VII", 200, "Aventura", "Sora", "Square Enix");
	    
	    
	    Serie listaSeries[] = new Serie[5];
	    
	    listaSeries[0] = new Serie();
	    listaSeries[1] = new Serie("Big Band Theory","George R. R. Martin ");
	    listaSeries[2] = new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
	    listaSeries[3] = new Serie("La casa de papel", 3, "Suspense", "Seth MacFarlane");
	    listaSeries[4] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
	    
	    
	    //Entregar
	    listaVideojuegos[0].entregar();
	    listaVideojuegos[3].entregar();
	    listaSeries[2].entregar();
	    listaSeries[4].entregar();
	    
	    int cseries=0;
	    int cvideojuegos=0;
	    Videojuego vlargo = listaVideojuegos[0];
	    Serie slarga = listaSeries[0];
	    for(int i =0;i<5;i++) {
	    	if(listaSeries[i].isEntregado()) {
	    		cseries++;
	    		System.out.println(listaSeries[i].toString());
	    	}
	    	if(listaVideojuegos[i].isEntregado()) {
	    		cvideojuegos++;
	    		System.out.println(listaVideojuegos[i].toString());
	    	}
	    	slarga = listaSeries[i].compareTo(slarga);
	    	vlargo = listaVideojuegos[i].compareTo(vlargo);
	    	
	    }
	    
	    System.out.println("Tenemos entregados "+cseries+" Series y "+cvideojuegos+" Videojuegos.");
	    
	    System.out.println("El videojuego más largo es:"+vlargo.toString());
	    
	    System.out.println("La serie más larga es:"+slarga.toString());
	    
	    
	}

}
