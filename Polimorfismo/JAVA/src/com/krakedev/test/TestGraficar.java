package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		Graficador graf = new Graficador();
		Figura fig = new Figura("Padre", "Marrón");
		Cuadrado cua = new Cuadrado(4);
		Triangulo tri = new Triangulo(6);
		Rectangulo rect = new Rectangulo(4, 8);
		
		System.out.println(fig);
		System.out.println(cua);
		System.out.println(tri);
		System.out.println(rect);
		graf.graficar(fig);
		graf.graficar(cua);
		graf.graficar(tri);
		graf.graficar(rect);
		System.out.println("Perímetro de figura: " + fig.calcularPerimetro());
		System.out.println("Perímetro de cuadrado: " + cua.calcularPerimetro());
		System.out.println("Perímetro de triángulo: " + tri.calcularPerimetro());
		System.out.println("Perímetro de rectángulo: " + rect.calcularPerimetro());
		System.out.println("Área de figura: " + fig.calcularArea());
		System.out.println("Área de cuadrado: " + cua.calcularArea());
		System.out.println("Área de triángulo: " + tri.calcularArea());
		System.out.println("Área de rectángulo: " + rect.calcularArea());
		
	}

}
