package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private int cantidadVentas = 0;
	private static ArrayList<Pais> ventasPaises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		ventasPaises.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVentasRealizadas() {
		return cantidadVentas;
	}
	
	public void ventasRealizadas() {
		this.cantidadVentas++;
	}
	
	public static Pais paisMasVendedor() {
		Pais masVendedor = ventasPaises.get(0);
		for (Pais pais:ventasPaises) {
			if (pais.getVentasRealizadas() > masVendedor.getVentasRealizadas()) {
				masVendedor = pais;
			}
		}
		return masVendedor;
	}
}