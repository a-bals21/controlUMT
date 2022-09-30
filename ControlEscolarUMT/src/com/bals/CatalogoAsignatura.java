package com.bals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase lee informacion relacionada con las asignaturas en el semestre.
 * @autor Kevin Camelo, Erika Aguilar
 * 
 */
public class CatalogoAsignatura {
	
	//ATRIBUTOS
    private Scanner scanner = new Scanner(System.in);

    //METODOS
    public String solicitarNombre() {
        System.out.print("Escribe el nombre de la asignatura: ");
        return scanner.nextLine();
    }

    public String solicitarClave() {
        scanner.nextLine();
    	System.out.print("Escribe la clave de la asignatura: ");
    	return scanner.nextLine();
    }
    
    public Integer solicitarSemestre() {
        System.out.print("Escribe el semestre al que pertenece: ");
        return scanner.nextInt();
    }
    
    public Integer solicitarCredito() {
        System.out.print("Escribe los creditos que vale la asignatura: ");
        return scanner.nextInt();
    }
    
    public void readAsignatura(Asignatura asignatura) {
        System.out.print("\n\tASIGNATURA\n");
        System.out.println(asignatura);
    }
    
    public void readAsignatura() {
    	System.out.println("\n\tNo existe esa asignatura\n");
    }
    
    public void readTAsignatura(ArrayList<Asignatura> asignaturas){
        System.out.print("\n\tLISTA DE ASIGNATURAS\n");
        asignaturas.forEach(System.out::println);
        System.out.println("\n");
    }
    
    public Integer menu(){
        System.out.print("\n\tMENÚ ASIGNATURA\n");
        System.out.println("1. Agregar Asignatura");
        System.out.println("2. Borrar Asignatura");
        System.out.println("3. Actualizar Asignatura");
        System.out.println("4. Desplegar Lista");
        System.out.println("5. Desplegar Asignatura");
        System.out.println("6. Salir");
        System.out.print("\topcion: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }

    public Integer menuModificarAsignatura(){
        System.out.print("\n\tMenú Modificación\n");
        System.out.println("1. Nombre de la Asignatura");
        System.out.println("2. Semestre de la Asignatura");
        System.out.println("3. Creditos de la asignatura");
        System.out.println("4. Salir");
        System.out.print("\topcion: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }
    
    public void imprimeInfoBorrada(boolean e) {
    	if(e) {
    		msgBaja();
    	}else {
    		msgNoRegistro();
    	}
    }

    public void msgActualizado() {
        System.out.print("\n\t¡Actualización EXITOSA!\n");
    }
    
    public void msgBaja() {
    	System.out.println("\n\t¡Borrado EXITOSO!\n");
    }

    public void msgNoRegistro(){
    	System.out.println("\n\tNo existe esa Asignatura...\n");
    }

    public void msgNoRegistros() {
        System.out.println("\n\tSin asignaturas aún...\n");
    }

    public void msgError() {
    	System.out.println("\n\t¡Ha ocurrido un error!\n");
    }

    public void msgVuelvaPronto() {
    	System.out.println("\n\tSaliendo del menu Asignatura...");
    }
}
