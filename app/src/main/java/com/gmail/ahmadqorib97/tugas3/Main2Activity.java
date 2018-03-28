package com.gmail.ahmadqorib97.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nama = (TextView)findViewById(R.id.txtNama);
        TextView angka = (TextView)findViewById(R.id.txtAngka);

        Intent inten = getIntent();
        String tNama = inten.getStringExtra("nama");
        String tNim = inten.getStringExtra("nim");
        int nim = Integer.parseInt(tNim);
        Random acak = new Random();
        int hAcak = acak.nextInt(nim);

        nama.setText(tNama);
        angka.setText(Integer.toString(hAcak));

        Button Back = (Button)findViewById(R.id.buttonBack);
        Back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
                finish();
            }
        });
    }
}
