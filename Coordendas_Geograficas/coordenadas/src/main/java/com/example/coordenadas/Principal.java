package com.example.coordenadas;

/**
 * Created by Pulgas on 19/04/2015.
 */
public class Principal {
    public static void main(String[] main) {
        GeoPunto z, w;
        z = new GeoPunto(1500, 300);
        w = new GeoPunto(200, 2400);
        z.distancia(w);
        System.out.println("Distancia: " + z.toString());
    }
}
