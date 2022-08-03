package cl.fsj.infoclub;

import java.util.ArrayList;

public class Main_Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<String> marcas = new ArrayList<>();
		
		marcas.add("RadioShack");
		marcas.add("Nokia");
		marcas.add("Sony VAIO");
		marcas.add("Sony Ericsson");
		marcas.add("iPod classic");
		marcas.add("Kodak");
		marcas.add("Palm");
		marcas.add("Atari");
		marcas.add("Compaq");
		marcas.add("BlackBerry");
		System.out.println(marcas);
		
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		System.out.println(marcas);

		marcas.set(10, "BlockBuster");
		System.out.println(marcas);
		System.out.println(marcas.remove("Carrefour"));
		System.out.println(marcas);
		
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("Syquest");
		posiblesMarcas.add("Iomega");
		posiblesMarcas.add("Napster");
		posiblesMarcas.add("WebVan");
		posiblesMarcas.add("Kozmo");
		
		marcas.addAll(posiblesMarcas);
		System.out.println(marcas);
		System.out.println("La cantidad de elementos que contiene la lista es: "+marcas.size());
	}
}
