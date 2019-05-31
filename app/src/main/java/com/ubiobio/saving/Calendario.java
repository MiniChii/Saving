package com.ubiobio.saving;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fabVolver);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGraficos();
            }
        });

        FloatingActionButton fab2 = findViewById(R.id.fabAcept);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }

    /**
     *Inicia la actividad que tiene la sección de gráficos
     *
     */
    public void openGraficos(){

        Intent intent = new Intent(this, Graficos.class);
        startActivity(intent);
    }

    /**
     *Inicia la actividad que tiene la seccion de Home
     *
     */
    public void openHome(){
        Intent intent2 = new Intent(this, Graficos.class);
        startActivity(intent2);
    }
}
