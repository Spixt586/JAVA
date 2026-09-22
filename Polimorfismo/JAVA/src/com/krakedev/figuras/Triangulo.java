package com.krakedev.figuras;

public class Triangulo extends Figura {
	
	private int lado;
	
	public Triangulo(int lado) {
		super("Triángulo", "Rojo");
		this.lado = lado;
	}
	
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor();
	}
	
	public int calcularPerimetro() {
		return 3 * lado;
	}
	
	public double calcularArea() {
	    return lado * lado * 0.43301270189;
	}
}
