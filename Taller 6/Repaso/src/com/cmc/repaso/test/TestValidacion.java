package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		
		Validacion v1 = new Validacion();
		
		System.out.println("Monto: "+ v1.validarMonto(14));
		System.out.println("Monto: "+ v1.validarMonto(8));
		System.out.println("Monto: "+ v1.validarMonto(0));
		System.out.println("Monto: "+ v1.validarMonto(-2));
		

	}

}
