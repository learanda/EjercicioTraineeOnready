package ar.ejercicio.trainee.onready;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("Peugeot", "206", 4, 200000.0);
		Moto m1 = new Moto("Honda", "Titan", "125cc", 60000.0);
		Auto a2 = new Auto("Peugeot", "208", 5, 250000.0);
		Moto m2 = new Moto("Yamaha", "YBR", "160cc", 80500.50);
		
		ArrayList concesionaria = new ArrayList<Vehiculo>();
		
		concesionaria.add(a1);
		concesionaria.add(m1);
		concesionaria.add(a2);
		concesionaria.add(m2);
		
		//System.out.println(concesionaria);
		
		for (Object index: concesionaria)
			System.out.println(index);
		
		System.out.println("=============================\n");
		
		//Tomo el primer elemento de la lista para usar como inicial de mas caro/mas barato
		Vehiculo ve = (Vehiculo) concesionaria.get(0);
		
		//Para obtener el vehiculo mas caro ===========
		Double masCaro = ve.getPrecio();
		String marcaMasCaro = " ";
		String modeloMasCaro = " ";
		
		for (int i = 1; i < concesionaria.size(); i++) {
			Vehiculo vehic = (Vehiculo) concesionaria.get(i);
			if (vehic.getPrecio() > masCaro) {
				masCaro = vehic.getPrecio();
				marcaMasCaro = vehic.getMarca();
				modeloMasCaro = vehic.getModelo();
			}
		}
		
		System.out.println("Vehículo más caro: " + marcaMasCaro + " " + modeloMasCaro);
		// ============================================
		
		//Para obtener el vehiculo mas barato ===========
		Double masBarato = ve.getPrecio();
		String marcaMasBarato = " ";
		String modeloMasBarato = " ";
		
		for (int i = 1; i < concesionaria.size(); i++) {
			Vehiculo vehic = (Vehiculo) concesionaria.get(i);
			if (masBarato > vehic.getPrecio()) {
				masBarato = vehic.getPrecio();
				marcaMasBarato = vehic.getMarca();
				modeloMasBarato = vehic.getModelo();
			}
		}
		
		System.out.println("Vehículo más barato: " + marcaMasBarato + " " + modeloMasBarato);
		// ============================================
		
		//Para saber modelo con letra Y ===============
		for (int i = 0; i < concesionaria.size(); i++) {
			Vehiculo ve2 = (Vehiculo) concesionaria.get(i);
			String modelo = ve2.getModelo();
			char[] caracteres = modelo.toCharArray();
			
			for (int j = 0; j < caracteres.length; j++) {
				if (caracteres[j] == 'Y') {
					System.out.println("Vehículo que contiene en el modelo la letra 'Y': " +
							ve2.getMarca() + " " + ve2.getModelo() + " " + ve2.getPrecio());
				}
			}
		}
		// ============================================
		System.out.println("\n=============================\n");
		
		//Con el compareTo de la clase Vehiculo establezco que se ordenan por precio (+ el implements Comparable)
		//Con sort se ordena y con reverse invierto el orden.
		//Luego simplemente recorro la lista como lo venía haciendo anteriormente y muestro los datos solicitados
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		Collections.sort(concesionaria);
		Collections.reverse(concesionaria);
		
		for (int i = 0; i < concesionaria.size(); i++) {
			Vehiculo v3 = (Vehiculo) concesionaria.get(i);
			String marca = v3.getMarca();
			String modelo = v3.getModelo();
			System.out.println(marca + " " + modelo);
		}
	}

}
