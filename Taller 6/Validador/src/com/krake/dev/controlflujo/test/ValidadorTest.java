package com.krake.dev.controlflujo.test;

import com.krake.dev.controlflujo.Validador;

public class ValidadorTest {

	public static void main(String[] args) {
		
		Validador v1 = new Validador();
		v1.validarEdad(6);
		v1.validarEdad(17);
		v1.validarEdad(22);
		v1.validarEdad(25);
		v1.validarEdad(10);
		v1.validarEdad(-2);

	}

}
