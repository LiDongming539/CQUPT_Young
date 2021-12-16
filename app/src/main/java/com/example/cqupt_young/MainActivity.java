package com.example.cqupt_young;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cqupt_young.View.SecondActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_CQUPT_Young);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.loggin);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loggin:
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
        }
    }
}