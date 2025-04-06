package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void intentosDeInscripcion() {
        // crear materias
        Materia am1 = new Materia();
        Materia aga = new Materia();
        Materia lyed = new Materia();
        Materia f1 = new Materia();
        Materia f2 = new Materia();
        Materia pye = new Materia();

        // instanciar incripciones
        Inscripcion inscripcion1 = new Inscripcion();
        Inscripcion inscripcion2 = new Inscripcion();

        // crear listas de materias aprobadas, a inscribir y correlatividades
        List<Materia> materiasAprobadasAlumnoSinF1 = Arrays.asList(am1, aga, lyed);
        List<Materia> materiasAprobadasAlumnoConF1 = Arrays.asList(am1, aga, lyed, f1);
        List<Materia> correlativasF2 = Arrays.asList(am1, f1);
        List<Materia> correlativasPye = Arrays.asList(am1, aga);
        List<Materia> materiasInscripcion = Arrays.asList(f2, pye);

        // setear correlatividades de materias a inscribir
        f2.setCorrelativas(correlativasF2);
        pye.setCorrelativas(correlativasPye);

        // instanciar alumnos
        Alumno alumnoSinF1 = new Alumno();
        Alumno alumnoConF1 = new Alumno();


        // setear materias aprobadas y materias a inscribir de cada alumno
        alumnoSinF1.setMateriasAprobadas(materiasAprobadasAlumnoSinF1);
        alumnoConF1.setMateriasAprobadas(materiasAprobadasAlumnoConF1);

        inscripcion1.setAlumno(alumnoSinF1);
        inscripcion1.setMaterias(materiasInscripcion);

        inscripcion2.setAlumno(alumnoConF1);
        inscripcion2.setMaterias(materiasInscripcion);

        // testear que la inscripcion del alumno con las correlatividades necesarias pasa y viceversa
        Assertions.assertFalse(inscripcion1.aprobada());
        Assertions.assertTrue(inscripcion2.aprobada());
    }
}