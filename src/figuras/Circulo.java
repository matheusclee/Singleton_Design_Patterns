package figuras;

public class Circulo implements FiguraGeometrica{

	private static Circulo instancia = null;
	private double raio;
	private final double PI = 3.14;
	private final double DOIS = 2;
	
	private Circulo(){
		
	}
	
	public static Circulo getInstance(){
		if(instancia == null){
			instancia = new Circulo();
		}
		
		return instancia;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws Exception {
		if(raio > 0){
			this.raio = raio;
		}else{
			throw new Exception("O valor inserido é menor ou igual a zero.");
		}
	}

	@Override
	public double perimetro() {
		return DOIS*PI*getRaio();
	}

	@Override
	public double area() {
		return PI*(getRaio()*getRaio());
	}
}
