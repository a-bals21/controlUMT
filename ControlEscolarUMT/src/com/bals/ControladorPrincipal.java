package com.bals;

public class ControladorPrincipal {
	
	//ATRIBUTOS
	CatalogoPrincipal vista;
	CatalogoEstudiante vistaEstudiante;
    ControladorEstudiante estudiante;
	CatalogoProfesor vistaProfesor;
	ControladorProfesor profesor;
	
	//CONTRUCTOR
	ControladorPrincipal (
			CatalogoPrincipal vistaPrincipal,
			CatalogoEstudiante vistaEstudiante, 
			CatalogoProfesor vistaProfesor
			//añadir catalogo de las asignaturas
			) {
		this.vista = vistaPrincipal;
		this.vistaEstudiante = vistaEstudiante;
		this.vistaProfesor = vistaProfesor;
		this.estudiante = new ControladorEstudiante(vistaEstudiante);
		this.profesor = new ControladorProfesor(vistaProfesor);
		vistaPrincipal.msgVersion();
	}
	
	//METODOS
	public void menuPrincipal() {
		int opcion = 0;
        while (opcion != 6) {
            switch (vista.menu()) {
                case 1: 
                	estudiante.menuEstudiante();
                	break;
                case 2: 
                    profesor.menuProfesor();
                    break;
                case 3: 
                	//colocar el menu de asignaturas
                	break;
                case 4: 
                	vista.msgVuelvaPronto();
                	 opcion = 6;
                	break;
            }
        }
	}
}
