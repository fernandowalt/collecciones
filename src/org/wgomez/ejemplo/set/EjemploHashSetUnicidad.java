package org.wgomez.ejemplo.set;

import org.wgomez.ejemplo.modelos.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumnos = new HashSet<>();

        alumnos.add(new Alumno("walter", 4));
        alumnos.add(new Alumno("cata", 6));
        alumnos.add(new Alumno("luci", 8));
        alumnos.add(new Alumno("jano", 10));
        alumnos.add(new Alumno("andres", 3));
        alumnos.add(new Alumno("zeus", 2));
        alumnos.add(new Alumno("zeus", 2));

        /*        System.out.println(alumnos);*/
        System.out.println("iterando usando el foreach");
        for (Alumno a : alumnos) {
            System.out.println(a);
        }

        System.out.println("\n Iterando usando el while e iterator");
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            Alumno a = iterator.next();
            System.out.println(a);
        }

        System.out.println("Iterando con Stream forEach");

        alumnos.forEach(System.out::println);


    }
}
