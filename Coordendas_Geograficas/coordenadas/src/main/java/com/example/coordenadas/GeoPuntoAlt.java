package com.example.coordenadas;

import java.util.Map;

/**
 * Created by srueda on 21/04/2015.
 */
public class GeoPuntoAlt extends GeoPunto {
    private double altura;

    public GeoPuntoAlt(double longitud, double latitud, double altura) {
        super(longitud, latitud);
        this.altura = altura;
    }

    public double distancia_nueva(GeoPuntoAlt punto) {
        double c = Math.sqrt((super.distancia(punto)*super.distancia(punto))+
                ((altura-punto.altura)*(altura-punto.altura)));
        return c;
    }

    @Override
    public String toString() {
        return "Lat: " + super.getLatitud() + " Long: " + super.getLongitud() + "Alt: " + altura;
    }
}
