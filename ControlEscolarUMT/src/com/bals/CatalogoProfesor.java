package com.bals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase CatalogoProfesor se encarga de las salidas de consola que tiene las operaciones de Profesor
 * @version 0.1.1, 24/09/22
 * @author Angel Balderas
 *
 */
public class CatalogoProfesor {
	
	//ATRIBUTOS
    private Scanner scanner = new Scanner(System.in);

    //MÉTODOS
    public Integer solicitarClave() {
        System.out.print("Escribe la clave del profesor: ");
        return scanner.nextInt();
    }

    public String solicitarNombre() {
    	scanner.nextLine();
        System.out.print("Escribe nombre del profesor: ");
        return scanner.nextLine();
    }

    public Integer solicitarEdad() {
        System.out.print("Escribir edad: ");
        return scanner.nextInt();
    }

    public String solicitarRfc() {
        System.out.print("Escribe RFC: ");
        return scanner.next();
    }
    
    public String solicitarTelefono() {
        System.out.print("Escribir telefono: ");
        return scanner.next();
    }

    public void readProfesor(Profesor profesor) {
        System.out.print("\n\tPROFESOR\n");
        System.out.println(profesor);
    }
    
    public void readProfesor() {
        System.out.print("\n\tNo se encontró el registro\n");
    }
    
    public void readTProfesor(ArrayList<Profesor> profesores) {
        System.out.print("\n\tLISTA DE PROFESORES\n");
        profesores.forEach(System.out::print);
        System.out.print("\n");
    }

    public Integer menu() {
        System.out.print("\n\tMENÚ PROFESOR\n");
        System.out.println("1. Agregar Profesor");
        System.out.println("2. Borrar Profesor");
        System.out.println("3. Actualizar Profesor");
        System.out.println("4. Desplegar Lista");
        System.out.println("5. Desplegar Profesor");
        System.out.println("6. Salir");
        System.out.print("\tOpción: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }

    public Integer menuModificarProfesor() {
        System.out.print("\n\tMenú Modificación\n");
        System.out.println("1. Nombre Profesor");
        System.out.println("2. Edad Profesor");
        System.out.println("3. Teléfono Profesor");
        System.out.println("4. Salir");
        System.out.print("\tOpción: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }

    public void imprimeInfoBorrado(boolean e) {
        if (e) {
            msgBaja();
        } else {
            msgNoRegistro();
        }
    }
    
    public void msgActualizado() {
    	System.out.print("\n\t¡Actualización EXITOSA!\n");
    }

    public void msgBaja() {
        System.out.print("\n\t¡Baja EXITOSA!\n");
    }

    public void msgNoRegistro() {
        System.out.print("\n\tNo se encuentra el elemento...\n");
    }

    public void msgError() {
        System.out.print("\n\tHa ocurrido un error\n");
    }

    public void msgVuelvaPronto() {
        System.out.print("\n\tSaliendo de MENÚ PROFESOR...\n");
    }
}
