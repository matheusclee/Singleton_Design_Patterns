package figuras;

public class TrianguloIsosceles implements FiguraGeometrica, Triangulo{
	
	private double base; 
	private double altura;
	private double ladosIguais;
	
	private TrianguloIsosceles(){
		
	}
	
	private static TrianguloIsosceles instancia = null;
	
	public static TrianguloIsosceles getInstance(){
		if(instancia == null){
			instancia = new TrianguloIsosceles();
		}
		
		return instancia;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (2*ladosIguais)+base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (altura*base)/2;
	}

	@Override
	public void setAltura(double altura) {
		this.altura = altura;
		
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public void setBase(double base) {
		this.base = base;
		
	}

	@Override
	public double getBase() {
		// TODO Auto-generated method stub
		return base;
	}
	
	public void setLadosIguais(double lado){
		this.ladosIguais = lado;
	}

}
