package co.edu.unipiloto.myconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void onclick3(View view) {
        Intent intent = new Intent(this, SolicitudCarga.class);
        startActivity(intent);
    }
}