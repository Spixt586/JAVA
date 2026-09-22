package com.krakedev.figuras;

public class Hexagono extends Figura{
	
	private int lado;
	
	public Hexagono(int lado) {
		super("Hexágono", "Cyan");
		this.lado = lado;
	}
	
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor();
	}
	
	@Override
	public int calcularPerimetro(){
		return 6 * lado;
	}
	
	public double calcularArea(){
		return (3 * Math.sqrt(3) * lado * lado) / 2;
	}
}

