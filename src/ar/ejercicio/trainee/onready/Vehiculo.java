package ar.ejercicio.trainee.onready;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	
	private String marca, modelo;
	private Double precio;
	
	public Vehiculo(String marca, String modelo, Double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	
	
	public abstract String toString();
	
	
	public int compareTo(Vehiculo v) {
		if(v.getPrecio()>precio) {
			return -1;
		} else if (v.getPrecio() == precio) {
			return 0;
		} else {
			return 1;
		}
	}
}
