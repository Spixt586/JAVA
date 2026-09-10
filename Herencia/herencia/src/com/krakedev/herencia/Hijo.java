package com.krakedev.herencia;

public class Hijo extends Padre {

	private int juguetes;

	public Hijo(int virtudes, int defectos, int juguetes, String nombre) {
		super(defectos, virtudes, nombre);
		this.juguetes = juguetes;
	}

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}

	@Override
	public String toString() {
		return "Defecto: " + getDefectos() + ". Virtudes: " + getVirtudes() + ". Juguetes: " + juguetes + ". Total Ahorrado: " + getTotalAhorrado();
	}
	
	public void ahorrar(double monto) {
		super.ahorrar(monto*0.5);
	}
}