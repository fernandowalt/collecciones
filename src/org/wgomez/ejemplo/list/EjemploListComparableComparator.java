package org.wgomez.ejemplo.list;

import java.util.Set;
import java.util.TreeSet;

public class EjemploListComparableComparator {

    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("tres");

        System.out.println(ts);

        Set<Integer> numeros = new TreeSet<>((a, b) -> b.compareTo(a));
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println(numeros);


    }


}
