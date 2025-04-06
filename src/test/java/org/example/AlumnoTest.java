package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    public void alumnoNoPuedeAnotarseAF2PeroSiAPye() {
        //crear materias
        Materia am1 = new Materia();
        Materia aga = new Materia();
        Materia lyed = new Materia();
        Materia f1 = new Materia();
        Materia f2 = new Materia();
        Materia pye = new Materia();

        //crear listas de materias aprobadass y correlatividades
        List<Materia> materiasAprobadasAlumno = Arrays.asList(am1, aga, lyed);
        List<Materia> correlativasF2 = Arrays.asList(am1, f1);
        List<Materia> correlativasPye = Arrays.asList(am1, aga);

        // setear correlatividades de materias a inscribirse
        f2.setCorrelativas(correlativasF2);
        pye.setCorrelativas(correlativasPye);

        Alumno alumno = new Alumno();

        alumno.setMateriasAprobadas(materiasAprobadasAlumno);

        // comprobar que alumno puede anotarse a pye pero no a f2
        Assertions.assertFalse(alumno.puedeAnotarse(f2));
        Assertions.assertTrue(alumno.puedeAnotarse(pye));
    }
}