package com.krakedev.figuras;

public class Graficador{
	
	public void graficar(Figura figura) {
		System.out.println("Graficado " + figura.getNombre() + " de color " + figura.getColor() + " con perímetro: " + figura.calcularPerimetro() + " y de área: " + figura.calcularArea());
	}
}
