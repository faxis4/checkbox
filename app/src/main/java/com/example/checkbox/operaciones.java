package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class operaciones extends AppCompatActivity {
EditText et1, et2;
TextView tv1;
CheckBox cb1,cb2,cb3,cb4;
RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_operaciones);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        cb1 = findViewById(R.id.sumar);
        cb2 = findViewById(R.id.resta);
        cb3 = findViewById(R.id.multi);
        cb4 = findViewById(R.id.divi);
        tv1 = findViewById(R.id.tvResultado);
        ratingBar = findViewById(R.id.ratingBar2);
    }

    private float Calcular (String num){
        if (num.equals("")){
            return 0;
        }else {
            return Float.parseFloat(num);
        }
    }

    public void OnCalcular(View view){
        float a = Calcular(et1.getText().toString());
        float b = Calcular(et2.getText().toString());
        StringBuilder res = new StringBuilder();
        if (cb1.isChecked()) {
            res.append("Suma = ").append(fmt(a + b)).append("\n");
        }
        if (cb2.isChecked()) {
            res.append("Resta = ").append(fmt(a - b)).append("\n");
        }
        if (cb3.isChecked()) {
            res.append("Multiplicación = ").append(fmt(a * b)).append("\n");
        }
        if (cb4.isChecked()) {
            if (b == 0) {
                res.append("División: no se puede dividir entre 0\n");
            } else {
                res.append("División = ").append(fmt(a / b)).append("\n");
            }
        }
        if (res.length() == 0) {
            res.append("Selecciona una operación");
        }
        tv1.setText(res.toString().trim());
    }

    private String fmt(float v){
        return (v == (int) v) ? String.valueOf((int) v) : String.valueOf(v);
    }
}