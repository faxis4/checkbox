package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class opciones extends AppCompatActivity {
CheckBox c1,c2;
RatingBar barraEstrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opciones);
    c1 = findViewById(R.id.perro);
    c2 = findViewById(R.id.gato);
    barraEstrella = findViewById(R.id.ratingBar);
    }
    public void Boton(View view){
        if (view.getId() == R.id.btnValidar);
        validar();
    }
private void validar(){
        String seleccion = "Seleccionado: ";
        if (c1.isChecked()){
            seleccion += "Perro, ";
        }
        if (c2.isChecked()){
            seleccion += "Gato, ";
        }
        if (seleccion.equals("Seleccionado: ")){
            seleccion = "No seleccionaste ningún animal. ";
        }
        float calificacion = barraEstrella.getRating();
        String cad = seleccion + "Calificación: " + calificacion + " estrellas";
        Toast.makeText(getApplicationContext(),cad, Toast.LENGTH_SHORT).show();
    }
}