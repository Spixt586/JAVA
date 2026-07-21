package com.krakedevrestaurante;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1;
		
		rest1 = new Restaurante();
		
		System.out.println("=====================Restaurante 1: Creado=====================");
		
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion" + rest1.direccion);
		System.out.println("Calificación" + rest1.calificacion);
		
		System.out.println("=====================Restaurante 1: Valores asignados=====================");
		
		rest1.nombre = "McDonal's";
		rest1.direccion = "La Carolina";
		rest1.calificacion = 4.5f; //Recordatorio = Java trata a los decimales como double, 
								   //por defecto, lo correcto sería escribir una f al final. 
								   //Si me quiero evitar poner la f, debo de asignar el valor
								   //como un double y no como un float
		
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificación: " + rest1.calificacion);
		
		System.out.println("=====================Restaurante 2: Creado=====================");
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);
		
		System.out.println("=====================Restaurante 2: Valores asignados=====================");
		
		rest2.nombre = "KFC";
		rest2.direccion = "El Ejido";
		rest2.calificacion = 3.2f;
		
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);
		
	}

}
