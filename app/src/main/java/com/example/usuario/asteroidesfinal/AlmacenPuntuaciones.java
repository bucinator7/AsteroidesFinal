package com.example.usuario.asteroidesfinal;

import java.util.Vector;

/**
 * Created by USUARIO on 31/01/2018.
 */

public interface AlmacenPuntuaciones {
    public void guardarPuntuacion(int puntos, String nombre, long fecha);
    public Vector<String> listaPuntuaciones(int cantidad);
}
