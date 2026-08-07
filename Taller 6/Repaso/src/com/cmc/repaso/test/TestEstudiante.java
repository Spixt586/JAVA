package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		System.out.println(" ===========Resultado del estudiante 1=========== ");
		
		Estudiante e1 = new Estudiante("Agustin");
		
		e1.calificar(8);
		
		System.out.println("Nombre: "+e1.nombre);
		System.out.println("Nota: " + e1.nota);
		System.out.println("Resultado: " + e1.resultado);
		
		System.out.println(" ===========Resultado del estudiante 2=========== ");
		
		Estudiante e2 = new Estudiante("Maria");
		
		e2.calificar(5);
		
		System.out.println("Nombre: "+e2.nombre);
		System.out.println("Nota: " + e2.nota);
		System.out.println("Resultado: " + e2.resultado);
		
	}

}
