package com.krakedev;
import java.lang.Math;


public class Circulo {
	
	private double radio;
	
	public double calcularPerimetro() {
		double perimetro = 2*Math.PI * radio;
		return perimetro;
	}
	
	public double calcularArea() {
		double area = Math.PI *(radio * radio);
		return area;
		
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
