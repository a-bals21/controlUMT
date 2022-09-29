package com.bals;

public class ControladorPrincipal {
	
	//ATRIBUTOS
	CatalogoPrincipal vista;
    ControladorEstudiante vistaEstudiante;
	ControladorProfesor vistaProfesor;
	ControladorAsignatura vistaAsignatura;
	
	//CONTRUCTOR
	ControladorPrincipal (
			CatalogoPrincipal vistaPrincipal,
			CatalogoEstudiante vistaEstudiante, 
			CatalogoProfesor vistaProfesor,
			CatalogoAsignatura vistaAsignatura
			) {
		this.vista = vistaPrincipal;
		this.vistaEstudiante = new ControladorEstudiante(vistaEstudiante);
		this.vistaProfesor = new ControladorProfesor(vistaProfesor);
		this.vistaAsignatura = new ControladorAsignatura(vistaAsignatura);
		vistaPrincipal.msgVersion();
	}
	
	//METODOS
	public void menuPrincipal() {
		int opcion = 0;
        while (opcion != 6) {
            switch (vista.menu()) {
                case 1: 
                	vistaEstudiante.menuEstudiante();
                	break;
                case 2: 
                    vistaProfesor.menuProfesor();
                    break;
                case 3: 
                	vistaAsignatura.menuAsignatura();
                	break;
                case 4: 
                	vista.msgVuelvaPronto();
                	 opcion = 6;
                	break;
            }
        }
	}
}
