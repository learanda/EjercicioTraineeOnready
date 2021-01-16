package ar.ejercicio.trainee.onready;

public class Auto extends Vehiculo {
	
	private Integer puertas;
	
	public Auto(String marca, String modelo, Integer puertas, Double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public Integer getPuertas() {
		return puertas;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Puertas: " +
				getPuertas() + " // " + "Precio: " + getPrecio() + "\n";
	}
	
}
