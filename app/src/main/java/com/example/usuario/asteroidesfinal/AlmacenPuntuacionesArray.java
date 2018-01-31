package com.example.usuario.asteroidesfinal;

import java.util.Vector;

/**
 * Created by USUARIO on 31/01/2018.
 */

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {

    private Vector<String> puntuaciones;

    public AlmacenPuntuacionesArray(){
        puntuaciones = new Vector<String>();
        puntuaciones.add("123000 Pepe Perez");
        puntuaciones.add("111000 El puto amo");
        puntuaciones.add("011000 Tipo de incognito");
    }

    @Override
    public void guardarPuntuacion(int puntos, String nombre, long fecha) {
        puntuaciones.add(0, puntos + " " + nombre);
    }

    @Override
    public Vector<String> listaPuntuaciones(int cantidad) {
        return puntuaciones;
    }
}
