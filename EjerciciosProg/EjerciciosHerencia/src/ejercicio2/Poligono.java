package ejercicio2;

public abstract class Poligono {
	int numeroLados;

	public Poligono() {}
	
	public Poligono(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}
	public abstract String toString();
	abstract double area();
		
	
}
