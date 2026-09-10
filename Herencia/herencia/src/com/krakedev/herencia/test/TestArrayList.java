package com.krakedev.herencia.test;
import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Hija> listaHijas = new ArrayList<Hija>();
		
		Hija hija1 = new Hija();
		
		hija1.setDefectos(2);
		hija1.setVirtudes(3);
		
		listaHijas.add(hija1);
		
		Hija hija2 = new Hija();
		
		hija2.setDefectos(5);
		hija2.setVirtudes(8);
		
		listaHijas.add(hija2);
		
		Hija hija3 = new Hija();
		
		hija3.setDefectos(4);
		hija3.setVirtudes(6);
		
		listaHijas.add(hija1);
		
		System.out.println(listaHijas);

	}

}
