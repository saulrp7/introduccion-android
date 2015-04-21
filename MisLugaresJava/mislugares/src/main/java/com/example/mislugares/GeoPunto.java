package com.example.mislugares;

/**
 * Created by Pulgas on 20/04/2015.
 */
public class GeoPunto {
    private double longitud, latitud;

    public GeoPunto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public String toString() {
        return new String("Longitud:" + longitud + ", Latitud:" + latitud);
    }

    public double distancia(GeoPunto punto) {
        final double RADIO_TIERRA = 6371000;

        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);

        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.sin(dLon / 2) * Math.sin(dLon / 2) *
                        Math.cos(lat1) * Math.cos(lat2);

        double c = Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return c * RADIO_TIERRA;
    }
}
