package ejercicio1;

public class Tecnico extends Operario{

	public Tecnico() {
	
	}

	public Tecnico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " -> Técnico";
	}
	

}
