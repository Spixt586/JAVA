package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado r1 = new Cuadrado();
		
		r1.lado = 4;
		
		double resultadoArea;
		resultadoArea = r1.calcularArea();
		
		System.out.println("El Area de un cuadrado es: " + resultadoArea);
		
	}

}
