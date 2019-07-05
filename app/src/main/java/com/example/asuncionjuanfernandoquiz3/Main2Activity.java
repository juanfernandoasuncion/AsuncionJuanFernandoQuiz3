package com.example.asuncionjuanfernandoquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.tvName);
        txtPassword = findViewById(R.id.tvPassword);
    }

    public void goRegister(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void userLogin(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        txtEmail.setText(sp.getString("email", ""));
        Toast.makeText(this, txtEmail.getText(), Toast.LENGTH_LONG).show();
    }
}
