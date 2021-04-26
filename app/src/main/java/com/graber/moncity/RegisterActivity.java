package com.graber.moncity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.graber.moncity.ui.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageView iv=findViewById(R.id.imageView);
        ImageView iv2=findViewById(R.id.imageView2);
        ImageView iv3=findViewById(R.id.imageView3);
        ImageView iv4=findViewById(R.id.imageView4);
        ImageView iv5=findViewById(R.id.imageView5);
        ImageView iv6=findViewById(R.id.imageView6);
        ImageView iv7=findViewById(R.id.imageView7);
        EditText e_name = findViewById(R.id.edit_name);
        EditText e_email = findViewById(R.id.edit_email);
        EditText e_pass = findViewById(R.id.edit_pass);
        EditText e_tel = findViewById(R.id.edit_tel);

        TextView tvc = findViewById(R.id.textView6);
        tvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnReg= findViewById(R.id.btn_reg);
        btnReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });


    }
    public void registerUser(){

    }
    public  void showMessage(String text){
        Toast t = Toast.makeText(this,text,Toast.LENGTH_SHORT);
        t.show();
    }
}
