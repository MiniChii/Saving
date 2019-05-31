package com.ubiobio.saving;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        FloatingActionButton fab = findViewById(R.id.fabVolver);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGraficos();
            }
        });
    }

    public void openGraficos(){
        Intent intent = new Intent(this, Graficos.class);
        startActivity(intent);
    }
}
