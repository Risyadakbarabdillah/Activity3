package com.example.activity3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txEmail, txPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);

        txEmail = findViewById(R.id.TvEmail);
        txPass = findViewById(R.id.TvPass);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String Pass = bundle.getString("b");

        txEmail.setText(email);
        txPass.setText(Pass);

    }
}