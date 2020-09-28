package com.example.clase3_4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.clase3_4.apps.Usuario;

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