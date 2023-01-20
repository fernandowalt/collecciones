package org.wgomez.ejemplo.set;

import org.wgomez.ejemplo.modelos.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        /*        Set<Alumno> alumnos = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));*/
        Set<Alumno> alumnos = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());


        alumnos.add(new Alumno("walter", 4));
        alumnos.add(new Alumno("cata", 6));
        alumnos.add(new Alumno("luci", 8));
        alumnos.add(new Alumno("jano", 10));
        alumnos.add(new Alumno("andres", 3));
        alumnos.add(new Alumno("zeus", 2));
        alumnos.add(new Alumno("lucas", 2));

        System.out.println(alumnos);


    }
}
