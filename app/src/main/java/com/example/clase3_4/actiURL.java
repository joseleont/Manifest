package com.example.clase3_4;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class actiURL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_u_r_l);

        Intent intent =getIntent();
        Uri data =intent.getData();
        Log.d("data",data.toString());





    }

    public void botonInternet(View view){

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY,"https://www.youtube.com/watch?v=rYDuNq-a5b4&ab_channel=Translegomaker");

        if(intent.resolveActivity(getPackageManager())!=null){

            startActivity(intent);
        }else{
            Toast.makeText(this,"La accion no se soporta",Toast.LENGTH_SHORT).show();
        }


    }

}