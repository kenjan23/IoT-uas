package com.example.koneksi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class KontrolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontrol);
    }
    public void home (View view){
        Intent intent = new Intent(KontrolActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void kontrol (View view){
        Intent intent = new Intent(KontrolActivity.this, KontrolActivity.class);
        startActivity(intent);
    }

    public void informasi (View view){
        Intent intent = new Intent(KontrolActivity.this, InformasiActivity.class);
        startActivity(intent);
    }
}