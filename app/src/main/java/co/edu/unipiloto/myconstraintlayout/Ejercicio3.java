package co.edu.unipiloto.myconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
    }

    public void onclick1(View view) {
        Intent intent = new Intent(this, Ejercicio4.class);
        startActivity(intent);
    }
}