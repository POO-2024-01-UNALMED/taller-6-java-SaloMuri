package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadVentas = 0;
	private static ArrayList<Fabricante> ventasFabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		ventasFabricantes.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public int getVentasRealizadas() {
		return cantidadVentas;
	}
	
	public void ventasRealizadas() {
		this.cantidadVentas++;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante masVendedor = ventasFabricantes.get(0);
		for (Fabricante fabricante:ventasFabricantes) {
			if (fabricante.getVentasRealizadas() > masVendedor.getVentasRealizadas()) {
				masVendedor = fabricante;
			}
		}
		return masVendedor;
	}
}
