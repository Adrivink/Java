package ejercicio10;
import java.util.Scanner;

import ejercicio7.Empleado;
public class Articulo {

	
		// TODO Auto-generated method stub
		private String codigo,descripcion;
		private double precio_compra,precio_venta;
		private int stock;
		Articulo[] art=new Articulo[10000];
		
		
		public Articulo() {
			super();
			this.art = art;
		}

		private static Scanner sn = new Scanner(System.in);
		
		public Articulo(String codigo, String descripcion, double precio_compra, double percio_venta, int stock) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.precio_compra = precio_compra;
			this.precio_venta = percio_venta;
			this.stock = stock;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public double getPrecio_compra() {
			return precio_compra;
		}
		public void setPrecio_compra(double precio_compra) {
			this.precio_compra = precio_compra;
		}
		public double getPrecio_venta() {
			return precio_venta;
		}
		public void setPrecio_venta(double percio_venta) {
			this.precio_venta = percio_venta;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		@Override
		public String toString() {
			return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precio_compra=" + precio_compra
					+ ", percio_venta=" + precio_venta + ", stock=" + stock + "]";
		}
		

}
