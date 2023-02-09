package com.mitocode.java8mito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaApp {
	public void ordenar() {
		List<String> lista=new ArrayList<>();
		lista.add("CarinaJava");
		lista.add("Carina");
		lista.add("CarinaJavaXideral");
		
		//ejecuto el orden
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2); //comparo
//			}
//		});
		Collections.sort(lista, (String p1, String p2)->p1.compareTo(p2));
		//recorremos lista ordenada
		for(String elemento : lista) {
			System.out.println(elemento);
		}
	}
    public void calcular() {
//    	Operacion operacion= new Operacion() {
//    		@Override
//    		public double calcularPromedio(double n1, double n2){
//    			return (n1+n2)/2;    			
//    			}
//    		};
//    		System.out.println(operacion.calcularPromedio(2,3));
    	Operacion operacion= (double x, double y)->(x+y)/2;
    	System.out.println(operacion.calcularPromedio(2, 3));
    }
	public static void main( String[] args )
    {
        LamdaApp app= new LamdaApp();
        	app.ordenar();
        	app.calcular();
    }
}
