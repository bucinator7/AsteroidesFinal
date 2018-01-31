package com.example.usuario.asteroidesfinal;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.usuario.asteroidesfinal.R;

/**
 * Created by USUARIO on 31/01/2018.
 */

public class PreferenciasFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
