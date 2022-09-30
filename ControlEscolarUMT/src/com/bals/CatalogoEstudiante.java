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
        System.out.print("Escribe la matricula del estudiante: ");
        return scanner.nextInt();
    }

    public String solicitarNombre() {
    	scanner.nextLine();
        //scanner.useDelimiter("\n");
        System.out.print("Escribe nombre del estudiante: ");
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
        System.out.print("\n\tESTUDIANTE\n");
        System.out.println(estudiante);
    }
    
    public void readEstudiante() {
        System.out.println("\n\tNo se encontró el registro");
    }
    
    public void readTEstudiantes(ArrayList<Estudiante> estudiantes) {
        System.out.print("\n\tLISTA DE ESTUDIANTES\n");
        estudiantes.forEach(System.out::println);
        System.out.print("\n");
    }
    
    public Integer asignaturasDisponibles(ArrayList<Asignatura> asignaturas) {
    	int opcion = 0;
    	
    	System.out.println("\n\tLISTA DE ASIGNATURAS (Disponibles por semestre)\n\tOpcion\t\tAsignatura");
        for (int i = 0; i<asignaturas.size(); i++) {
        	System.out.println("\t"+ (i+1) + ".\t\t\t"+asignaturas.get(i).toString());
        }
        
        System.out.print("\tNo. de Opción: ");
        opcion = scanner.nextInt();
        System.out.print("\n");
        if (opcion <= 0 || opcion > asignaturas.size()) {
        	System.out.println("\tOpcion fuera de rango");
        	opcion = -1;
        }
        
		return opcion - 1;
    }
    
    public void asignaturasCargadas(ArrayList<Asignatura> asignaturas) {
    	System.out.print("\n\tLISTA DE ASIGNATURAS DE ESTUDIANTE\n");
        asignaturas.forEach(System.out::println);
        System.out.print("\n");
    }

    public Integer menu() {
        System.out.print("\n\tMENÚ ESTUDIANTE\n");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Borrar Estudiante");
        System.out.println("3. Actualizar Estudiante");
        System.out.println("4. Desplegar Lista");
        System.out.println("5. Desplegar Estudiante");
        System.out.println("6. Cargar Asignaturas");
        System.out.println("7. Salir");
        System.out.print("\tOpción: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }

    public Integer menuModificarEstudiante() {
        System.out.print("\n\tMenú Modificación\n");
        System.out.println("1. Nombre Estudiante");
        System.out.println("2. Edad Estudiante");
        System.out.println("3. Promedio Estudiante");
        System.out.println("4. Salir");
        System.out.print("\tOpción: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
    }
    
    /**
     * Menú dirigido al estudiante
     * @return Integer
     */
    public Integer menuCargaAsignaturas() {
    	System.out.println("\n\tMENÚ DE ASIGNATURAS DE ESTUDIANTE");
    	System.out.println("1. Cargar Asignatura");
    	System.out.println("2. Mostrar Asignaturas cargadas");
    	System.out.println("3. Eliminar Asignatura");
    	System.out.println("4. Salir");
    	System.out.print("\topcion: ");
    	Integer opcion = scanner.nextInt();
    	return opcion;
    }

    public void imprimeInfoBorrado(boolean e) {
        if (e) {
            msgBaja();
        } else {
            msgNoRegistro();
        }
    }

    public void msgCreditosEstudiante(int creditos) {
        System.out.println("\tCreditos del estudiante: "+creditos);
    }

    public void msgActualizado() {
    	System.out.print("\n\t¡Actualización EXITOSA!\n");
    }
    
    public void msgAsignaturaRepe() {
    	System.out.println("\t¡Asignatura repetida, ya se encuentra cargada al estudiante!");
    }
    
    public void msgCreditosExcedidos() {
    	System.out.println("\t¡No puedes cargar la asignatura, creditos excedidos!");
    }
    
    public void msgCargaExitosa() {
    	System.out.println("\t¡Asignatura agregada exitosamente!");
    }
    
    public void msgAsignaturaElim() {
    	System.out.println("\t¡Asignatura eliminada del cardex!");
    }

    public void msgBaja() {
        System.out.print("\n\t¡Baja EXITOSA!\n");
    }

    public void msgNoRegistro() {
        System.out.print("\n\tNO existe Estudiante\n");
    }
    
    public void msgSinAsignaturas() {
    	System.out.print("\n\tSin Asignaturas aún...\n");
    }

    public void msgError() {
        System.out.print("\n\tHa ocurrido un error\n");
    }

    public void msgVuelvaPronto() {
        System.out.print("\n\tSaliendo del MENÚ ESTUDIANTE...\n");
    }
    
    public void msgSaliendoSubMenu() {
        System.out.print("\n\tSaliendo deL MENÚ ASIGNATURAS DE ESTUDIANTE...\n");
    }
}//Fin de clase
