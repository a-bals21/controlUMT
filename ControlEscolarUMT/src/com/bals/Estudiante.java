package com.bals;

import java.util.ArrayList;

/**
* Esta clase abstrae los posible datos de un estudiante necesarios para un control de ellos
* @author Angel Balderas
* @version 0.0.1
* 
*/
public class Estudiante {
	
    //ATRIBUTOS
    private Integer matricula;  //Matricula del estudiante
    private String nombre;		//Nombre del estudiante
    private Integer edad;		//Edad del estudiante
    private Integer semestre;	//Semestre del estudiante
    private String facultad;	//Facultad del estudiante
    private Double promedio;	//Promedio general del estudiante
    private ArrayList<Asignatura> asigList;  //Asignaturas que el estudiante posee

    //CONSTRUCTOR
    public Estudiante() {
        setMatricula(0);
        setNombre("NULL");
        setEdad(0);
        setSemestre(0);
        setFacultad("NULL");
        setPromedio(0d);
    }

    public Estudiante(
    		Integer matricula, String nombre, 
    		Integer edad, Integer semestre, 
    		String facultad, Double promedio
    		) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.facultad = facultad;
        this.promedio = promedio;
    }

    //MÉTODOS

    /**
     * Devuelve la matricula del estudiante
     * @return matricula
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * Coloca la matricula del estudiante
     * @param matricula
     */
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    
    public void setAsignatura(ArrayList<Asignatura> asigList) {
    	this.asigList = asigList;
    }
    
    public ArrayList<Asignatura> getAsignaturas() {
    	return asigList;
    }

    @Override
    public String toString() {
        return "\nEstudiante{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", facultad='" + facultad + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
