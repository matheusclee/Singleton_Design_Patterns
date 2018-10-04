package testes;

import org.junit.Test;
import org.junit.Assert;

import figuras.Circulo;
import figuras.Quadrado;
import figuras.TrianguloEquilatero;
import figuras.TrianguloIsosceles;
import figuras.TrianguloRetangulo;

public class TestaFiguras {
	
	@Test
	public void testeCirculo(){
		Circulo circulo1 = Circulo.getInstance();
		Circulo circulo2 = Circulo.getInstance();
		
		Assert.assertEquals(circulo1, circulo2);
	}

	@Test
	public void testeTrianguloRetangulo(){
		TrianguloRetangulo retangulo1 = TrianguloRetangulo.getInstance();
		TrianguloRetangulo retangulo2 = TrianguloRetangulo.getInstance();
		
		Assert.assertEquals(retangulo1, retangulo2);
	}
	
	@Test
	public void testeTrianguloIsosceles(){
		TrianguloIsosceles isosceles1 = TrianguloIsosceles.getInstance();
		TrianguloIsosceles isosceles2 = TrianguloIsosceles.getInstance();
		
		Assert.assertEquals(isosceles1, isosceles2);
	}
	
	@Test
	public void testeTrianguloEquilatero(){
		TrianguloEquilatero equilatero1 = TrianguloEquilatero.getInstance();
		TrianguloEquilatero equilatero2 = TrianguloEquilatero.getInstance();
		
		Assert.assertEquals(equilatero1, equilatero2);
	}
	
	@Test
	public void testaQuadrado(){
		Quadrado quadrado1 = new Quadrado();
		Quadrado quadrado2 = new Quadrado();
		
		Assert.assertNotEquals(quadrado1, quadrado2);		
	}
	
}
