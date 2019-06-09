package com.example.estagio;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BemVindo extends AppCompatActivity {

    //Tela de Bem-Vindo
    private static int SPLASH_TIME_OUT = 2000;
    View view;
    @Override
    protected  void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.branco);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(BemVindo.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }



}
