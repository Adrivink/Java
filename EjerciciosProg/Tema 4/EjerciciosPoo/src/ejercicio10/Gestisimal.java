package ejercicio10;
import java.util.Scanner;

import ejercicio7.Empleado;
public class Gestisimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		int op;
		int cont=0;
	
		
		Scanner sn = new Scanner(System.in);
		
		Articulo[] art = new Articulo[10000];
		
		while(salir==false) {
			opciones();
			System.out.println("Elegir opción");
			op=sn.nextInt();
			switch(op) {
			case 1:
				
			case 2:
				art[cont]=new Articulo();
				System.out.println("Introducir descripcion");
				art[cont].setDescripcion(sn.next());
				System.out.println("Introducir código");
				art[cont].setCodigo(sn.next());
				System.out.println("Introducir precio de compra");
				art[cont].setPrecio_compra(sn.nextDouble());
				System.out.println("Introducir precio de venta");
				art[cont].setPrecio_venta(sn.nextDouble());
				
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				salir=true;
			}
			
		}
	}
	
	public static void opciones() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancia");
		System.out.println("6. Salida de mercancia");
		System.out.println("7. Salir");
	}
	

}
