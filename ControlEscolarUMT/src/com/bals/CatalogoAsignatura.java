package com.bals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase lee informacion relacionada con las asignaturas en el semestre.
 * @autor kevin leandro camelo suaste,
 * 
 */
public class CatalogoAsignatura {
	
	//atributos
    private Scanner scanner = new Scanner(System.in);

    //metodos
    public String SolicitarAsignatura(){
        System.out.println("Escribe el nombre de la asignatura: ");
        return scanner.nextLine();
    }

    public String SolicitarClave() {
    	System.out.println("Escribe la clave de la materia");
    	return scanner.nextLine();
    }
    
    public Integer SolicitarSemestre(){
        System.out.println("Escribe la asignatura a la que pertenece");
        return scanner.nextInt();
    }
    
    public Integer SolicitarCreditos(){
        System.out.println("Escribe los creditos que vale la asignatura");
        return scanner.nextInt();
    }
    
    public void ReadAsignaturas (Asignatura asignatura){
        System.out.println("\n\tAsignatura");
        System.out.println(asignatura);
    }
    
    public void readAsignatura(){System.out.println("\n\tNo existe materia conocida\n");}

    //metodo
    public void readTAsignatura(ArrayList<Asignatura> asignaturas){
        System.out.println("\n\tLista de asignaturas");
        asignaturas.forEach(System.out::print);
        System.out.println("\n");
    }
    
    //metodo
    public Integer menu(){
        System.out.println("\n\tMENÚ ASIGNATURA\n");
        System.out.println("1.- agregar asignatura");
        System.out.println("2.- borrar asignatura");
        System.out.println("3.- actualizar la asignatura");
        System.out.println("4.- desplegar lista de asignaturas");
        System.out.println("5.- buscar asignaturas");
        System.out.println("6.- salir");
        System.out.println("\topcion: ");
        Integer opcion = scanner.nextInt();
        System.out.println("\n");
        return opcion;
    }

    public Integer menuModificarAsignatura(){
        System.out.println("\n\tMenú Modificación\n");
        System.out.println("1.- Nombre de la asignatura");
        System.out.println("2.- Clave de la asignatura");
        System.out.println("3.- Semestre al que pertenece la asignatura");
        System.out.println("4.- Creditos que vale la asignatura");
        System.out.println("\topcion: ");
        Integer opcion = scanner.nextInt();
        System.out.println("\n");
        return opcion;
    }
    
    /**
     * menú dirigido al estudiante
     * @return
     */
    public Integer menuCargaAcademica() {
    	System.out.println("\n\tMenú de Carga academica\n");
    	System.out.println("1.- Cargar asignatura");
    	System.out.println("2.- Mostrar asignaturas cargadas");
    	System.out.println("3.- Eliminar asignatura");
    	System.out.println("\topcion: ");
    	Integer opcion = scanner.nextInt();
    	return opcion;
    }
    
    public void imprimeInfoBorrada(boolean e) {
    	if(e) {
    		msgBaja();
    	}else {
    		msgNoRegistro();
    	}
    }
    
    
    public void msgBaja() {
    	System.out.println("\n\tborrado exitosamente\n");
    }
    public void msgNoRegistro(){
    	System.out.println("\n\tno se encuentra la asignatura\n");
    }
    public void msgError() {
    	System.out.println("\n\tHa ocurrido un error\n");
    }
    public void msgVuelvaPronto() {
    	System.out.println("\n\tSaliendo del menu Asignatura...");
    }
}
