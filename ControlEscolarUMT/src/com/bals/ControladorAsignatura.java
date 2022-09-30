package com.bals;

import java.util.ArrayList;

/**
 * La clase catologo ControladorAsignatura se encarga de la vista
 * @autor Erika Itza
 */
public class ControladorAsignatura {
    private ArrayList<Asignatura> estList;
    private CatalogoAsignatura vista;
    private Asignatura obj1;

    public ControladorAsignatura(CatalogoAsignatura vista) {
        this.estList = new ArrayList<Asignatura>();
        this.vista = vista;
    }

    public void addAsignatura() {
        obj1 = new Asignatura(
                vista.solicitarClave(),
                vista.solicitarNombre(),
                vista.solicitarCredito(),
                vista.solicitarSemestre()
        );
        estList.add(obj1);
    }

    public void menuAsignatura() {
        int opcion = 0;
        String aux;
        while (opcion != 6) {
            switch (vista.menu()) {
                case 1: 												//Añadir Asignatura
                    addAsignatura();
                    break;
                case 2: 												//Borrar Asignatura
                    aux = vista.solicitarClave();
                    vista.imprimeInfoBorrada(borrarAsignatura(aux));
                    break;
                case 3: 												//Actualizar Asginatura
                    aux = vista.solicitarClave();
                    actualizarAsignatura(aux);
                    break;
                case 4: 												//Mostrar todas las asignaturas
                    vista.readTAsignatura(estList);
                    break;
                case 5: 												//Mostrar una asignatura
                    aux = vista.solicitarClave();
                    readAsignatura(aux);
                    break;
                case 6: 												//Salir del menú
                    vista.msgVuelvaPronto();
                    opcion = 6;
                    break;
            }
        } //fin while
    }

    private Integer buscar(String clave) {
        for (int i = 0; i < estList.size(); i++) {
            if (clave.equals(estList.get(i).getClave())) {
                return i;
            }
        }
        return -1; //No existe el registro
    }

    private boolean borrarAsignatura(String clave) {
        Integer indiceAsignatura = buscar(clave);
        if (indiceAsignatura != -1) {
            estList.remove((int)indiceAsignatura);
            return true;
        } else {
            return false;
        }
    }

    private void actualizarAsignatura(String clave) {
        Integer indiceAsignatura = buscar(clave);
        int opcion = 0;
        if (indiceAsignatura != -1) {
            while (opcion == 0) {
                readAsignatura(clave);
                switch (vista.menuModificarAsignatura()) {
                    case 1: //Modificar Nombre de la asignatura
                        estList.get(indiceAsignatura).setNombre(vista.solicitarNombre());
                        vista.msgActualizado();
                        break;
                    case 2: //Modificar semestre
                        estList.get(indiceAsignatura).setSemestre(vista.solicitarSemestre());
                        vista.msgActualizado();
                        break;
                    case 3: //Modificar creditos
                        estList.get(indiceAsignatura).setCredito(vista.solicitarCredito());
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

    private void readAsignatura(String clave) {
        Integer indiceAsignatura = buscar(clave);
        if (indiceAsignatura != -1) {
            vista.readAsignatura(estList.get(indiceAsignatura));
        } else {
            vista.readAsignatura();
        }
    }
} //fin de la Clase
