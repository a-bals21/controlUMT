package com.bals;

/**
* Esta clase abstrae los posible datos de una asignatura necesarios para un control de ellos
* @author Angel Balderas
* @version 0.0.1
*/
public class Asignatura {
	
	//ATRIBUTOS
	private String nombre;
	private Integer semestre;
	private Integer credito;
	//posible promedio en asignatura
	
	//CONTRUCTORES
	Asignatura() {
		setNombre("NULL");
		setSemestre(0);
		setCredito(0);
	}
	
	Asignatura (
			String nombre,
			Integer semestre,
			Integer credito
			) {
		this.nombre = nombre;
		this.semestre = semestre;
		this.credito = credito;
	}
	
	//SETTERS AND GETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}
	

}
