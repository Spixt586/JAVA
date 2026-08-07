package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item i1 = new Item();
		
		i1.nombre = "Rufles";
		i1.productosActuales = 20;
		i1.productosDevueltos = 0;
		i1.productosVendidos = 0;
		System.out.println("--- Valores iniciales PRODUCTO 1---");
		i1.imprimir();
		System.out.println("\n--- Después de vender 5 ---");
		i1.vender(5);
		
		i1.imprimir();
		System.out.println("\n--- Después de devolver 2 ---");
		i1.devolver(2);
		
		i1.imprimir();
		
		Item i2 = new Item();
		
		i2.nombre = "Pafritas";
		i2.productosActuales = 500;
		i2.productosDevueltos = 0;
		i2.productosVendidos = 0;
		System.out.println("--- Valores iniciales PRODUCTO 2 ---");
		i2.imprimir();
		System.out.println("\n--- Después de vender 352 ---");
		i2.vender(352);
		
		i2.imprimir();
		System.out.println("\n--- Después de devolver 168 ---");
		i2.devolver(168);
		
		i2.imprimir();
	}

}
