package com.example.onboarding2020juliomedrano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraBasica extends AppCompatActivity implements View.OnClickListener {

    private EditText et1,et2,etRespuesta ;
    private Button btSumar, btRestar, btProd, btDiv, btLimpiar;
    private String n1,n2;
    private int respuesta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_basica);

        initializeVariables();

    }

    public void initializeVariables(){
        et1 = findViewById(R.id.etPrimer);
        et2 = findViewById(R.id.etSegundo);
        etRespuesta = findViewById(R.id.etRespues);

        btSumar = findViewById(R.id.btSum);
        btSumar.setOnClickListener(this);

        btRestar = findViewById(R.id.btRest);
        btRestar.setOnClickListener(this);

        btProd = findViewById(R.id.btMult);
        btProd.setOnClickListener(this);

        btDiv = findViewById(R.id.btDiv);
        btDiv.setOnClickListener(this);

        btLimpiar = findViewById(R.id.btLimpiar);
        btLimpiar.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSum:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1) + Integer.parseInt(n2);
                etRespuesta.setText("" + respuesta);
                break;
            case R.id.btRest:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1) - Integer.parseInt(n2);
                etRespuesta.setText("" + respuesta);
                break;
            case R.id.btMult:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1) * Integer.parseInt(n2);
                etRespuesta.setText("" + respuesta);
                break;
            case R.id.btDiv:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1) / Integer.parseInt(n2);
                etRespuesta.setText("" + respuesta);
                break;
            case R.id.btLimpiar:
                et1.setText("");
                et2.setText("");
                etRespuesta.setText("");
                Toast.makeText(this,"pantalla limpiada",Toast.LENGTH_LONG).show();
                break;





        }

    }
}
