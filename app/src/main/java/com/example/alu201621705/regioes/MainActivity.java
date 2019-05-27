package com.example.alu201621705.regioes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] regioes, estados, norte, nordeste, centrooeste, sudeste, sul;
    private int contadorRegioes = 0, contadorEstados = 0, contadorNorte = 0, contadorNordeste = 0, contadorCentrooeste = 0, contadorSudeste = 0, contadorSul = 0;
    private LinearLayout layout;
    private TextView tvRegioes, tvEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRegioes.setText(regioes[contadorRegioes]);
        tvEstados.setText(estados[contadorEstados]);

        layout.setOnTouchListener( new OnSwipeTouchListener(this){



            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
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

            }
        });


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

    }
}
