package com.Chettyninho.firstdesign_diseointerfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpalshScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);
    }
    // Encuentra el botón por su ID
    Button botonIrAActividad = findViewById(R.id.boton);
    // Establece un Listener para el botón
 
}