package com.leonardorosasales.projeto10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class ImcActivity extends AppCompatActivity {

    private TextInputEditText edPeso, edAltura;
    private Button btCalc, btLimp;
    double imc, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imc);

        edPeso = findViewById(R.id.edit_peso);
        edAltura = findViewById(R.id.edit_altura);
        btCalc = findViewById(R.id.btn_calcular);
        btLimp = findViewById(R.id.btn_limpar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void calcImc(View view) {
        peso = (Double.parseDouble(edPeso.getText().toString()));
        altura = (Double.parseDouble(edAltura.getText().toString()));

        altura = altura / 100;

        imc = peso / (altura * altura);

        if (imc < 17) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - MUITO ABAIXO DO PESO!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        } else if (imc >= 17 && imc < 18.5) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - ABAIXO DO PESO!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        } else if (imc >= 18.5 && imc < 25) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - PESO NORMAL!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        } else if (imc >= 25 && imc < 30) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - ACIMA DO PESO!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        } else if (imc >= 30 && imc < 35) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - OBESIDADE I!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        } else if (imc >= 35 && imc < 40) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - OBESIDADE II - SEVERA!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        }else{
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("Calculadora IMC");
            alerta.setMessage(("Seu IMC é de " + imc + " - OBESIDADE III - MÓBIDA!"));
            alerta.setNegativeButton("OK", null);

            alerta.create();
            alerta.show();
        }
    }
}