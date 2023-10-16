package br.com.unicsul.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int pontosJogador = 0;
    private int pontosComputador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");

    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");

    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");

    }

    public void verificarGanhador() {
        TextView textoResultado = findViewById(R.id.textoResultado);
        TextView pontos = findViewById(R.id.pontos);

        pontos.setText("Você: " + this.pontosJogador + " | " + "Computador: " + this.pontosComputador);

        System.out.println("Jogador: " + this.pontosJogador);
        System.out.println("Comp: " + this.pontosComputador);

        if (this.pontosJogador == 3) {
            System.out.println("Jogador Ganhou");
            textoResultado.setText("Você ganhou com 3 pontos");
            textoResultado.setTextColor(Color.GREEN);

            this.pontosJogador = 0;
            this.pontosComputador = 0;
        } else if (this.pontosComputador == 3) {
            System.out.println("Computador Ganhou");
            textoResultado.setText("Computador ganhou com 3 pontos");
            textoResultado.setTextColor(Color.RED);

            this.pontosJogador = 0;
            this.pontosComputador = 0;
        }
    }

    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textoResultado = findViewById(R.id.textoResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];
        switch (opcaoApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.img_pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.img_papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.img_tesoura);
                break;

        }

        if (    (opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
                (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")
        ) {
            textoResultado.setText("VOCÊ PERDEU...");
            pontosComputador += 1;
            System.out.println("Comp:" + pontosComputador);
        } else if (
                (opcaoSelecionada == "tesoura" && opcaoApp == "papel") ||
                (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaoSelecionada == "pedra" && opcaoApp == "tesoura")
        ) {
            textoResultado.setText("VOCÊ GANHOU...");
            pontosJogador += 1;
            System.out.println("Jogador: " + pontosJogador);
        } else {
            textoResultado.setText("EMPATOU");
        }

        this.verificarGanhador();
    }
}