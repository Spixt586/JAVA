package com.krakedev.herencia.test;

import com.krakedev.herencia.Padre;
import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;

public class TestAhorro {

	public static void main(String[] args) {

		double monto = 5.7;

		Padre p = new Padre(6, 8, "Enrique");
		p.ahorrar(monto);
		System.out.println(p);

		Hija hija = new Hija(2, 4, "Adriana salte");
		hija.ahorrar(monto);
		System.out.println(hija);

		Hijo hijo = new Hijo(3, 1, 2, "Omar");
		hijo.ahorrar(monto);
		System.out.println(hijo);
	}
}