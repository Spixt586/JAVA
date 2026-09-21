package com.krakedev.figuras;

public class Triangulo extends Figura {
	
	private int lado;
	
	public Triangulo() {
		super("Triángulo", "Rojo");
	}
	
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor();
	}
	
	public int calcularPerimetro() {
		return 3 * lado;
	}
	
}
