package com.gmail.ahmadqorib97.tugas3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = (Button)findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                EditText txtNama = (EditText)findViewById(R.id.textNama);
                EditText txtUser = (EditText)findViewById(R.id.textUser);
                EditText txtPass = (EditText)findViewById(R.id.textPass);
                String nama = txtNama.getText().toString();
                String user = txtUser.getText().toString();
                String pass = txtPass.getText().toString();
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                if(user.equals("155410181") && pass.equals("ahmad")){
                    CharSequence text = "Login Berhasil";
                    Toast pesan = Toast.makeText(context, text, duration);
                    pesan.show();
                    Intent halamanKedua = new Intent(MainActivity.this, Main2Activity.class);
                    halamanKedua.putExtra("nama", nama);
                    halamanKedua.putExtra("nim", user);
                    startActivity(halamanKedua);
                    finish();
                }else{
                    CharSequence text = "Login Gagal";
                    Toast pesan = Toast.makeText(context, text, duration);
                    pesan.show();
                }
            }
        });
    }
}
