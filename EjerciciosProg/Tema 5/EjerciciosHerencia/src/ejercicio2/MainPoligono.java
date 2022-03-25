package ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
public class MainPoligono {
	static Scanner sn = new Scanner(System.in);
	static int n=0;
	int sum=0;
	
	static ArrayList<Object> Poligonos = new ArrayList<Object>();
	
	public static void llenarTriangulo() {
		System.out.println("Introducir primer lado");
		double l1=sn.nextDouble();
		System.out.println("Introducir Segundo lado");
		double l2=sn.nextDouble();
		System.out.println("Introducir Tercer lado");
		double l3=sn.nextDouble();
		Poligonos.add(n,new  Triangulo (3,l1,l2,l3));
		n=n+1;
	}
	public static void llenarRectangulo() {
		System.out.println("Introducir primer lado");
		double l1=sn.nextDouble();
		System.out.println("Introducir Segundo lado");
		double l2=sn.nextDouble();
		
		Poligonos.add(n,new  Rectangulo (2,l1,l2));
		n=n+1;
	}
	
	public static void MostrarResultado() {
		System.out.println("Número de poligonos: "+Poligonos.size());
		for(int num: Poligonos.size())sum+=x;
	}
}
