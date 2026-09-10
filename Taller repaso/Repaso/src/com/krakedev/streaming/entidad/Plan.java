package com.krakedev.streaming.entidad;

public class Plan {
	private String nombre;
	private double costoBase;
	private int limiteDispositivos;
	
	public Plan(String nombre, double costoBase, int limiteDispositivos) {
		this.nombre = nombre;
		this.costoBase = costoBase;
		this.limiteDispositivos = limiteDispositivos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCostoBase() {
		return costoBase;
	}
	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}
	public int getLimiteDispositivos() {
		return limiteDispositivos;
	}
	public void setLimiteDispositivos(int limiteDispositivos) {
		this.limiteDispositivos = limiteDispositivos;
	}
	
	
}
