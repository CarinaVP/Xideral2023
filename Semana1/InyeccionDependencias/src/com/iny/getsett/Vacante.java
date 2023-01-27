package com.iny.getsett;

public class Vacante {
	private String nombTrabajo;
	private Puesto miPuesto; //modificamos el acceso
	
	//generamos gett y sett
	public Puesto getMiPuesto() {
		return miPuesto;
	}

	public void setMiPuesto(Puesto miPuesto) {
		this.miPuesto = miPuesto;
	}

	public Vacante (String nombTrabajo) {
		this.nombTrabajo=nombTrabajo;
	}
	
	void elegirTrabajo() {
		System.out.println(nombTrabajo);
		miPuesto.elegir();
		
	}

}