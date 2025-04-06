package org.example;

import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public boolean aprobada() {
        boolean resultado = true;

        for(Materia materia : materias) {
            if(!alumno.puedeAnotarse(materia)) resultado = false;
        }

        return resultado;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
