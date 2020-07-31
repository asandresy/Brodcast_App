package com.example.brodcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button broadcast = findViewById(R.id.broadcast);

        broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent("com.example.myapplication.ConnectionReceiver");
                intent.setPackage("com.example.myapplication");
                intent.setAction("com.example.I_AM_HOME");
                sendBroadcast(intent);

                Toast.makeText(MainActivity.this, getResources().getString(R.string.toast),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}