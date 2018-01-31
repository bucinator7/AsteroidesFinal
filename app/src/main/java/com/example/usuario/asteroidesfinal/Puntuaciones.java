package com.example.usuario.asteroidesfinal;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by USUARIO on 31/01/2018.
 */

public class Puntuaciones  extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new MiAdaptador(this,MainActivity.almacen.listaPuntuaciones(10)));
    }

    @Override protected void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
        Object o = getListAdapter().getItem(position);
        Toast.makeText(this, "Selección: " + Integer.toString(position)
                + " - " + o.toString(), Toast.LENGTH_LONG).show();
    }
}
