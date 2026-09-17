package com.krakedev.figuras;

public class Triangulo extends Figura {
	public Triangulo() {
		super("Triángulo", "Rojo");
	}
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor();
	}
}
