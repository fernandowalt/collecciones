package org.wgomez.ejemplo.set;

import java.util.*;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = { "Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado",
                           "Lenguado", "Lenguado",
                           "Lenguado", "Lenguado" };


        Set<String> unicos = new HashSet<>();
        for (String pez : peces) {

            if (!unicos.add(pez)) {

                System.out.println("La cadena duplicada es: " + pez);
            }

            System.out.println(unicos.size() + " elementos no duplicados: " + unicos);


        }


    }


}
