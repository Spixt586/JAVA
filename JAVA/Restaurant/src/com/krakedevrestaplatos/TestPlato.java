package com.krakedevrestaplatos;

public class TestPlato {

	public static void main(String[] args) {
		
		System.out.println("=====================Plato A: Creado=====================");

		Plato platoA = new Plato();

		System.out.println("Nombre del platillo" + platoA.nombre);
		System.out.println("Tipo de plato" + platoA.tipo);
		System.out.println("Precio" + platoA.precio);
		System.out.println("Disponible" + platoA.disponible);

		System.out.println("=====================Plato A: Modificado=====================");

		platoA.nombre = "Arroz Marinero";
		platoA.tipo = "Plato Fuerte";
		platoA.precio = 8.50f;
		platoA.disponible = true;
		
		System.out.println("Nombre del platillo" + platoA.nombre);
		System.out.println("Tipo de plato" + platoA.tipo);
		System.out.println("Precio" + platoA.precio);
		System.out.println("Disponible" + platoA.disponible);

		System.out.println("=====================Plato B: Creado=====================");

		Plato platoB = new Plato();

		System.out.println("Nombre del platillo" + platoB.nombre);
		System.out.println("Tipo de plato" + platoB.tipo);
		System.out.println("Precio" + platoB.precio);
		System.out.println("Disponible" + platoB.disponible);

		System.out.println("=====================Plato B: Modificado=====================");

		platoB.nombre = "Ceviche";
		platoB.tipo = "Entrada";
		platoB.precio = 3.25f;
		platoB.disponible = true;
		
		System.out.println("Nombre del platillo" + platoB.nombre);
		System.out.println("Tipo de plato" + platoB.tipo);
		System.out.println("Precio" + platoB.precio);
		System.out.println("Disponible" + platoB.disponible);

		System.out.println("=====================Plato C: Creado=====================");

		Plato platoC = new Plato();

		System.out.println("Nombre del platillo" + platoC.nombre);
		System.out.println("Tipo de plato" + platoC.tipo);
		System.out.println("Precio" + platoC.precio);
		System.out.println("Disponible" + platoC.disponible);

		System.out.println("=====================Plato C: Modificado=====================");

		platoC.nombre = "Flan";
		platoC.tipo = "Postre";
		platoC.precio = 2.50f;
		platoC.disponible = false;
		
		System.out.println("Nombre del platillo" + platoC.nombre);
		System.out.println("Tipo de plato" + platoC.tipo);
		System.out.println("Precio" + platoC.precio);
		System.out.println("Disponible" + platoC.disponible);

	}

}
