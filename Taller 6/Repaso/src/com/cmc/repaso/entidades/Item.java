package com.cmc.repaso.entidades;

public class Item {
	
	public String nombre;
	public int productosActuales;
	public int productosDevueltos;
	public int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("En Stock: " + productosActuales);
		System.out.println("Devueltos: " + productosDevueltos);
		System.out.println("Vendidos: " + productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;
	}
	
	public void devolver(int productosDevueltos) {
		this.productosActuales += productosDevueltos;
		this.productosVendidos -= productosDevueltos;
		this.productosDevueltos += productosDevueltos;
	}
	
}
