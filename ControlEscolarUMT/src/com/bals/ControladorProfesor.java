package com.bals;

import java.util.ArrayList;
/**
* La clase ControladorEstudiante se encarga de las operaciones de Profesor
* @version 0.1.1, 24/09/22
* @author Angel Balderas
*
*/
public class ControladorProfesor {
	private ArrayList<Profesor> proList;
    private CatalogoProfesor vista;
    private Profesor obj1;
    
    //CONTRUCTOR
    public ControladorProfesor(CatalogoProfesor vista){
    	this.proList = new ArrayList<Profesor>();
        this.vista = vista;
    }
    
    //METODOS
    public void addProfesor() {
        obj1 = new Profesor(
                vista.solicitarClave(),
                vista.solicitarNombre(),
                vista.solicitarEdad(),
                vista.solicitarRfc(),
                vista.solicitarTelefono());
        proList.add(obj1);
    }

    public void menuProfesor() {
        int opcion = 0;
        Integer aux;
        while (opcion != 6) {
            switch (vista.menu()) {
                case 1:												//Añadir Profesor
                	addProfesor(); 
                	break;
                case 2: 											//Borrar Profesor
                    aux = vista.solicitarClave();
                    vista.imprimeInfoBorrado(borrarProfesor(aux));
                    break;
                case 3:												//Actualizar Profesor
                	aux = vista.solicitarClave();
                    actualizarProfesor(aux);
                	break;
                case 4:												//Mostrar todos los Profesors
                	vista.readTProfesor(proList); 
                	break;
                case 5:												//Mostrar un Profesor
                	aux = vista.solicitarClave();
                	readProfesor(aux);
                	break;
                case 6:												//Salir del menú
                    vista.msgVuelvaPronto();
                	opcion = 6; 
                	break;
            }
        } //fin while
    }

    private Integer buscarProfesor(Integer clave) {
        for (int i = 0; i < proList.size(); i++) {
            if (clave.equals(proList.get(i).getClave())) {
                return i;
            }
        }
        return -1; //No existe el registro
    }

    private boolean borrarProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
            proList.remove((int)indiceProfesor);
            return true;
        } else {
            return false;
        }
    }

    private void actualizarProfesor(Integer clave) {
        Integer indiceProfesor = buscarProfesor(clave);
        int opcion = 0;
        if (indiceProfesor != -1) {
            while (opcion == 0) {
                readProfesor(clave);
                switch (vista.menuModificarProfesor()) {
                    case 1: //Modificar Nombre
                        proList.get(indiceProfesor).setNombre(vista.solicitarNombre());
                        vista.msgActualizado();
                        break;
                    case 2: //Modificar Edad
                        proList.get(indiceProfesor).setEdad(vista.solicitarEdad());
                        vista.msgActualizado();
                        break;
                    case 3: //Modificar Telefono
                        proList.get(indiceProfesor).setTelefono(vista.solicitarTelefono());
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
    
    private void readProfesor(Integer clave) {
    	Integer indiceProfesor = buscarProfesor(clave);
        if (indiceProfesor != -1) {
        	vista.readProfesor(proList.get(indiceProfesor));
        } else {
            vista.readProfesor();
        }
    }
}
