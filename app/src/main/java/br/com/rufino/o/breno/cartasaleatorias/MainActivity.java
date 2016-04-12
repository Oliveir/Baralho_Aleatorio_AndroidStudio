package br.com.rufino.o.breno.cartasaleatorias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView cartaImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartaImagem = (ImageView) findViewById(R.id.imageView);

        cartaImagem.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Random rand = new Random();
                int n = rand.nextInt((52 - 1) + 1) + 1;
                String rsc = "carta"+n;
                int resID = getResources().getIdentifier(rsc , "drawable", getPackageName());

                cartaImagem.setImageResource(resID);

                return false;
            }
        });
    }
}
