package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1;
		int r2;
		double r3;
		double r4;
		double r5;
		
		r1 = c1.sumar(8, 5);
		r2 = c1.restar(5, 8);
		r3 = c1.multiplicar(9, 10);
		r4 = c1.dividir(40, 8);
		r5 = c1.promediar(10,8,9);

		System.out.println("Resultado de suma: " + r1);
		System.out.println("Resultado de resta: " + r2);
		System.out.println("Resultado de multiplicación: " + r3); 
		System.out.println("Resultado de divir: " + r4);
		System.out.printf("Resultado de promediar: %.2f%n" , r5);// %.2f%n sirve para la cantidad de decimales
																 //Y se debe de escribir con printf <--
		
		Calculadora m1 = new Calculadora();
		
		m1.mostrarResultado();
		
	}

	
	
}
