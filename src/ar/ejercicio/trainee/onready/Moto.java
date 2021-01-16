package ar.ejercicio.trainee.onready;

public class Moto extends Vehiculo {
	
	private String cilindrada;
	
	public Moto(String marca, String modelo, String cilindrada, Double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Cilindrada: " +
				getCilindrada() + " // " + "Precio: $" + getPrecio() + "\n";
	}

	
}
