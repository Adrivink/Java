import java.sql.Date;

import javax.xml.crypto.Data;

public class Vehiculos {
	String marca, matricula, descripcion, nombre_propietario, dni_propietario;
	int num_km;
	double precio;
	Data fecha;
	static int[] vehiculos;
	
	public Vehiculos() {
		
	}

	public Vehiculos(String marca, String matricula, String descripcion, String nombre_propietario,
			String dni_propietario) {
		this.marca = marca;
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.nombre_propietario = nombre_propietario;
		this.dni_propietario = dni_propietario;
	}
	
	public Vehiculos(Vehiculos vehiculo) {
		this.marca = vehiculo.marca;
		this.matricula = vehiculo.matricula;
		this.descripcion = vehiculo.descripcion;
		this.nombre_propietario = vehiculo.nombre_propietario;
		this.dni_propietario = vehiculo.dni_propietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre_propietario() {
		return nombre_propietario;
	}

	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}

	public String getDni_propietario() {
		return dni_propietario;
	}

	public void setDni_propietario(String dni_propietario) {
		this.dni_propietario = dni_propietario;
	}
	
	public int getNum_km() {
		return num_km;
	}

	public void setNum_km(int num_km) {
		this.num_km = num_km;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Data getFecha() {
		return fecha;
		
	}

	public void setFecha(Data fecha) {
		this.fecha = fecha;
	}
	
	public Data getAnios() {
		return fecha;
		
	}

	
}