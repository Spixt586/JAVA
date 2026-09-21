package com.krakedev.figuras;

public class Cuadrado extends Figura{
	
	private int lado;
	
	public Cuadrado(int lado) {
		super("Cuadrado", "Verde");
		this.lado = lado;
	}
	
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor();
	}
	
	@Override
	public int calcularPerimetro() {
		return 4 * lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
}
