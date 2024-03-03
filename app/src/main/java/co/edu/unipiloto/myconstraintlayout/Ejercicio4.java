package co.edu.unipiloto.myconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
    }

    public void onclick2(View view) {
        Intent intent = new Intent(this, Email.class);
        startActivity(intent);
    }
}