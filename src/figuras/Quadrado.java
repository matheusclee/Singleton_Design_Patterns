package figuras;

public class Quadrado implements FiguraGeometrica{
	
	private double lado;
	
	public Quadrado(){
		
	}
	public Quadrado(double lado){
		setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4*getLado();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getLado()*getLado();
	}
}
