package com.krakedev.herencia.test;
import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Hija> listaHijas = new ArrayList<Hija>();
		
		Hija hija1 = new Hija(2,3, "Valeria");
		
		
		listaHijas.add(hija1);
		
		Hija hija2 = new Hija(5,8, "Susana");
		
		
		listaHijas.add(hija2);
		
		Hija hija3 = new Hija(4,6, "Belen");
		
		listaHijas.add(hija1);
		listaHijas.add(hija2);
		listaHijas.add(hija3);
		
		System.out.println(listaHijas);

	}

}
