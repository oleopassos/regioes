package com.example.alu201621705.regioes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private String[] regioes, norte, nordeste, centrooeste, sudeste, sul;
    private int contadorRegioes = 0, contadorNorte = 0, contadorNordeste = 0, contadorCentrooeste = 0, contadorSudeste = 0, contadorSul = 0;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
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
