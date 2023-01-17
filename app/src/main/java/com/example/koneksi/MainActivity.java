package com.example.koneksi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView suhu;
    private TextView kelembaban;
    private TextView ph;
    private TextView lux;

    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        suhu = (TextView) findViewById(R.id.suhu);
        mRef = new Firebase("https://icpfinal-default-rtdb.firebaseio.com/suhu");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                suhu.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        kelembaban = (TextView) findViewById(R.id.kelembaban);
        mRef = new Firebase("https://icpfinal-default-rtdb.firebaseio.com/kelembaban");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                kelembaban.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ph = (TextView) findViewById(R.id.ph);
        mRef = new Firebase("https://icpfinal-default-rtdb.firebaseio.com/ph");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                ph.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        lux = (TextView) findViewById(R.id.lux);
        mRef = new Firebase("https://icpfinal-default-rtdb.firebaseio.com/lux");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                lux.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
    public void home (View view){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void kontrol (View view){
        Intent intent = new Intent(MainActivity.this, KontrolActivity.class);
        startActivity(intent);
    }

    public void informasi (View view){
        Intent intent = new Intent(MainActivity.this, InformasiActivity.class);
        startActivity(intent);
    }
}