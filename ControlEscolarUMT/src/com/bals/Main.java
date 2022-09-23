package com.bals;

public class Main {
    //MAIN
    public static void main(String[] args) {
        CatalogoEstudiante vista = new CatalogoEstudiante();
        ControladorEstudiante Estudiantes  = new ControladorEstudiante(vista);
        Estudiantes.menuEstudiante();
    }
}
