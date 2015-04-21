package com.example.complejos;

/**
 * Created by Pulgas on 18/04/2015.
 */
public class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new ComplejoAmpliado(-1.5, 0.1);
        w = new ComplejoAmpliado(-1.2, 0.0);
        z.suma(w);
        System.out.println("Complejo Ampliado: " + z.toString());
    }
}
