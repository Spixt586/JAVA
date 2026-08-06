package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(1726452362, "Cereales");
		p1.setDescripcion("Cereales de Chocolate");
		p1.setPeso(200);
		
		System.out.println("=== INFORMACIÓN DEl PRODUCTO ===");
		System.out.println("╔══════════════════════════════╗");
		System.out.println(">> CÓDIGO.......: " + p1.getCodigo());
		System.out.println(">> NOMBRE.....: " + p1.getNombre());
		System.out.println(">> DESCRIPSIÓN....: " + p1.getDescripcion());
		System.out.println(">> PESO....: " + p1.getPeso() + " gr");
		System.out.println("╚══════════════════════════════╝");
		
		Producto p2 = new Producto(1723836272, "Ensalada de frutas");
		p2.setDescripcion("Ensalada de frutas 2");
		p2.setPeso(250);
		
		
		System.out.println("=== INFORMACIÓN DEl PRODUCTO ===");
		System.out.println("╔══════════════════════════════╗");
		System.out.println(">> CÓDIGO.......: " + p2.getCodigo());
		System.out.println(">> NOMBRE.....: " + p2.getNombre());
		System.out.println(">> DESCRIPSIÓN....: " + p2.getDescripcion());
		System.out.println(">> PESO....: " + p2.getPeso() + " gr");
		System.out.println("╚══════════════════════════════╝");
	}

}
