package com.example.usuario.asteroidesfinal;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by USUARIO on 31/01/2018.
 */

public class Preferencias extends PreferenceActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new PreferenciasFragment()).commit();
    }
}
