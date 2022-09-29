package com.bals;

/**
 * La clase Asignatura es la abstracción de los atributos que contiene una
 * asignatura
 *
 * @version 0.1.1, 24/09/22
 * @author Angel Balderas
 *
 */
public class Asignatura {

    //ATRIBUTOS
    private String clave;
    private String nombre;
    private Integer semestre;
    private Integer credito;
    //posible promedio en asignatura

    //CONTRUCTORES
    Asignatura() {
        setClave("NULL");
        setNombre("NULL");
        setSemestre(0);
        setCredito(0);
    }

    Asignatura(
            String clave,
            String nombre,
            Integer semestre,
            Integer credito
    ) {
        this.clave = clave;
        this.nombre = nombre;
        this.semestre = semestre;
        this.credito = credito;
    }

    //SETTERS AND GETTERS
    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
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
