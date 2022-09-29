package com.bals;

import java.util.ArrayList;

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
                vista.SolicitarAsignatura(),
                vista.SolicitarSemestre(),
                vista.SolicitarCreditos());
        estList.add(obj1);
    }
}
