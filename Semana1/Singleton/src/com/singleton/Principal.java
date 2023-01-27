package com.singleton;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punta punta1=Punta.getInstance(); //con la clase invocamos el método estático
		Punta punta2=Punta.getInstance(); //invocamos la conexión
		Punta punta3=Punta.getInstance();
		System.out.println(Punta.contador);

	}
	

}
