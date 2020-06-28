package com.muhammadkautsar.belajartajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class hukumidghamactivity extends AppCompatActivity {
ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukumidghamactivity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suarabutton = MediaPlayer.create(this,R.raw.button);
        final MediaPlayer exit = MediaPlayer.create(this,R.raw.keluar);
        final MediaPlayer masuk = MediaPlayer.create(this,R.raw.masuk);
        final MediaPlayer salah = MediaPlayer.create(this,R.raw.salah);
        final MediaPlayer benar = MediaPlayer.create(this,R.raw.benar);
        final MediaPlayer home = MediaPlayer.create(this,R.raw.salah2);
        pindah = (ImageButton) findViewById(R.id.idghammutajanisain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(hukumidghamactivity.this, idghammutahanisainactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.idghammutamathilain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(hukumidghamactivity.this, idghammutamathilainactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.idghammutaqaribain);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(hukumidghamactivity.this, idghammutaqaribainactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonexit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk.start();
                Intent intent = new Intent(hukumidghamactivity.this, belajaractivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonhome);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.start();
                Intent intent = new Intent(hukumidghamactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}