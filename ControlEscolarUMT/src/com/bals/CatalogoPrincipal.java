package com.bals;

import java.util.Scanner;
/**
 * La clase CatalogoPrincipal, se encarga de la parte de salida de consola 
 * de las operaciones que podemos hacer con el programa entero
 * @version 0.1.1, 24/09/22
 * @author Angel Balderas
 *
 */
public class CatalogoPrincipal {
	
	//ATRIBUTOS
	Scanner scanner = new Scanner(System.in);
	
	//METODOS
	public Integer menu() {
		System.out.print("\n\tMENU PRINCIPAL\n");
        System.out.println("1. Estudiante");
        System.out.println("2. Prodesor");
        System.out.println("3. Asignatura");
        System.out.println("4. Salir");
        System.out.print("\tOpción: ");
        Integer opcion = scanner.nextInt();
        System.out.print("\n");
        return opcion;
	}
	
	public void msgVuelvaPronto() {
        System.out.print("\n\tGracias por utilizar el sistema...");
    }

    public void msgVersion() {
        System.out.println("\n\tControl Escolar v0.2.1");
    }
}
