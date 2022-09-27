package com.bals;

import M.q.S;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * clase definida para leer el nombre de las asignaturas, los creditos que vale y el semestre permitido
 */
public class CatalogoAsignatura {

    private Scanner scanner = new Scanner(System.in);

    public String SolicitarNombre(){
        System.out.println("Escribe el nombre de la asignatura: ");
        return scanner.nextLine();
    }

    public Integer SolocitarSemestre(){
        System.out.println("Escribe la asignatura a la que pertenece");
        return scanner.nextInt();
    }

    public Integer SolictarCreditos(){
        System.out.println("Escribe los creditos que vale la asignatura");
        return scanner.nextInt();
    }
    public void ReadAsignaturas (Asignatura asignatura){
        System.out.println("\n\tAsignatura");
        System.out.println(asignatura);
    }
    public void readAsignatura(){System.out.println("\n\tNo existe materia conocida\n");}

    public void readTAsignatura(ArrayList<Asignatura> asignaturas){
        System.out.println("\n\tLista de asignaturas");
        asignaturas.forEach(System.out::print);
        System.out.println("\n");
    }
    public Integer menu(){
        System.out.println("\n\tMENÚ MODIFICACIÓN\n");
        System.out.println("1.- agregar asignatura");
        System.out.println("2.- borrar asignatura");
        System.out.println("3.- actualizar la asignatura");
        System.out.println("4.- salir");
        System.out.println("\topcion: ");
        Integer opcion = scanner.nextInt();
        System.out.println("\n");
        return opcion;
    }

    public Integer menuModificarAsi(){
        System.out.println("\n\tMenú Modificación\n");
        System.out.println("1.- Nombre de la asignatura");
        System.out.println("2.- Semestre de la asignatura");
        System.out.println("3.- creditos que vale la asignatura");
        System.out.println("\topcion: ");
        Integer opcion = scanner.nextInt();
        System.out.println("\n");
        return opcion;
    }
}
