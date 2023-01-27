package com.iny.getsett;

public class Inyector {
	
	static void inyectarPuesto(Vacante vac) {
		vac.miPuesto = new JavaDev("Desarrollador Java");
		//vac.miPuesto= new DataAnalyst("Usted obtuvo el puesto a analista de datos");
	}

}
