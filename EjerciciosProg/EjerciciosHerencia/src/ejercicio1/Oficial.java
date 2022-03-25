package ejercicio1;

public class Oficial extends Operario {

	public Oficial() {
	
	}

	public Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}

}
