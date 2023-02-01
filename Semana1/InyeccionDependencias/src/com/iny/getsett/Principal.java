package com.iny.getsett;

public class Principal {

	public static void main(String[] args) {
		
		Vacante vacante= new Vacante ("Ernesto Pizarro");
		
		
		Inyector.inyectarPuesto(vacante);
		vacante.elegirTrabajo();

	}

}
