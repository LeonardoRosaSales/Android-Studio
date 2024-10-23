package com.leonardorosasales.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        TextView texto = findViewById(R.id.textView_result);
        texto.setText("Bem vindo ao curso de Desenvolvimento de Android");
    }

    public void abrirLinkedIn(View view){
        Uri link = Uri.parse("https://www.linkedin.com/login/pt");
        Intent intent = new Intent(Intent.ACTION_VIEW, link);

        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}