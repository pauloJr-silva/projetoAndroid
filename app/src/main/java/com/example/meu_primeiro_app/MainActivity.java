package com.example.meu_primeiro_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escrever(View view){
        TextView texto =  findViewById(R.id.textTexto); // variável para receber o componente da tela
        texto.setText("Olá, Mundo!");
    }

}