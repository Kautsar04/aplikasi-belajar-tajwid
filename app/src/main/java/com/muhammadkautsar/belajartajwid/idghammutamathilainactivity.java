package com.muhammadkautsar.belajartajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class idghammutamathilainactivity extends AppCompatActivity {
ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idghammutamathilainactivity);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer exit = MediaPlayer.create(this,R.raw.keluar);
        final MediaPlayer masuk = MediaPlayer.create(this,R.raw.masuk);
        final MediaPlayer salah = MediaPlayer.create(this,R.raw.salah);
        final MediaPlayer benar = MediaPlayer.create(this,R.raw.benar);
        final MediaPlayer home = MediaPlayer.create(this,R.raw.salah2);
        pindah = (ImageButton) findViewById(R.id.buttonexit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit.start();
                Intent intent = new Intent(idghammutamathilainactivity.this, hukumidghamactivity.class);
                startActivity(intent);
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonhome);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.start();
                Intent intent = new Intent(idghammutamathilainactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}