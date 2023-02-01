package com.iny;

public class JavaDev implements Puesto {

	private String puesto;
	
	public JavaDev(String puesto) {
		this.puesto=puesto;
	
	}
	
	@Override
	public void elegir() {
		System.out.println("Su puesto es: "+ puesto);
	}

}
