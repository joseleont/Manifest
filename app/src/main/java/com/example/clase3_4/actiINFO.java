package com.example.clase3_4;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class actiINFO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_i_n_f_o);

        Intent intent =getIntent();
        String duel=intent.getStringExtra("nombre");
        int poli=intent.getIntExtra("edad",0);
        US usuario = (US) intent.getSerializableExtra("usuario");


    }
}