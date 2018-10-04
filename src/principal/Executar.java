package principal;
import figuras.*;

public class Executar {

	public static void main(String[] args) throws Exception{
		
		Circulo circulo = Circulo.getInstance();
		System.out.println(Circulo.getInstance());
		circulo.setRaio(5);
		System.out.println(circulo.area());
		System.out.println(circulo.perimetro());
		
		Circulo circulo2 = Circulo.getInstance();
		System.out.println(circulo2.area());
		
		System.out.println("\n");
		
		TrianguloEquilatero equilatero = TrianguloEquilatero.getInstance();
		System.out.println(TrianguloEquilatero.getInstance());
		equilatero.setLado(15);
		System.out.println(equilatero.area());
		System.out.println(equilatero.getAltura());
		System.out.println(equilatero.perimetro());
		
		TrianguloEquilatero equilatero2 = TrianguloEquilatero.getInstance();
		System.out.println(equilatero2.area());
		
		System.out.println("\n");
		
		TrianguloIsosceles isosceles = TrianguloIsosceles.getInstance();
		System.out.println(TrianguloIsosceles.getInstance());
		isosceles.setAltura(10);
		isosceles.setBase(15);
		isosceles.setLadosIguais(8);
		System.out.println(isosceles.area());
		System.out.println(isosceles.perimetro());
		
		TrianguloIsosceles isosceles2 = TrianguloIsosceles.getInstance();
		System.out.println(isosceles2.area());
		
		System.out.println("\n");
		
		TrianguloRetangulo retangulo = TrianguloRetangulo.getInstance();
		System.out.println(TrianguloRetangulo.getInstance());
		retangulo.setAltura(3);
		retangulo.setBase(4);
		retangulo.setLadoA(5);
		System.out.println(retangulo.area());
		System.out.println(retangulo.perimetro());
		
		TrianguloRetangulo retangulo2 = TrianguloRetangulo.getInstance();
		System.out.println(retangulo2.area());
		
		System.out.println("\n");
		
		Quadrado quadrado1 = new Quadrado(10);
		System.out.println(quadrado1.area());
		System.out.println(quadrado1.perimetro());
	}
}
