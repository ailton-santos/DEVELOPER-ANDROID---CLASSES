package com.example.consultacep;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;

public class Principal extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConsultarProg = (Button) findViewById(R.id.btnConsultar);
        final EditText cep = findViewById(R.id.edtCEP);
        final TextView resultado = findViewById(R.id.txtResultado);
        btnConsultarProg.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                try {
                    CEP retorno = new CEP();
                    ConsumirJSON cj = new ConsumirJSON(cep.getText().toString());
                    retorno = cj.execute().get();
                    resultado.setText(retorno.toString()); }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
