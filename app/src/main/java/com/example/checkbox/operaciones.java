package com.example.checkbox;

import android.os.Bundle;
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
        tv1 = findViewById(R.id.textView4);
        ratingBar = findViewById(R.id.ratingBar2);
    }

    private float Calcular (String num){
        if (num.equals("")){
            return 0;
        }else {
            return Float.parseFloat(num);
        }
    }
}