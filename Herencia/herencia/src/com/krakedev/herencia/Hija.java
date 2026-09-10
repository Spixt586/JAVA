package com.krakedev.herencia;

public class Hija extends Padre {

	public Hija(int defectos, int virtudes, String nombre) {
		super(defectos, virtudes, nombre);
	}

	public void escucharEdMaverick() {
		System.out.println("Escuchando esta música hermosa");
	}

	@Override
	public String toString() {
		return "Defecto: " + getDefectos() + ". Virtudes: " + getVirtudes() + ". Total Ahorrado: " + getTotalAhorrado();
	}
}