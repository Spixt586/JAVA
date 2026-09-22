package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura fig = new Rectangulo(5,8);
		Cuadrado cua = new Cuadrado(4);
		Triangulo tri = new Triangulo(7);
		
		System.out.println(fig);
		System.out.println(cua);
		System.out.println(tri);
	}

}
