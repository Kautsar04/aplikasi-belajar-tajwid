package com.muhammadkautsar.belajartajwid;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quisactivity extends AppCompatActivity {
    ImageButton pindah;
    RadioGroup rg;
    RadioButton pilihanA, pilihanB, pilihanC, pilihanD;
    TextView pertanyaan;
    int nomor = 0;
    public static int hasil, benar, salah;
    String[] pertanyaan_kuis = new String[]{
            "1. Apabila nun sukun atau tanwin bertemu dengan huruf lam (ل), maka hukum bacaannya adalah.....","2. Hukum bacaan pada kata yang bergaris bawah adalah(سَيَصْلٰى نَارًا ذَاتَ لَهَبٍ) .....","3. Ada berapa huruf-huruf yang dimiliki hukum bacaan Idzhar Halqi?","4.Ada hukum bacaan apa saja yang terdapat dalam ayat tersebut (فِيْ جِيْدِهَا حَبْلٌ مِّنْ مَّسَدٍ) ?",
            "5. Ikhfa artinya .....","6. Apabila Nun Sukun atau Tanwin bertemu dengan huruf ghain (ق) maka hukum bacaannya adalah.....","7. Memasukkan bunyi nun sukun atau tanwin ke dalam huruf berikutnya tanpa disertai dengung merupakan cara membaca dari hukum bacaan.....","8. Berikut ini merupakan huruf-huruf yang dimiliki hukum bacaan Idzhar Halqi, kecuali.....",
            "9. Hukum bacaan pada kata yang bergaris bawah adalah(وَّاَرْسَلَ عَلَيْهِمْ طَيْرًا اَبَابِيْلَ)....","10. Diantara contoh berikut ini, manakah yang termasuk hukum bacaan Ikhfa Haqiqi?.....","11. Diantara hukum bacaan berikut ini, manakah yang cara membacanya tidak memerlukan atau tidak memakai dengung?.....","12. Manakah pernyataan berikut ini yang benar?......",
            "13. Halqi artinya .....","14. Tanwin adalah.....","15. Hukum bacaan yang ada pada kata bergaris bawah disamping adalah (كَلَّا لَيُنْۢبَذَنَّ فِى الْحُطَمَةِ).....","16. Hukum bacaan yang terdapat dalam ayat di samping adalah(فَوَيْلٌ لِّلْمُصَلِّيْنَ)....",
            "17. Cara membaca hukum bacaan Ikhfa Haqiqi adalah.....","18. Sebutkan hukum bacaan yang ada pada ayat di samping (اَيَحْسَبُ اَنْ لَّنْ يَّقْدِرَ عَلَيْهِ اَحَدٌ) .....",
            "19. Berikut ini manakah yang termasuk huruf-huruf Idgham Bi Ghunnah!","20. Mengapa nun sukun atau tanwin bertemu huruf halqi harus dibaca Idzhar atau jelas? Karena keduanya merupakan ....."
    };
    String[] pilihan_jawaban = new String[]{
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Idgham Bila Ghunnah","d. Ikhfa Haqiqi",
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Idgham Bila Ghunnah","d. Ikhfa Haqiqi",
            "a. 4 huruf","b. 5 huruf","c. 6 huruf","d. 2 huruf",
            "a. Idgham Bi Ghunnah dan Idgham Bi Ghunnah","b. Idgham Bi Ghunnah dan Idgham Bila Ghunnah","c. Ikhfa Haqiqi dan Iqlab","d. Idgham Bi Ghunnah dan Ikhfa Haqiqi",
            "a. Jelas","b. Samar","c. Masuk","d. Dengung",
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Idgham Bila Ghunnah","d. Ikhfa Haqiqi",
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Idgham Bila Ghunnah","d. Ikhfa Haqiqi",
            "a. ء dan ه","b. غ dan خ","c. ع dan ح","d. ل dan ر",
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Iqlab","d. Ikhfa Haqiqi",
            "a. فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُوْلٍ ","b. وَلَمْ يَكُنْ لَّهٗ كُفُوًا اَحَدٌ","c. مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ","d. فَصَلِّ لِرَبِّكَ وَانْحَرْ",
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Iqlab","d. Ikhfa Haqiqi",
            "a. Nun sukun bertemu ro (ر) dibaca Idgham Bi Ghunnah","b. Tanwin bertemu nun (ن) dibaca Iqlab","c. Tanwin bertemu shad (ص) dibaca Ikhfa Haqiqi","d. Tanwin bertemu ba (ب) dibaca Ikhfa Haqiqi",
            "a. Dengung","b. Tenggorokan","c. Samar","d. Mulut",
            "a. Nun Sukun yang muncul di perkataan tetapi tulisan nya tidak ada","b. Nun Sukun yang ada di tulisan","c. Saudara nun","d. Nun yang terbuang",
            "a. Idzhar Halqi","b. Idgham Bi Ghunnah","c. Iqlab","d. Ikhfa Haqiqi",
            "a. Idgham Bila Ghunnah","b. Idgham Bi Ghunnah","c. Iqlab","d. Ikhfa Haqiqi",
            "a. Menyamarkan bunyi nun sukun atau tanwin disertai dengung","b. Memasukkan bunyi nun sukun atau tanwin disertai dengung","c. Memasukkan bunyi nun sukun atau tanwin tanpa dengung","d. Mengganti bunyi nun sukun atau tanwin ke mim sukun",
            "a. Idgham Bi Ghunnah dan Idzhar Halqi","b. Idgham Bila Ghunnah dan Idgham Bi Ghunnah","c. Iqlab dan Idgham Bi Ghunnah","d. Idgham Bila Ghunnah dan Ikhfa Haqiqi",
            "a. ي ، م ، ن ، ل","b. م ، ن ، ر ، ب","c. ي ، ن ، م ، و","d. ق ، ت ، م ، و",
            "a. Mutamatsilain","b. Mutajanisain","c. Mutaqaribain","d. Mutaba'idain"
    };
    String[] jawaban_benar = new  String[]{
            "c. Idgham Bila Ghunnah",
            "d. Ikhfa Haqiqi",
            "c. 6 huruf",
            "a. Idgham Bi Ghunnah dan Idgham Bi Ghunnah",
            "b. Samar",
            "d. Ikhfa Haqiqi",
            "c. Idgham Bila Ghunnah",
            "b. غ dan خ",
            "d. Ikhfa Haqiqi",
            "c. مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ",
            "a. Idzhar Halqi",
            "c. Tanwin bertemu shad (ص) dibaca Ikhfa Haqiqi",
            "b. Tenggorokan",
            "a. Nun Sukun yang muncul di perkataan tetapi tulisan nya tidak ada",
            "c. Iqlab",
            "a. Idgham Bila Ghunnah",
            "b. Memasukkan bunyi nun sukun atau tanwin disertai dengung",
            "b. Idgham Bila Ghunnah dan Idgham Bi Ghunnah",
            "c. ي ، ن ، م ، و",
            "a. Mutamatsilain"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quisactivity);

        final MediaPlayer exit = MediaPlayer.create(this,R.raw.keluar);
        final MediaPlayer masuk = MediaPlayer.create(this,R.raw.masuk);
        final MediaPlayer bunyisalah = MediaPlayer.create(this,R.raw.salah);
        final MediaPlayer bunyibenar = MediaPlayer.create(this,R.raw.benar);
        final MediaPlayer home = MediaPlayer.create(this,R.raw.salah2);
        pindah = (ImageButton) findViewById(R.id.buttonexit);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.start();
                Intent intent = new Intent(quisactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        pertanyaan = (TextView) findViewById(R.id.pertanyaankuis);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        pilihanA = (RadioButton) findViewById(R.id.pilihanA);
        pilihanB = (RadioButton) findViewById(R.id.pilihanB);
        pilihanC = (RadioButton) findViewById(R.id.pilihanC);
        pilihanD = (RadioButton) findViewById(R.id.pilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        pilihanA.setText(pilihan_jawaban[0]);
        pilihanB.setText(pilihan_jawaban[1]);
        pilihanC.setText(pilihan_jawaban[2]);
        pilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }
    public void next(View view){
        if (pilihanA.isChecked()||pilihanB.isChecked()||pilihanC.isChecked()||pilihanD.isChecked()){
            RadioButton jawaban_user = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if(ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))benar++;
            else salah++;
            nomor++;
            if (nomor<pertanyaan_kuis.length){
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                pilihanA.setText(pilihan_jawaban[(nomor*4)+0]);
                pilihanB.setText(pilihan_jawaban[(nomor*4)+1]);
                pilihanC.setText(pilihan_jawaban[(nomor*4)+2]);
                pilihanD.setText(pilihan_jawaban[(nomor*4)+3]);

            }else {
                hasil=benar * 5;
                Intent selesai = new Intent(getApplicationContext(),hailquis.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this, "pilih jawaban dulu", Toast.LENGTH_SHORT).show();
        }
    }
}
