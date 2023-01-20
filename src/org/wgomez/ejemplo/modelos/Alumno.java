package org.wgomez.ejemplo.modelos;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno() {

    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getNota() {
        return this.nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + '\'' + ", nota= " + nota;

    }

    @Override
    public int compareTo(Alumno a) {

        if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.getNota());


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return nombre.equals(alumno.nombre) && nota.equals(alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }



}
