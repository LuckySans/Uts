
package com.uts.IF3B.utsahmadrizky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etnama;
    EditText etNomorPendaftaran;
    CheckBox cbkonfirmasi;
    Spinner sppendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Pendaftaran");

        btndaftar = findViewById(R.id.btn_daftar);
        etnama = findViewById(R.id.et_NamaLengkap);
        etNomorPendaftaran = findViewById(R.id.et_NomorPendaftaran);
        cbkonfirmasi = findViewById(R.id.cb_Konfirmasi_dasar);
        sppendaftaran = findViewById(R.id.sp_Pendaftaran);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etnama.getText().toString();
                String Nomor = etNomorPendaftaran.getText().toString();
                String konfirmasi = cbkonfirmasi.getText().toString();
                String pendaftaran = String.valueOf(sppendaftaran.getSelectedItem());

                if (Nama.trim().equals("")){
                    etnama.setError("Nama Harus Diisi!");
                }
                else if (Nomor.trim().equals("")) {
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus di isi");
                }
                else if (!cbkonfirmasi.isChecked()){
                    Toast.makeText(MainActivity.this,"Centang dulu Boss !!", Toast.LENGTH_SHORT).show();
                }
                else if (pendaftaran.equalsIgnoreCase("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih DUlu boss", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent daftar = new Intent(MainActivity.this,Second.class);
                    daftar.putExtra("xnama", Nama);
                    daftar.putExtra("xnomor", Nomor);
                    daftar.putExtra("xconfirm",konfirmasi);
                    daftar.putExtra("xpendaftaran", pendaftaran);
                    startActivity(daftar);
                }
            }
        });
    }
}