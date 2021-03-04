package com.example.envolbee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.envolbee.ui.ProductosFragment;

public class Producto1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.producto1);

    }
    public void VolverOnClick2(View view) {

        Intent intent = new Intent(Producto1.this, ProductosFragment.class);
        startActivity(intent);
    }}