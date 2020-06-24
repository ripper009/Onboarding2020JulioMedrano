package com.example.onboarding2020juliomedrano.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.onboarding2020juliomedrano.R;

public class App extends AppCompatActivity {
    private TextView tvShowUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        initializeComponents();
    }

    private void initializeComponents(){
        tvShowUserName=findViewById(R.id.tvShowUserName);
        String username = getIntent().getStringExtra("USERNAME");
        String msg = "Bienvenido: " + username;
        tvShowUserName.setText(msg);
    }
}
