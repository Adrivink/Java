package ejercicio7;

import java.util.Scanner; //IMPORTACION DEL SCANNER

public class MainEmpleado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in); // DECLARACION SCANNER???
		int num_empleados;

		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Juan Campos");
		empleado1.setNif("12353432j");
		empleado1.setSueldo_base(1000);
		empleado1.setCasado(true);
		empleado1.setNum_hijos(2);
		empleado1.setHoras_extra(4);

		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Carlos peña");
		empleado2.setNif("12353432b");
		empleado2.setSueldo_base(1500);
		empleado2.setCasado(true);
		empleado2.setNum_hijos(1);
		empleado2.setHoras_extra(6);

		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Maria Figueroa");
		empleado3.setNif("12353432k");
		empleado3.setSueldo_base(2000);
		empleado3.setCasado(false);
		empleado3.setNum_hijos(0);
		empleado3.setHoras_extra(8);

		System.out.println("Introducir numero de empleados");
		num_empleados = sn.nextInt();
		while (num_empleados > 20 || num_empleados < 1) {
			System.out.println("Introducir numero valido(<21)");
			num_empleados = sn.nextInt();
		}
		Empleado[] empleados = new Empleado[num_empleados];

		for (int i = 0; i < num_empleados; i++) {// DECLARACION DE OBJETO EN ARRAY
			empleados[i] = new Empleado();
			System.out.println("Introducir nombre");
			empleados[i].setNombre(sn.next());// INTRODUCIR DATOS DE LOS ATRIBUTOS
			System.out.println("Introducir NIF");
			empleados[i].setNif(sn.next());
			System.out.println("Introducir sueldo base");
			empleados[i].setSueldo_base(sn.nextDouble());
			System.out.println("Introducir condicion de casado");
			empleados[i].setCasado(sn.nextBoolean());
			System.out.println("Introducir numero de hijos");
			empleados[i].setNum_hijos(sn.nextInt());
			System.out.println("Introducir horas extra");
			empleados[i].setHoras_extra(sn.nextInt());
		}

		System.out.println("Introducir importe por horas extra realizadas");
		Empleado.imp_hora_extra = sn.nextDouble();

		System.out.println("Introducir retencion de irpf");
		Empleado.tipo_irpf = sn.nextDouble();

		Empleado aux = new Empleado();
		for (int i = 0; i < num_empleados - 1; i++) {
			for (int j = 0; j < num_empleados - 1 - i; j++) {
				if (empleados[j + 1].calculoSueldoNeto() < empleados[j].calculoSueldoNeto()) {
					aux = empleados[i + 1];
					empleados[j + 1] = empleados[j];
					empleados[j] = aux;
				}
			}
		}

		int x = 0;
		System.out.println("EMPLEADO CON MAYOR SUELDO");
		System.out.println(empleados[num_empleados - 1].toString());
		System.out.println("EMPLEADO CON MENOR SUELDO");
		System.out.println(empleados[0].toString());
		System.out.println("");
		while (x < num_empleados) {
			System.out.println(empleados[x].toString());
			x = x + 1;
		}
		sn.close();
		// nif = sn.nextLine(); // USO DEL SCANNER

	}

}
