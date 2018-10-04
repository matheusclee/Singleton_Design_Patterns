package figuras;

public class TrianguloEquilatero implements FiguraGeometrica, Triangulo{

	private double lado;
	
	private TrianguloEquilatero(){
		
	}
	
	private static TrianguloEquilatero instancia = null;
	
	public static TrianguloEquilatero getInstance(){
		if(instancia == null){
			instancia = new TrianguloEquilatero();
		}
		return instancia;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 3*lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (lado*Math.sqrt(3))/4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return (getLado()*Math.sqrt(3))/2;
	}


	@Override
	public double getBase() {
		// TODO Auto-generated method stub
		return lado;
	}

	@Override
	public void setAltura(double altura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBase(double base) {
		// TODO Auto-generated method stub
		
	}
}
