package polimorf.clasAbs;

import java.util.*;


public class Principal {

	public static void main(String[] args) {
		
		List<Especie> ListaEspecie = new ArrayList<>();
		
		
		System.out.println("Clasificación de especies: ");
		
		
		//Llenado de la lista con objetos
		
		ListaEspecie.add( new Arbol("Alamo", "grueso", 15, "larga"));
		ListaEspecie.add( new Arbusto("Romero", "fino", 7, "mediana"));
		ListaEspecie.add( new Hierba("Amapola", "extra fino", 6, "corta"));

		for(Especie Especie : ListaEspecie) {
			System.out.println(Especie.toString());

		}

	}

}
