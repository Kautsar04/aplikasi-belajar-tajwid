package com.muhammadkautsar.belajartajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class belajaractivity extends AppCompatActivity {

    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajaractivity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suarabutton = MediaPlayer.create(this,R.raw.button);
        final MediaPlayer exit = MediaPlayer.create(this,R.raw.keluar);
        final MediaPlayer masuk = MediaPlayer.create(this,R.raw.masuk);
        final MediaPlayer salah = MediaPlayer.create(this,R.raw.salah);
        final MediaPlayer benar = MediaPlayer.create(this,R.raw.benar);
        pindah = (ImageButton) findViewById(R.id.hukumnun);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(belajaractivity.this, hukumnunactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.hukummad);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(belajaractivity.this, hukummadactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.hukummim);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(belajaractivity.this, hukummimactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.hukumidgham);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(belajaractivity.this, hukumidghamactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonexit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit.start();
                Intent intent = new Intent(belajaractivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}