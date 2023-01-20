package org.wgomez.ejemplo.list;

import org.wgomez.ejemplo.modelos.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class EjemploList {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("walter", 4));
        alumnos.add(new Alumno("cata", 6));
        alumnos.add(new Alumno("luci", 8));
        alumnos.add(new Alumno("jano", 10));
        alumnos.add(new Alumno("andres", 3));
        alumnos.add(new Alumno("zeus", 2));
        alumnos.add(new Alumno("zeus", 2));

        alumnos.forEach(System.out::println);
        alumnos.forEach((a) -> System.out.println(a.getNombre()));
        alumnos.forEach((a) -> System.out.println(a.getNota()));

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }


    }
}
