package com.bals;

/**
 * 
 * @author Angel Balderas
 * @version 0.2.1, 24/09/22
 */
public class Main {
    //MAIN
    public static void main(String[] args) {
    	CatalogoPrincipal vista = new CatalogoPrincipal();
    	CatalogoEstudiante vistaEstudiante = new CatalogoEstudiante();
    	CatalogoProfesor vistaProfesor = new CatalogoProfesor();
    	
    	ControladorPrincipal programa = new ControladorPrincipal(vista, vistaEstudiante, vistaProfesor);
    	
    	programa.menuPrincipal();
        
    }
}
