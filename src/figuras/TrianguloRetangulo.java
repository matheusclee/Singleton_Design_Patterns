package figuras;

public class TrianguloRetangulo implements FiguraGeometrica, Triangulo{
	
	private double base;
	private double altura;
	private double ladoA;
	
	private TrianguloRetangulo(){
		
	}
	
	private static TrianguloRetangulo instancia = null;
	
	public static TrianguloRetangulo getInstance(){
		if(instancia == null){
			instancia = new TrianguloRetangulo();
		}
		return instancia;
	}

	@Override
	public double perimetro() {
		return ladoA+altura+base;
	}

	@Override
	public double area() {
		return (base*altura)/2;
	}

	@Override
	public void setAltura(double altura) {
		this.altura = altura;
		
	}

	@Override
	public double getAltura() {
		return altura;
	}

	@Override
	public void setBase(double base) {
		this.base = base;
		
	}

	@Override
	public double getBase() {
		return base;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
}
