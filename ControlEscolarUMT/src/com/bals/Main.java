package com.bals;

/**
 * La clase Main es la clase encargada de ejecutar el programa entero
 * Repositorio: https://github.com/a-bals21/controlUMT
 */
public class Main {

	//ATRIBUTOS
	static CatalogoPrincipal vista;
	static CatalogoEstudiante vistaEstudiante;
	static CatalogoProfesor vistaProfesor;
	static CatalogoAsignatura vistaAsignatura;
	static ControladorPrincipal programa;

    //MÉTODO PRINCIPAL
    public static void main(String[] args) {
		vista = new CatalogoPrincipal();
		vistaEstudiante = new CatalogoEstudiante();
		vistaProfesor = new CatalogoProfesor();
    	vistaAsignatura = new CatalogoAsignatura();
    	
    	programa = new ControladorPrincipal(vista, vistaEstudiante, vistaProfesor, vistaAsignatura);
    	
    	programa.menuPrincipal();
        
    }
}
