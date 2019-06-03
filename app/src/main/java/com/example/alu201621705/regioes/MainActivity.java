package com.example.alu201621705.regioes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] regioes, estados, norte, nordeste, centrooeste, sudeste, sul;
    private int limiteEstados = 0, contadorRegioes = 0, contadorEstados = 0;
    private LinearLayout layout;
    private TextView tvRegioes, tvEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regioes = new String[] {
                "Norte",
                "Nordeste",
                "Centro-Oeste",
                "Sudeste",
                "Sul"
        };

        norte = new String[]{
                "Acre",
                "Rondônia",
                "Amazonas",
                "Roraima",
                "Pará",
                "Amapá",
                "Tocantins"
        };

        nordeste = new String[]{
                "Bahia",
                "Piauí",
                "Maranhão",
                "Ceará",
                "Rio Grande do Norte",
                "Paraíba",
                "Pernambuco",
                "Alagoas",
                "Sergipe"
        };

        centrooeste = new String[]{
                "Mato Grosso",
                "Mato Grosso do Sul",
                "Goiás",
                "Distrito Federal"
        };

        sudeste = new String[]{
                "São Paulo",
                "Rio de Janeiro",
                "Minas Gerais",
                "Espirito Santo"
        };

        sul = new String[]{
                "Rio Grande do Sul",
                "Santa Catarina",
                "Parana"
        };

        estados = norte;

        tvRegioes = (TextView) findViewById(R.id.tvEstados);
        tvEstados = (TextView) findViewById(R.id.tvRegioes);

        tvRegioes.setText(regioes[contadorRegioes]);
        tvEstados.setText(estados[contadorEstados]);

        layout.setOnTouchListener( new OnSwipeTouchListener(this){

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();

                if (contadorRegioes == 0){
                    limiteEstados = 6; // Norte - 7 estados

                    for (int i=0; i<7; i++){
                        estados[i]=norte[i];
                    }
                }

                if (contadorRegioes == 1){
                    limiteEstados = 8; //Nordeste - 9 estados

                    for (int i=0; i<9; i++){
                        estados[i]=nordeste[i];
                    }

                }

                if (contadorRegioes == 2){
                    limiteEstados = 3; //Centro-Oeste - 4 estados

                    for (int i=0; i<4; i++){
                        estados[i]=centrooeste[i];
                    }

                }

                if (contadorRegioes == 3){
                    limiteEstados = 3; //Sudeste - 4 estados

                    for (int i=0; i<4; i++){
                        estados[i]=sudeste[i];
                    }

                }

                if (contadorRegioes == 4){
                    limiteEstados = 2; //Sul - 3 estados

                    for (int i=0; i<3; i++){
                        estados[i]=sul[i];
                    }

                }

                if (contadorEstados > 0){
                    contadorEstados--;
                }else{
                    contadorEstados=limiteEstados;
                }

                tvEstados.setText(estados[contadorEstados]);

            }


            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();

                if (contadorRegioes == 0){
                    limiteEstados = 6; // Norte - 7 estados

                    for (int i=0; i<7; i++){
                        estados[i]=norte[i];
                    }
                }

                if (contadorRegioes == 1){
                    limiteEstados = 8; //Nordeste - 9 estados

                    for (int i=0; i<9; i++){
                        estados[i]=nordeste[i];
                    }

                }

                if (contadorRegioes == 2){
                    limiteEstados = 3; //Centro-Oeste - 4 estados

                    for (int i=0; i<4; i++){
                        estados[i]=centrooeste[i];
                    }

                }

                if (contadorRegioes == 3){
                    limiteEstados = 3; //Sudeste - 4 estados

                    for (int i=0; i<4; i++){
                        estados[i]=sudeste[i];
                    }

                }

                if (contadorRegioes == 4){
                    limiteEstados = 2; //Sul - 3 estados

                    for (int i=0; i<3; i++){
                        estados[i]=sul[i];
                    }

                }

                if (contadorEstados < limiteEstados){
                    contadorEstados++;
                }else{
                    contadorEstados=0;
                }

                tvEstados.setText(estados[contadorEstados]);

            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();

                if (contadorRegioes < 4) {
                    contadorRegioes++;
                }else{
                    contadorRegioes=0;
                }

                tvRegioes.setText(regioes[contadorRegioes]);
                contadorEstados = 0;
                // TRAVEI estados =
                tvEstados.setText(estados[contadorEstados]);
            }

                @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();

                    if (contadorRegioes > 0) {
                        contadorRegioes--;
                    }else{
                        contadorRegioes=4;
                    }

                    tvRegioes.setText(regioes[contadorRegioes]);
                    contadorEstados = 0;
                    tvEstados.setText(estados[contadorEstados]);
            }
        });




    }
}
