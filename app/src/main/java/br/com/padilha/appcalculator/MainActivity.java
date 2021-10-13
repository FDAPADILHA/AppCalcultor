package br.com.padilha.appcalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etValor;
    private Button butDobrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor = findViewById(R.id.etValor);
        butDobrar = findViewById(R.id.butDobrar);

        butDobrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });

    }

    private void calcular(){
        String text = etValor.getText().toString();
        double valor = Double.valueOf(text);
        double result = valor * 2;

        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Resultado:");
        alerta.setMessage(String.valueOf(result));
        alerta.setPositiveButton("ok", null);
        alerta.show();
    }
}