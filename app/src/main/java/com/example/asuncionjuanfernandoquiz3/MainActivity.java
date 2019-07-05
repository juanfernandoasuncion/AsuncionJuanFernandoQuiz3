package com.example.asuncionjuanfernandoquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
        txtPassword = findViewById(R.id.etPassword);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void goLogin(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void userRegister(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("username", txtName.getText().toString());
        editor.putString("password", txtPassword.getText().toString());
        editor.putString("email", txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "Saved in userInfo.xml", Toast.LENGTH_LONG).show();
    }
}
