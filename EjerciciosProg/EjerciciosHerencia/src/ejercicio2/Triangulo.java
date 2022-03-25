package ejercicio2;

public class Triangulo extends Poligono {
double lado1,lado2,lado3;

public Triangulo() {
	super();
	// TODO Auto-generated constructor stub
}

public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
	super(3);
	this.lado1=lado1;
	this.lado2=lado2;
	this.lado3=lado3;
	// TODO Auto-generated constructor stub
}



public double getLado1() {
	return lado1;
}

public void setLado1(double lado1) {
	this.lado1 = lado1;
}

public double getLado2() {
	return lado2;
}

public void setLado2(double lado2) {
	this.lado2 = lado2;
}

public double getLado3() {
	return lado3;
}

public void setLado3(double lado3) {
	this.lado3 = lado3;
}

@Override
public String toString() {
	return null;
	// TODO Auto-generated method stub

}

@Override
double area() {
	// TODO Auto-generated method stub
	double s=(lado1+lado2+lado3)/2;
	
	return Math.pow(s*(s-lado1)*(s-lado2)*(s-lado3), (1/2));
}

}