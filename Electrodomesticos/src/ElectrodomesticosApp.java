
public class ElectrodomesticosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico[] elems = new Electrodomestico[10];
		elems[0] = new Electrodomestico(2,"azul",'A',3);
		elems[1] = new Lavadora();
		elems[2] = new Television(20,30);
		elems[3] = new Lavadora(14,200,"gris",'B',300);
		elems[4] = new Television(77,"azul",'C',77,79,true);
		elems[5] = new Lavadora(8,55,"verde",'D',55);
		elems[6] = new Television(30,"blanco",'E',49,42,true);
		elems[7] = new Lavadora(24,17,"negro",'F',17);
		elems[8] = new Television(44,"rojo",'G',44,49,false);
		elems[9] = new Television(29,39);
		
		int c = 0;
		for( int i = 0; i<10;i++) {
			if (elems[i] instanceof Lavadora ) {
				c++;
				System.out.println("Precio Lavadora "+c+": "+elems[i].getPrecio());
			}
		}
		c = 0;
		for( int i = 0; i<10;i++) {
			if (elems[i] instanceof Television ) {
				c++;
				System.out.println("Precio Television "+c+": "+elems[i].getPrecio());
			}
		}
		double suma = 0;
		for( int i = 0; i<10;i++) {
			if (elems[i] instanceof Electrodomestico) {
				suma+=elems[i].getPrecio();
			}
		}
		System.out.println("La suma del precio de todos los Electrodomesticos da:"+suma+"€");

	}

}
