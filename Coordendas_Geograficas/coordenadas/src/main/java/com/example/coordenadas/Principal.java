package com.example.coordenadas;

/**
 * Created by Pulgas on 19/04/2015.
 */
public class Principal {
    public static void main(String[] main) {
        GeoPuntoAlt z, w;
        z = new GeoPuntoAlt(-25.2988, -57.6506, 300);
        w = new GeoPuntoAlt(-24.2988, -56.6506, 800);
        //z.distancia(w);
        //System.out.println("Distancia: " + z.toString());
        System.out.print("La distancia entre los dos puntos es: " + z.distancia_nueva(w) );
    }
}
