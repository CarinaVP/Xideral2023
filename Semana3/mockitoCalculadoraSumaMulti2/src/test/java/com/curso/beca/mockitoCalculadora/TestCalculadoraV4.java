package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculadoraV4 {
	
	@InjectMocks
	Calculadora calculadora;
	
	@Mock
	CloudCalculadora cloudGoogle;
	
	@Test
	public void testSumaCloud() {
		when(cloudGoogle.sumaExterna(6.0,14.0)).thenReturn(20.0);//OBLIGA A DAR COMO RESULTADO 20
		double resultado = 40;
		assertEquals(resultado,calculadora.suma(2.0,9.0),0.1);
	}
	@Test
	public void testMultiCloud() {
		when(cloudGoogle.multiExterna(6.0,14.0)).thenReturn(84.0);//OBLIGA A DAR COMO RESULTADO 84
		double resultado = 168;
		assertEquals(resultado,calculadora.multi(2.0,9.0),0.1);
	}
}
