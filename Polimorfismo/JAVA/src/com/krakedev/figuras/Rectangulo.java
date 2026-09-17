package com.krakedev.figuras;

public class Rectangulo extends Figura{
	
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		super("Rectangulo", "Azul");
		this.base = base;
		this.altura = altura;
	}
	
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor();
	}
	
	@Override
	public int calcularPerimetro() {
		return (2 * base) + (2 * altura);
	}
}
