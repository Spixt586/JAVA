package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
	public double nota;
	public String resultado;
	public double asistencia;
	
	public Estudiante(String nombre, double asistencia) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota, double asistencia) {
		this.nota = nota;
		this.asistencia = asistencia;
		
		if (nota < 8) {
			this.resultado = "F";
		} else if (nota >= 8) {
			this.resultado = "A";
		}
		
		if(nota >= 8 && asistencia >= 80) {
			this.resultado = "A";
		}else if(nota >= 8 && asistencia < 80) {
			this.resultado = "X";
		}else if(nota < 8) {
			this.resultado = "F";
		}
	}
	
}
