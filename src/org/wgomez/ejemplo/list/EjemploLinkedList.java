package org.wgomez.ejemplo.list;

import org.wgomez.ejemplo.modelos.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class EjemploLinkedList {
    public static void main(String[] args) {

        /*        Set<Alumno> alumnos = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));*/
        LinkedList<Alumno> enlazadaAlumnos = new LinkedList<>();

        enlazadaAlumnos.add(new Alumno("walter", 4));
        enlazadaAlumnos.add(new Alumno("cata", 6));
        enlazadaAlumnos.add(new Alumno("luci", 8));
        enlazadaAlumnos.add(new Alumno("jano", 10));
        enlazadaAlumnos.add(new Alumno("andres", 3));
        enlazadaAlumnos.add(new Alumno("zeus", 2));

        enlazadaAlumnos.addFirst(new Alumno("fernando", 9));
        enlazadaAlumnos.addLast(new Alumno("ricardo", 4));
/*
        System.out.println(enlazadaAlumnos.getFirst());
        System.out.println(enlazadaAlumnos.getLast());

        System.out.println(enlazadaAlumnos.get(2));

        System.out.println(enlazadaAlumnos.remove(new Alumno("jano", 10)));
        System.out.println(enlazadaAlumnos);

        Alumno alumnoExtraido = enlazadaAlumnos.removeFirst();
        System.out.println(alumnoExtraido);*/
    /*    System.out.println(enlazadaAlumnos.indexOf(new Alumno("walter", 4)));*/

        enlazadaAlumnos.set(0,new Alumno("sofia",7) );

        ListIterator<Alumno> li = enlazadaAlumnos.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("\n");

        while (li.hasPrevious()){
            System.out.println(li.previous());
        }









    }
}
