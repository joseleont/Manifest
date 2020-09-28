package com.example.clase3_4;

import android.content.Intent;
import android.net.Uri;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import com.example.clase3_4.R;
import com.example.clase3_4.apps.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Synchro SHOKAN");


        Log.d("msg","HOLA");
        File file = new File("Directorio.csv");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("HELLO");
            writer.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }


        findViewById(R.id.btnRetorno).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,retornp.class);
                int requestCode = 1;
                startActivityForResult(intent,requestCode);

            }
        });



    }

    public void abrirActivityURL(View view){

        Intent intent = new Intent(this,actiURL.class);
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=rYDuNq-a5b4&ab_channel=Translegomaker"));

        startActivity(intent);
    }

    public void abrirActivityInfo(View view){

        Intent intent = new Intent(this,actiINFO.class);
        intent.putExtra("nombre","Juan");
        intent.putExtra("edad",23);
        intent.putExtra("usuario", new US("a","b"));

        startActivity(intent);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode==1 && resultCode==RESULT_OK){

            String infoActivity = data.getStringExtra("nombre");

            TextView text = findViewById(R.id.textView1);
            text.setVisibility(View.VISIBLE);
            String tex=text.getText().toString();

            text.setText(tex+infoActivity);

        }


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        ImageView imagen = findViewById(R.id.imageInicial);

        int i = (int) (Math.random()*3)+1;

        switch (i){
            case 1:
                imagen.setImageResource(R.drawable.eyes);
                break;
            case 2:
                imagen.setImageResource(R.drawable.syn);
                break;
            case 3:
                imagen.setImageResource(R.drawable.fusi);;
                break;
        }

        Toast.makeText(this,"Korinseo",Toast.LENGTH_SHORT).show();
        Log.d("msg",String.valueOf(i));


    }


}