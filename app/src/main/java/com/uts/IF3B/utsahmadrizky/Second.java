
package com.uts.IF3B.utsahmadrizky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView tvnama;
    TextView tvNomor;
    TextView tvpendaftaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvnama = findViewById(R.id.tv_namalengkap);
        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("xnama");
        tvnama.setText(terimanama);

        tvNomor = findViewById(R.id.tv_Pendaftaran);
        Intent baru = getIntent();
        String terimaNomor = baru.getStringExtra("xnomor");
        tvNomor.setText(terimaNomor);

        tvpendaftaran = findViewById(R.id.tv_tv);
        Intent lagi = getIntent();
        String terimaKode = lagi.getStringExtra("xpendaftaran");
        tvpendaftaran.setText(terimaKode);

    }
}