package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculadoraV3 {
	
	@InjectMocks
	Calculadora calculadora;
	
	@Mock
	CloudCalculadora cloudGoogle;
	
	@Test
	public void testSumaCloud() {
		when(cloudGoogle.sumaExterna(9.0,8.0)).thenReturn(17.0);//OBLIGA A DAR COMO RESULTADO 17
		double resultado = 34.0;
		assertEquals(resultado,calculadora.suma(9.0,8.0),0.1);
	}
	
	@Test
	public void testMultiCloud() {
		when(cloudGoogle.multiExterna(9.0,8.0)).thenReturn(72.0);//OBLIGA A DAR COMO RESULTADO 72
		double resultado = 144.0;
		assertEquals(resultado,calculadora.multi(9.0,8.0),0.1);
	}
	
}
