package org.wgomez.ejemplo.list;

import org.wgomez.ejemplo.modelos.Alumno;

import java.util.ArrayList;
import java.util.List;


public class EjemploArrayList {
    public static void main(String[] args) {

        /*        Set<Alumno> alumnos = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));*/
        List<Alumno> alumnos = new ArrayList<>();
        System.out.println("Esta vacia: " + alumnos.isEmpty());


        alumnos.add(new Alumno("walter", 4));
        alumnos.add(new Alumno("cata", 6));
        alumnos.add(new Alumno("luci", 8));
        alumnos.add(new Alumno("jano", 10));
        alumnos.add(new Alumno("andres", 3));
        alumnos.add(2, new Alumno("zeus", 2));
        alumnos.set(2, new Alumno("lucas", 2));

        alumnos.remove(new Alumno("jano", 10));

        System.out.println("Tamaño: " + alumnos.size());
        System.out.println("Esta vacia: " + alumnos.isEmpty());
        System.out.println(alumnos);

        Object a[] = alumnos.toArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }
}
