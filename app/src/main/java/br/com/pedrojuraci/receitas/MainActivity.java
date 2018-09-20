package br.com.pedrojuraci.receitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Bolo*/
        final Button botaoBolo = findViewById(R.id.botaoBolo);
        botaoBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BoloActivity.class);
                startActivity(intent);
            }
        });
        /*Torta*/
        final Button botaoTorta = findViewById(R.id.botaoTorta);
        botaoTorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TortaActivity.class);
                startActivity(intent);
            }
        });
        /*Cookie*/
        final Button botaoCookie = findViewById(R.id.botaoCookie);
        botaoCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CookieActivity.class);
                startActivity(intent);
            }
        });
        /*Sorvete*/
        final Button botaoSorvete = findViewById(R.id.botaoSorvete);
        botaoSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SorveteActivity.class);
                startActivity(intent);
            }
        });

    }
}
