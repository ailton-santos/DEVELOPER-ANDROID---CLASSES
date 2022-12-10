package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    String jogador = "X";
    //matriz para verificação
    String[][] matrizVerificacao = new String[3][3];
    //Empate
    int jogadas = 0;
    public void trocaJogador()
    {
        if(jogador.equals("X"))
        {
            jogador = "O";
        }
        else
        {
            jogador = "X";
        }
        jogadas = jogadas + 1;
    }
    private void inicializaMatrizVerificacao()
    {
        for(int linha = 0; linha < 3; linha++)
        {
            for(int coluna = 0; coluna < 3; coluna++)
            {
                matrizVerificacao[linha][coluna] =
                        String.valueOf(linha)+String.valueOf(coluna);
            }
        }
    }
    private boolean verificaGanhador()
    {
        boolean ganhador = false;
//horizontal
        if(matrizVerificacao[0][0].equals(matrizVerificacao[0][1]) &&
                matrizVerificacao[0][0].equals(matrizVerificacao[0][2]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[1][0].equals(matrizVerificacao[1][1]) &&
                matrizVerificacao[1][0].equals(matrizVerificacao[1][2]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[2][0].equals(matrizVerificacao[2][1]) &&
                matrizVerificacao[2][0].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }
//vertical
        if(matrizVerificacao[0][0].equals(matrizVerificacao[1][0]) &&
                matrizVerificacao[0][0].equals(matrizVerificacao[2][0]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[0][1].equals(matrizVerificacao[1][1]) &&
                matrizVerificacao[0][1].equals(matrizVerificacao[2][1]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[0][2].equals(matrizVerificacao[1][2]) &&
                matrizVerificacao[0][2].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }
//diagonal
        if(matrizVerificacao[0][0].equals(matrizVerificacao[1][1]) &&
                matrizVerificacao[0][0].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[0][2].equals(matrizVerificacao[1][1]) &&
                matrizVerificacao[0][2].equals(matrizVerificacao[2][0]))
        {
            ganhador = true;
        }
        return ganhador;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final Button btn11Prog = (Button) findViewById(R.id.btn11);
        final Button btn12Prog = (Button) findViewById(R.id.btn12);
        final Button btn13Prog = (Button) findViewById(R.id.btn13);
        final Button btn21Prog = (Button) findViewById(R.id.btn21);
        final Button btn22Prog = (Button) findViewById(R.id.btn22);
        final Button btn23Prog = (Button) findViewById(R.id.btn23);
        final Button btn31Prog = (Button) findViewById(R.id.btn31);
        final Button btn32Prog = (Button) findViewById(R.id.btn32);
        final Button btn33Prog = (Button) findViewById(R.id.btn33);
        final TextView txtJogadorProg = (TextView) findViewById(R.id.txtJogador);
        final Button btnResetProg = (Button) findViewById(R.id.btnReset);
        inicializaMatrizVerificacao();
        btn11Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11Prog.setText(jogador);
                btn11Prog.setClickable(false);
                matrizVerificacao[0][0] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn12Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn12Prog.setText(jogador);
                btn12Prog.setClickable(false);
                matrizVerificacao[0][1] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn13Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn13Prog.setText(jogador);
                btn13Prog.setClickable(false);
                matrizVerificacao[0][2] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn21Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn21Prog.setText(jogador);
                btn21Prog.setClickable(false);
                matrizVerificacao[1][0] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn22Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn22Prog.setText(jogador);
                btn22Prog.setClickable(false);
                matrizVerificacao[1][1] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn23Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn23Prog.setText(jogador);
                btn23Prog.setClickable(false);
                matrizVerificacao[1][2] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn31Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn31Prog.setText(jogador);
                btn31Prog.setClickable(false);
                matrizVerificacao[2][0] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn32Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn32Prog.setText(jogador);
                btn32Prog.setClickable(false);
                matrizVerificacao[2][1] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btn33Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn33Prog.setText(jogador);
                btn33Prog.setClickable(false);
                matrizVerificacao[2][2] = jogador;
                if(verificaGanhador())
                {
                    txtJogadorProg.setText("Ganhador: "+jogador);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn13Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                    btn23Prog.setClickable(false);
                    btn31Prog.setClickable(false);
                    btn32Prog.setClickable(false);
                    btn33Prog.setClickable(false);
                }
                else
                {
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador);
                    if(jogadas==9){
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });
        btnResetProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11Prog.setClickable(true);
                btn11Prog.setText("");
                btn12Prog.setClickable(true);
                btn12Prog.setText("");
                btn13Prog.setClickable(true);
                btn13Prog.setText("");
                btn21Prog.setClickable(true);
                btn21Prog.setText("");
                btn22Prog.setClickable(true);
                btn22Prog.setText("");
                btn23Prog.setClickable(true);
                btn23Prog.setText("");
                btn31Prog.setClickable(true);
                btn31Prog.setText("");
                btn32Prog.setClickable(true);
                btn32Prog.setText("");
                btn33Prog.setClickable(true);
                btn33Prog.setText("");
                inicializaMatrizVerificacao();
                jogadas = 0;
                txtJogadorProg.setText("Jogador: "+jogador);
            }
        });
    }
}