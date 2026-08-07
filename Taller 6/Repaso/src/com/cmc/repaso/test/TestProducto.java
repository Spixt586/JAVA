package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		System.out.println("=========================PRODUCTO 1=========================");
		
		Producto p1 = new Producto("CACAO", 1.20);
		
		p1.setPrecio(1.20);
		
		System.out.println("Nombre: " + p1.nombre);
		System.out.println("Precio: " + p1.precio);
		System.out.println("Precio de promoción: " + p1.calcularPrecioPromo(20));
		
		System.out.println("=========================PRODUCTO 2=========================");
		
		Producto p2 = new Producto("BANANO", 0.50);
		
		p2.setPrecio(0.50);
		
		
		System.out.println("Nombre: " + p2.nombre);
		System.out.println("Precio: " + p2.precio);
		System.out.println("Precio de promoción: " + p2.calcularPrecioPromo(50));
	}

}
