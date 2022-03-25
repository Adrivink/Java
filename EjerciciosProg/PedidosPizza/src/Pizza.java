
public class Pizza {
private String tipo,tamaño,estado;
private boolean cond;
private static int totalpedidas,totalservidas;
public Pizza(String tipo, String tamaño) {
	this.tipo = tipo;
	this.tamaño = tamaño;
	estado="pedida";
	cond=false;
	totalpedidas++;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getTamaño() {
	return tamaño;
}
public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public static int getTotalpedidas() {
	return totalpedidas;
}

public static int getTotalservidas() {
	return totalservidas;
}

public void sirve() {
	estado="servida";
	if(estado=="servida" && cond==false) {
		totalservidas++;
		cond=true;
		
	}
}
@Override
public String toString() {
	return "Tipo: " + tipo + " \nTamaño: " + tamaño + " \nEstado: " + estado+"\n";
}



}
