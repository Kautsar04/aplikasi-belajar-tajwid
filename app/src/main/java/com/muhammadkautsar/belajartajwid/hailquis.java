package com.muhammadkautsar.belajartajwid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class hailquis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasilquis);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView hasil = (TextView)findViewById(R.id.HasilJawaban);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar : "+quisactivity.benar+"\nJawaban Salah : "+quisactivity.salah);
        nilai.setText(""+quisactivity.hasil);
    }

    public void ulangi(View view){
        finish();
        Intent i = new Intent(getApplicationContext(),quisactivity.class);
        startActivity(i);
    }
}
