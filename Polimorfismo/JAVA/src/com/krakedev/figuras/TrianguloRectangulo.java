package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura{
	private int catetoA;
	private int catetoB;
	private double hipotenusa; 
	
	public TrianguloRectangulo(int catetoA, int catetoB) {
		super("Triángulo Rectángulo", "Naranja");
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.hypot(catetoA, catetoB); //Math.hypot para calcular la hipotenusa
	}
	
	public String toString() {
		return "Nombre de la figura: " + getNombre() + " || Color: " + getColor(); 
	}
	
	public int calcularPerimetro() {
		return catetoA + catetoB + (int)hipotenusa;
	}
	
	public double calcularArea() {
		return (catetoA * catetoB)/2.0;
	}
}
