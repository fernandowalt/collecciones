package org.wgomez.ejemplo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapObjetos {

    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Walter");
        persona.put("apellido", "Gomez");
        persona.put("edad", "30");
        persona.put("email", "walgo@gmail.com");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);


        for (String s : persona.keySet()) {

            Object valor = persona.get(s);
            if (valor instanceof Map) {
                Map<String, String> direc = (Map<String, String>) valor;

                for (String p : direc.keySet()) {

                    System.out.println("    " + p + " => " + direc.get(p));
                }
            } else {
                System.out.println(s + " => " + valor);
            }

        }


    }
}
