package com.curso.beca.mockitoCalculadora;

public class Calculadora {
	
	//INYECTAR
	//DELEGACION
	CloudCalculadora cloudCalc;
	
	double suma(double a,double b) {
		a += 8;
		b += 8;
		double resultadoSuma = cloudCalc.sumaExterna(a,b);
		return resultadoSuma * 2;
	}
	double multi(double a,double b) {
		a += 2;
		b += 2;
		double resultadoMulti = cloudCalc.multiExterna(a,b);
		return resultadoMulti * 2;
	}

}
