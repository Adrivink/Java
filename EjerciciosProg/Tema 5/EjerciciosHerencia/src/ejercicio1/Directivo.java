package ejercicio1;

public class Directivo extends Empleado {

	public Directivo() {

	}

	public Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+" -> Directivo";
	}

}
