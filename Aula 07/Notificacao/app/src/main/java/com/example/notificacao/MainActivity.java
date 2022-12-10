package com.example.notificacao;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSalvarProg = (Button) findViewById(R.id.btnSalvar);
        final EditText edtNomeProg = (EditText) findViewById(R.id.edtNome);
        final EditText edtTelefoneProg = (EditText) findViewById(R.id.edtTelefone);
        final EditText edtEmailProg = (EditText) findViewById(R.id.edtEmail);
        btnSalvarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Desenvolvimento do modelo do AlertDialog
                AlertDialog.Builder modelo = new
                        AlertDialog.Builder(MainActivity.this);
//Define o título para o AlertDialog
                modelo.setTitle("Cadastro:");
//Define a mensagem para o AlertDialog
                modelo.setMessage("Nome: " + edtNomeProg.getText()
                        + "\nTelefone: " + edtTelefoneProg.getText()
                        + "\nE-mail: " + edtEmailProg.getText());
//Define um botão para o AlertDialog
                modelo.setPositiveButton("Ok", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface arg0, int arg1) {
//Define o que é feito quando o usuário clicar no botão desenvolvido
                    }
                });
//Cria um AlertDialog com base no modelo gerado anteriormente
                AlertDialog alerta = modelo.create();
//Mostra o AlertDialog na tela
                alerta.show();
            }
        });
    }
}