package com.bals;

import java.util.ArrayList;

/**
* La clase ControladorEstudiante se encarga de las operaciones de Estudiante
* @version 0.1.1, 24/09/22
* @author Angel Balderas
*
*/
public class ControladorEstudiante {
	
	//ATRIBUTOS
    private ArrayList<Estudiante> estList;
    private CatalogoEstudiante vista;
    private Estudiante obj1;

    public ControladorEstudiante(CatalogoEstudiante vista) {
        this.estList = new ArrayList<Estudiante>();
        this.vista = vista;
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
                	//Mostrar Menu para asignaturas de alumno
                case 7: 												//Salir del menú
                    vista.msgVuelvaPronto();
                	opcion = 6; 
                	break;
            }
        } //fin while
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
