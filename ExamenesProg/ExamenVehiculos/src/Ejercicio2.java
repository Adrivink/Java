import java.util.Scanner;

import javax.xml.crypto.Data;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		boolean salir, cond = false;
		int res, max_vehiculos, num_vehiculo, km_nuevos;
	
		boolean coche_creado = false;
		Data fecha = null;

		Vehiculos vehiculo = new Vehiculos();

		do {
			ImprimirMenu();
			res = sn.nextInt();
			switch (res) {
			case 1:

				System.out.println("MARCA:");
				vehiculo.setMarca(sn.next());
				System.out.println("MATRÍCULA:");
				vehiculo.setMatricula(sn.next());
				System.out.println("NUMERO KILÓMETROS");
				vehiculo.setNum_km(sn.nextInt());
				System.out.println("DESCRIPCIÓN");
				vehiculo.setDescripcion(sn.next());
				vehiculo.setFecha(fecha);
				System.out.println("PRECIO:");
				vehiculo.setPrecio(sn.nextDouble());
				System.out.println("NOMBRE DEL PROPIETARIO:");
				vehiculo.setNombre_propietario(sn.next());
				System.out.println("DNI DEL PROPIETARIO:");
				vehiculo.setDni_propietario(sn.next());
				coche_creado = true;
				if (vehiculo.num_km < 0) {
					coche_creado = false;
				}
			case 2:
				if (coche_creado == true) {
					vehiculo.getMatricula();
				} else {
					System.out.println("El perfil del coche no ha sido creado");
				}
			case 3:
				if (coche_creado == true) {
					vehiculo.getNum_km();
				} else {
					System.out.println("El perfil del coche no ha sido creado");
				}
			case 4:
				if (coche_creado == true) {
					System.out.println("Introducir nuevos Km recorridos");
					km_nuevos = sn.nextInt();
					vehiculo.num_km = vehiculo.num_km + km_nuevos;
				} else {
					System.out.println("El perfil del coche no ha sido creado");
				}
			case 5:

			case 6:
				if (coche_creado == true) {
					vehiculo.getNombre_propietario();
				} else {
					System.out.println("El perfil del coche no ha sido creado");
				}
			case 7:
				if (coche_creado == true) {
					vehiculo.getDescripcion();
				} else {
					System.out.println("El perfil del coche no ha sido creado");
				}
			case 8:
				if (coche_creado == true) {
					vehiculo.getPrecio();
				} else {
					System.out.println("El perfil del coche no ha sido creado");
				}
			case 9:
				salir = true;
			}

		} while (salir = false);
	}

	public static void ImprimirMenu() {
		System.out.println("1.Nuevo Vehículo.");
		System.out.println("2.Ver Matrícula.");
		System.out.println("3.Ver Número De Kilómetros.");
		System.out.println("4.Actualizar Kilómetros.");
		System.out.println("5.Ver Años De Antigüedad.");
		System.out.println("6.Mostrar Propietario.");
		System.out.println("7.Mostrar Descripción.");
		System.out.println("8.Mostrar Precio.");
		System.out.println("9.Salir.");
	}

}
