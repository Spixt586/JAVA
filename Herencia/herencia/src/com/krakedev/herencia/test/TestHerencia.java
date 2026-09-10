package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		
		Hija hija = new Hija(4,5,6);
		hija.setVirtudes(5);
		hija.setDefectos(2);
		hija.setJuguetes(6);
		
		hija.imprimir();
	}

}
