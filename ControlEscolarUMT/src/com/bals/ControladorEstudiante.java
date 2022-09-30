package com.bals;

import java.util.ArrayList;

/**
* La clase ControladorEstudiante se encarga de las operaciones de Estudiante
* @version 0.2.1, 24/09/22
* @author Angel Balderas
*
*/
public class ControladorEstudiante {
	
	//ATRIBUTOS
    private ArrayList<Estudiante> estList;
    private CatalogoEstudiante vista;
    private ControladorAsignatura controlAsignatura;
    private Estudiante obj1;

    public ControladorEstudiante(CatalogoEstudiante vista, ControladorAsignatura asignatura) {
        this.estList = new ArrayList<Estudiante>();
        this.vista = vista;
        controlAsignatura = asignatura;
    }

    public void addEstudiante() {
        obj1 = new Estudiante(
                vista.solicitarMatricula(),
                vista.solicitarNombre(),
                vista.solicitarEdad(),
                vista.solicitarSemestre(),
                vista.solicitarFacultad(),
                vista.solicitarPromedio());
        estList.add(obj1);
    }

    public void menuEstudiante() {
        int opcion = 0;
        Integer aux;
        while (opcion != 6) {
            switch (vista.menu()) {
                case 1: 												//Añadir estudiante
                	addEstudiante(); 
                	break;
                case 2: 												//Borrar estudiante
                    aux = vista.solicitarMatricula();
                    vista.imprimeInfoBorrado(borrarEstudiante(aux));
                    break;
                case 3: 												//Actualizar estudiante
                	aux = vista.solicitarMatricula();
                    actualizarEstudiante(aux);
                	break;
                case 4: 												//Mostrar todos los estudiantes
                	vista.readTEstudiantes(estList); 
                	break;
                case 5: 												//Mostrar un estudiante
                	aux = vista.solicitarMatricula();
                	readEstudiante(aux);
                	break;
                case 6:
                	aux = buscarEstudiante(vista.solicitarMatricula());	//Cargar Asignaturas
                	if (aux != -1) {
                		menuCargaAsignaturas(aux);
                	} else {
                		vista.msgNoRegistro();
                	}
                	break;
                case 7: 												//Salir del menú
                    vista.msgVuelvaPronto();
                	opcion = 6; 
                	break;
            }
        } //fin while
    }
    
    public void menuCargaAsignaturas(Integer indiceEstudiante) { 
    	int opcion = 0;
    	    	
    	while (opcion != 4) {
        	int aux = 0;
			vista.readEstudiante(estList.get(indiceEstudiante));
            vista.msgCreditosEstudiante(creditosEstudiante(indiceEstudiante));
    		switch (vista.menuCargaAsignaturas()) {
    			case 1: //Cargar Asignatura
    				
    				//Obtiene las asignaturas del alumno, por su semestre
					ArrayList<Asignatura> asignaturas = controlAsignatura.getAsignaturasXSemestre(
    						estList.get(indiceEstudiante).getSemestre()
    						);
					//muestra las asignaturas a elegir y cuida que este dentro de las opciones
    				aux = vista.asignaturasDisponibles(asignaturas);
    				
    				if (aux != -1) {
    					
    					//verifica asignatura repetida / verifica exceso de creditos 
    					if (estList.get(indiceEstudiante).getAsignaturas().contains(asignaturas.get(aux))) { 
    						vista.msgAsignaturaRepe();
    					} else if (creditosEstudiante(indiceEstudiante) + asignaturas.get(aux).getCredito() < 25) {
    						estList.get(indiceEstudiante).setAsignatura(asignaturas.get(aux));
                            vista.msgCargaExitosa();
    					} else {
    						vista.msgCreditosExcedidos();
    					}
    				}
    				break;
    			case 2: //Mostrar Asignaturas Cargadas
    				if ((estList.get(indiceEstudiante).getAsignaturas() != null) || !(estList.get(indiceEstudiante).getAsignaturas().isEmpty())) {
    					vista.asignaturasCargadas(estList.get(indiceEstudiante).getAsignaturas());
    				} else {
    					vista.msgSinAsignaturas();
    				}
    				break;
    			case 3: //Eliminar Asignatura
    				if (estList.get(indiceEstudiante).getAsignaturas() != null) {
        				aux = vista.asignaturasDisponibles(estList.get(indiceEstudiante).getAsignaturas());
        				estList.get(indiceEstudiante).removeAsignatura(aux);
        				vista.msgAsignaturaElim();
    				} else {
    					vista.msgSinAsignaturas();
    				}
    				break;
    			case 4:
    				opcion = 4;
    				
    		}
    	}
    }

    private Integer buscarEstudiante(Integer matricula) {
        for (int i = 0; i < estList.size(); i++) {
            if (matricula.equals(estList.get(i).getMatricula())) {
                return i;
            }
        }
        return -1; //No existe el registro
    }

    private boolean borrarEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
            estList.remove((int)indiceEstudiante);
            return true;
        } else {
            return false;
        }
    }
    
    private Integer creditosEstudiante(Integer indiceEstudiante) {
    	Integer suma = 0;
        if (estList.get(indiceEstudiante).getAsignaturas() != null || !(estList.get(indiceEstudiante).getAsignaturas().isEmpty())) {
            for (int i = 0; i<estList.get(indiceEstudiante).getAsignaturas().size(); i++) {
                suma += estList.get(indiceEstudiante).getAsignaturas().get(i).getCredito();
            }
        } else {
            return 0;
        }
    	
    	return suma;
    }

    private void actualizarEstudiante(Integer matricula) {
        Integer indiceEstudiante = buscarEstudiante(matricula);
        int opcion = 0;
        if (indiceEstudiante != -1) {
            while (opcion == 0) {
                readEstudiante(matricula);
                switch (vista.menuModificarEstudiante()) {
                    case 1: //Modificar Nombre
                        estList.get(indiceEstudiante).setNombre(vista.solicitarNombre());
                        vista.msgActualizado();
                        break;
                    case 2: //Modificar Edad
                        estList.get(indiceEstudiante).setEdad(vista.solicitarEdad());
                        vista.msgActualizado();
                        break;
                    case 3: //Modificar Promedio
                        estList.get(indiceEstudiante).setPromedio(vista.solicitarPromedio());
                        vista.msgActualizado();
                        break;
                    case 4:
                        opcion = 4;
                }
            }
        } else {
            vista.msgNoRegistro();
        }
    }
    
    private void readEstudiante(Integer matricula) {
    	Integer indiceEstudiante = buscarEstudiante(matricula);
        if (indiceEstudiante != -1) {
        	vista.readEstudiante(estList.get(indiceEstudiante));
        } else {
            vista.readEstudiante();
        }
    }
} //fin de la Clase
