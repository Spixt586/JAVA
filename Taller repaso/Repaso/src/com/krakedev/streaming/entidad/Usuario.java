package com.krakedev.streaming.entidad;

public class Usuario {
	private String nombre;	
	private int dispositivosActivos;
	private String paisOrigen;
	private Plan plan;

	public Usuario(String nombre, int dispositivosAtivos, String paisOrigen, Plan plan) {
		//super();
		this.nombre = nombre;
		this.dispositivosActivos = dispositivosAtivos;
		this.paisOrigen = paisOrigen;
		this.plan = plan;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDispositivosActivos() {
		return dispositivosActivos;
	}

	public void setDispositivosActivos(int dispositivosActivos) {
		this.dispositivosActivos = dispositivosActivos;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	public double calcularFacturaMensual() {
		double totalFactura = plan.getCostoBase();
		if(dispositivosActivos > plan.getLimiteDispositivos()) {
			int dispositivosExedidos = dispositivosActivos - plan.getLimiteDispositivos();
			double multa = dispositivosExedidos * 3;
			totalFactura += multa;
		}
		if(paisOrigen.equals("Ecuador")) {
			totalFactura = totalFactura * 1.12;
		}else if(paisOrigen.equals("Estados Unidos")) {
			totalFactura += 5;
		}
		if(plan.getNombre().toUpperCase().equals("PREMIUM") && dispositivosActivos >= 2) {
			totalFactura = totalFactura * 0.9;
		}
		return totalFactura;
	}
}
