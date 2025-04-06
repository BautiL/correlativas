package org.example;

import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Alumno {
    private List<Materia> materiasAprobadas;

    public boolean puedeAnotarse(Materia materia) {
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}