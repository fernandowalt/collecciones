package org.wgomez.ejemplo.map;

import java.util.*;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Walter");
        persona.put("apellido", "Gomez");
        persona.put("edad", "30");
        persona.put("email", "walgo@gmail.com");

        System.out.println(persona);
        String nombre =  persona.get("nombre");
        System.out.println(nombre);
        String apellido = persona.get("apellido");
        System.out.println(apellido);

        System.out.println(persona.size());
        String removerApellido = persona.remove("apellido");

        System.out.println(removerApellido);
        System.out.println(persona);

        boolean existeLaClavEedad = persona.containsKey("edad");
        System.out.println("la llave edad esta en el mapa persona: " + existeLaClavEedad);

        boolean existeLaClaveEmail = persona.containsKey("Email");
        System.out.println(existeLaClaveEmail);

        System.out.println("\n");
        Set<String> llavesDePersona = persona.keySet();
        llavesDePersona.forEach(System.out::println);

        System.out.println("\n");
        Collection<String> coleccionDeValores = persona.values();
        coleccionDeValores.forEach(System.out::println);


        System.out.println("\n==========Iterando el map con for=========");
        for (String llave : persona.keySet()) {
            System.out.println(llave + " => " + persona.get(llave));
        }

        System.out.println("\n==========Iterando el map con foreach");
        persona.forEach((llave, valor) -> System.out.println(llave + " => " + valor));

        System.out.println("\n================Reemplazando valores asociados a la llave nombre" +
                                   "==============");
        persona.replace("nombre","Walter","Fernando");
        System.out.println(persona);

    }
}
