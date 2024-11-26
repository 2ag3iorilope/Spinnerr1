package com.ikaslea.spinnerr1;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Spinner GureSpinner;
    private TextView testua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GureSpinner=findViewById(R.id.spinner);
        testua=findViewById(R.id.textView);



        final String [] datuak={"Sistemas de Gestión Empresarial","Empresa","Servicios y Procesos","Acceso a datos","Móviles","Interfaces"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item,datuak);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        GureSpinner.setAdapter(adaptador);
        GureSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {
                        testua.setText("Seleccionado:"+ datuak[position]);

                    }
                    public void onNothingSelected(AdapterView<?> parent) {
                        testua.setText("");
                    }
                });

    }
}
