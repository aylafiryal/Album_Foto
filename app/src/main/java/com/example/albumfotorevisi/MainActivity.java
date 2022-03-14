package com.example.albumfotorevisi;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    ImageView foto1, foto2, foto3, foto4, foto5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto1 = findViewById(R.id.file_1);
        foto1.setOnLongClickListener(v -> {
            Toast.makeText(MainActivity.this, "Thomas Amira", Toast.LENGTH_SHORT).show();
            return true;
        });

        foto2 = findViewById(R.id.file_2);
        foto2.setOnLongClickListener(v -> {
            Toast.makeText(MainActivity.this, "Morgan, Amira, Candy", Toast.LENGTH_SHORT).show();
            return true;
        });

        foto3 = findViewById(R.id.file_3);
        foto3.setOnLongClickListener(v -> {
            Toast.makeText(MainActivity.this, "Thomas, Yohannes, Amira", Toast.LENGTH_SHORT).show();
            return true;
        });

        foto4 = findViewById(R.id.file_4);
        foto4.setOnLongClickListener(v -> {
            Toast.makeText(MainActivity.this, "Morgan, Candy, Amira", Toast.LENGTH_SHORT).show();
            return true;
        });

        foto5 = findViewById(R.id.file_5);
        foto5.setOnLongClickListener(v -> {
            Toast.makeText(MainActivity.this, "Full Squad", Toast.LENGTH_SHORT).show();
            return true;
        });

    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}