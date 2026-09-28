package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		
		Hija hija = new Hija(4,5, "Valeria");
		hija.setVirtudes(5);
		hija.setDefectos(2);
		
		hija.imprimir();
	}

}
