package ejercicio2;

public class Rectangulo extends Poligono {
	double lado1, lado2;

	public Rectangulo() {

	}

	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(2);
        this.lado1=lado1;
        this.lado2=lado2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return lado1*lado2;
	}

}
