package com.example.jogodescubranumero;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtDicaProg;
    EditText edtValorProg;
    EditText edtValorOcultoProg;
    int valorOculto = gerarNumero();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDicaProg = findViewById(R.id.txtDica);
        edtValorProg = findViewById(R.id.edtValor);
        edtValorOcultoProg = findViewById(R.id.edtValorOculto);
    }
    public int gerarNumero()
    {
        Random gerarNumero = new Random();
        int numero = gerarNumero.nextInt(10)+1;
        return numero;
    }
    public void clickBtnEnviar (View v)
    {
        int valor = Integer.parseInt(edtValorProg.getText().toString());
        if (valor == valorOculto)
        {
            txtDicaProg.setText("Parabéns");
            edtValorOcultoProg.setText(""+valorOculto);
        }
        else
        {
            if  (valor < valorOculto)
            {
                txtDicaProg.setText("O Valor oculto é maior que: " + valor);
                edtValorProg.setText("");
                edtValorProg.requestFocus();
            }
            else
            {
                txtDicaProg.setText("O Valor oculto é menor que: " + valor);
                edtValorProg.setText("");
                edtValorProg.requestFocus();
            }
        }
    }
    public void clickBtnNovo (View v)
    {
        txtDicaProg.setText("Valor de 1 até 10");
        edtValorProg.setText("?");
        edtValorOcultoProg.setText("Digite o valor!");
        valorOculto = gerarNumero();
    }


}