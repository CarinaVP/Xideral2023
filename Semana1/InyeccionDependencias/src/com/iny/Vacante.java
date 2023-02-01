package com.iny;

public class Vacante {
	private String nombTrabajo;
	Puesto miPuesto;
	
	
	public Vacante (String nombTrabajo) {
		this.nombTrabajo=nombTrabajo;
	}
	
	void elegirTrabajo() {
		System.out.println(nombTrabajo);
		miPuesto.elegir();
		
	}

}