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
        String cad = "Selecionado: \n";
        if (c1.isChecked()){
            cad += " Gato\n ";
        } if (c1.isChecked()) {
            cad += " Perro\n ";

        }
        float calificacion = barraEstrella.getRating();
        cad += "Calificacion; " +calificacion + "Estrella";
        Toast.makeText(getApplicationContext(),cad, Toast.LENGTH_SHORT).show();
    }
}