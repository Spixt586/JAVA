package com.krake.dev.controlflujo;

public class Validador {

	public void validarEdad(int edad){
	
		if(edad >= 18) {
			System.out.println("Es mayor de Edad: " + edad);
		}else if(edad >=12 && edad < 18){
			System.out.println("Es un adolecente: " + edad);
		}else if(edad > 0 && edad < 12) {
			System.out.println("Es un infante: " + edad);
		}else {
			System.out.println("Edad Incorrecta: " + edad);
		}
		
	}
}
