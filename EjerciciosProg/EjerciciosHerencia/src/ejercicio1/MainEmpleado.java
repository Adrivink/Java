package ejercicio1;

public class MainEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1=new Operario("Alfonso");
		Oficial OF1=new Oficial("Marco");
		Tecnico T1=new Tecnico("Juan");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}

}
