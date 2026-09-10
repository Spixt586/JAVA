package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		System.out.println(" ===========Resultado del estudiante 1=========== ");
		
		Estudiante e1 = new Estudiante("Agustin", 85);
		
		e1.calificar(9, 85);
		
		System.out.println("Nombre: "+e1.nombre);
		System.out.println("Nota: " + e1.nota);
		System.out.println("Asistencia: " + e1.asistencia);
		System.out.println("Resultado: " + e1.resultado);
		
		System.out.println(" ===========Resultado del estudiante 2=========== ");
		
		Estudiante e2 = new Estudiante("Maria", 70);
		
		e2.calificar(9, 70);
		
		System.out.println("Nombre: "+e2.nombre);
		System.out.println("Nota: " + e2.nota);
		System.out.println("Asistencia: " + e2.asistencia);
		System.out.println("Resultado: " + e2.resultado);
		
System.out.println(" ===========Resultado del estudiante 3=========== ");
		
		Estudiante e3 = new Estudiante("Jose", 95);
		
		e3.calificar(5, 95);
		
		System.out.println("Nombre: "+e3.nombre);
		System.out.println("Nota: " + e3.nota);
		System.out.println("Asistencia: " + e3.asistencia);
		System.out.println("Resultado: " + e3.resultado);
		
	}

}
