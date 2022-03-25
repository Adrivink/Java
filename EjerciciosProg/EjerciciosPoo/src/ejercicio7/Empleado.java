package ejercicio7;

public class Empleado {// Primera letra de la clase mayuscula
	private String nif, nombre;
	private double sueldo_base;
	private int horas_extra, num_hijos;
	boolean casado;
	static double tipo_irpf;
	static double imp_hora_extra;
	static int[] empleados = new int[20];

	public Empleado() {

	}

	public Empleado(String nif, String nombre, double sueldo_base, double tipo_irpf, int horas_extra, int num_hijos,
			boolean casado) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sueldo_base = sueldo_base;
		this.horas_extra = horas_extra;
		this.num_hijos = num_hijos;
		this.casado = casado;
	}

	public static void setTipo_irpf(double tipo_irpf) {
		Empleado.tipo_irpf = tipo_irpf;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo_base() {
		return sueldo_base;
	}

	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}

	public double getTipo_irpf() {
		return tipo_irpf;
	}



	public int getHoras_extra() {
		return horas_extra;
	}

	public void setHoras_extra(int horas_extra) {
		this.horas_extra = horas_extra;
	}

	public int getNum_hijos() {
		return num_hijos;
	}

	public void setNum_hijos(int num_hijos) {
		this.num_hijos = num_hijos;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public static double getImp_hora_extra() {
		return imp_hora_extra;
	}

	public static void setImp_hora_extra(int imp_horas_extra) {
		Empleado.imp_hora_extra = imp_horas_extra;
	}

	public double calculoComplemento() {

		return imp_hora_extra * horas_extra;
	}

	public double calculoSueldoBruto() {
		return sueldo_base + calculoComplemento();
	}
	
	public double calculoSueldoNeto() {
		return calculoSueldoBruto()-calculoSueldoBruto()*(irpf()/100);
	}

	public double irpf() {
    if(casado==true) {
    	return tipo_irpf=tipo_irpf-2-num_hijos;
    }else {
    	return tipo_irpf=tipo_irpf-num_hijos;
    }
	}

	@Override
	public String toString() {
		return  " \nNombre: " + nombre + "NIF: " + nif + " \nSueldo base: " + sueldo_base + " \nTipo IRPF:"+" \nSueldo bruto: "+calculoSueldoBruto()
				+" \nSueldo neto:"+ calculoSueldoNeto() + " \nHoras extra: " + horas_extra + " \nNumero de hijos: " + num_hijos + " \nCasado: " + casado;
	}

}
