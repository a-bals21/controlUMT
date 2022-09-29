package com.bals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase CatalogoEstudiante se encarga de las salidas de consola que tiene las operaciones de Estudiante
 * @version 0.1.1, 24/09/22
 * @author Angel Balderas
 *
 */
public class CatalogoEstudiante {
	
    //ATRIBUTOS
    private Scanner scanner = new Scanner(System.in);

    //MÉTODOS
    public Integer solicitarMatricula() {
        System.out.print("Escribe la matricula del alumno: ");
        return scanner.nextInt();
    }

    public String solicitarNombre() {
    	scanner.nextLine();
        //scanner.useDelimiter("\n");
        System.out.print("Escribe nombre del alumno: ");
        return scanner.nextLine();
    }

    public Integer solicitarEdad() {
        System.out.print("Escribir edad: ");
        return scanner.nextInt();
    }

    public Integer solicitarSemestre() {
        System.out.print("Escribir semestre: ");
        return scanner.nextInt();
    }

    public String solicitarFacultad() {
        System.out.print("Escribe nombre de la facultad: ");
        return scanner.next();
    }

    public Double solicitarPromedio() {
        System.out.print("Escribe el promedio: ");
        return scanner.nextDouble();
    }

    public void readEstudiante(Estudiante estudiante) {
        System.out.print("\n\tESTUDIANTE");
        System.out.println(estudiante);
    }
    
    public void readEstudiante() {
        System.out.print("\n\tNo se encontró el registro\n");
    }
    
    public void readTEstudiantes(ArrayList<Estudiante> estudiantes) {
        System.out.print("\n\tLISTA DE ESTUDIANTES");
        estudiantes.forEach(System.out::print);
        System.out.print("\n");
    }

    public Integer menu() {
        System.out.print("\n\tMENU ESTUDIANTE\n");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Borrar Estudiante");
        System.out.println("3. Actualizar Estudiante");
        System.out.println("4. Desplegar Lista");
        System.out.println("5. Desplegar Estudiante");
        System.out.println("6. Salir");
        System.out.print("\tOpción: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }

    public Integer menuModificarEstudiante() {
        System.out.print("\n\tMenu Modificación\n");
        System.out.println("1. Nombre Estudiante");
        System.out.println("2. Edad Estudiante");
        System.out.println("3. Promedio Estudiante");
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
    	System.out.print("\n\tActualización EXITOSA\n");
    }

    public void msgBaja() {
        System.out.print("\n\tBaja exitosa\n");
    }

    public void msgNoRegistro() {
        System.out.print("\n\tNo se encuentra el elemento\n");
    }

    public void msgError() {
        System.out.print("\n\tHa ocurrido un error\n");
    }

    public void msgVuelvaPronto() {
        System.out.print("\n\tSaliendo del MENU ESTUDIANTE...\n");
    }
}//Fin de clase
