package com.singleton;

public class Punta {
	
	private String nombre;
	static int contador;
	//este atributo debe ir static por consecuencia
	private static Punta punta; //atributo de la clase privado
	
	private Punta(String nombre) {//esta unica clase puede invocar a Punta

		this.nombre=nombre;
		contador++; //se crea cuando existe la conexión
	}
	//el método estatíco no puede invocar atributos que no sean estáticos
	//con static invocamos el método sin crear el objeto
	public static Punta  getInstance() { //método publico que regresa el Singleton
		
		if(punta==null) {
			punta=new Punta("lapiz");
			return punta;
		} else {
			return punta;
		}
	}

}

