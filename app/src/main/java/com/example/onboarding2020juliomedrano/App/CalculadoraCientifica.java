package com.example.onboarding2020juliomedrano.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.onboarding2020juliomedrano.R;

public class CalculadoraCientifica extends AppCompatActivity implements  View.OnClickListener{
public  TextView TituCalcuC;
public TextView display;
public double numeros[]=new double[8], resultado;
int ope;
public Boolean decimal=false,parentesis=false,rest=false,sum=false,div=false,multi=false,pot=false,
    raiz=false,tange=false,cos=false,seno=false,pocen=false, factorial=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cientifica);
        initializeComponents();
    }

    private  void initializeComponents(){
        TituCalcuC = findViewById(R.id.TituCalcuCienti);
        String username= getIntent().getStringExtra("USERNAME");

        display=findViewById(R.id.twDisplay);
        //BOTONES
        Button cero=(Button) findViewById(R.id.btn0);
        cero.setOnClickListener(this);
        Button uno=(Button) findViewById(R.id.btn1);
        uno.setOnClickListener(this);
        Button dos=(Button) findViewById(R.id.btn2);
        dos.setOnClickListener(this);
        Button tres=(Button) findViewById(R.id.btn3);
        tres.setOnClickListener(this);
        Button cuatro=(Button) findViewById(R.id.btn4);
        cuatro.setOnClickListener(this);
        Button cinco=(Button) findViewById(R.id.btn5);
        cinco.setOnClickListener(this);
        Button seis=(Button) findViewById(R.id.btn6);
        seis.setOnClickListener(this);
        Button siete=(Button) findViewById(R.id.btn7);
        siete.setOnClickListener(this);
        Button ocho=(Button) findViewById(R.id.btn8);
        ocho.setOnClickListener(this);
        Button nueve=(Button) findViewById(R.id.btn9);
        nueve.setOnClickListener(this);
        Button punto=(Button) findViewById(R.id.btnPunto);
        punto.setOnClickListener(this);
        Button igual=(Button) findViewById(R.id.btnIgual);
        igual.setOnClickListener(this);
        Button factorial=(Button) findViewById(R.id.btnfacto);
        factorial.setOnClickListener(this);
        Button suma=(Button) findViewById(R.id.btnSumar);
        suma.setOnClickListener(this);
        Button resta=(Button) findViewById(R.id.btnRestar);
        resta.setOnClickListener(this);
        Button multi=(Button) findViewById(R.id.btnMultiplicar);
        multi.setOnClickListener(this);
        Button div=(Button) findViewById(R.id.btnDividir);
        div.setOnClickListener(this);
        Button poten=(Button) findViewById(R.id.btnPotencia);
        poten.setOnClickListener(this);
        Button raiz=(Button) findViewById(R.id.btnRaiz);
        raiz.setOnClickListener(this);
        Button porcent=(Button) findViewById(R.id.btnPorcentaje);
        porcent.setOnClickListener(this);
        Button parentesis=(Button) findViewById(R.id.btnParentesis);
        parentesis.setOnClickListener(this);
        Button limpiar=(Button) findViewById(R.id.btnlimpiar);
        limpiar.setOnClickListener(this);
        Button seno=(Button) findViewById(R.id.btnSeno);
        seno.setOnClickListener(this);
        Button coseno=(Button) findViewById(R.id.btnCoseno);
        coseno.setOnClickListener(this);
        Button tangente=(Button) findViewById(R.id.btnTangente);
        tangente.setOnClickListener(this);
        TextView shift=(TextView) findViewById(R.id.twShift);
        shift.setOnClickListener(this);
        TextView secante=(TextView) findViewById(R.id.twSecante);
        secante.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        int seleccion=v.getId();
        String a=display.getText().toString();
        try{
            switch (seleccion){
                case R.id.btn0:
                    display.setText(a+"0");
                    break;
                case R.id.btn1:
                    display.setText(a+"1");
                    break;
                case R.id.btn2:
                    display.setText(a+"2");
                    break;
                case R.id.btn3:
                    display.setText(a+"3");
                    break;
                case R.id.btn4:
                    display.setText(a+"4");
                    break;
                case R.id.btn5:
                    display.setText(a+"5");
                    break;
                case R.id.btn6:
                    display.setText(a+"6");
                    break;
                case R.id.btn7:
                    display.setText(a+"7");
                    break;
                case R.id.btn8:
                    display.setText(a+"8");
                    break;
                case R.id.btn9:
                    display.setText(a+"9");
                    break;
                case R.id.twShift:
                    int seleccion2=v.getId();
                    Toast.makeText(this, "Se activo shift", Toast.LENGTH_LONG).show();
                    switch (seleccion2){


                        /*case R.id.twSecante:
                            seno=true;
                            numeros[0]=Double.parseDouble(a);
                            display.setText("");
                            resultado =Math.asin(numeros[0]*Math.PI/180);

                            display.setText(String.valueOf(resultado));
                            decimal=false;
                            parentesis=false;
                            break;*/
                    }
                    break;

                case R.id.btnPunto:
                    if (decimal==false){
                        display.setText(a+".");
                        decimal = true;
                    }else {
                        return;
                    }
                    break;
                case R.id.btnParentesis:
                    if (parentesis==false){
                        display.setText(a+"("+")");
                        decimal = true;
                    }else {
                        return;
                    }
                    break;
                case R.id.btnRestar:
                    rest=true;
                        numeros[0]=Double.parseDouble(a);
                        display.setText("");
                        decimal=false;
                        parentesis=false;
                    break;
                case R.id.btnSumar:
                    sum=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnMultiplicar:
                    multi=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnDividir:
                    div=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    decimal=false;
                    parentesis=false;

                    break;
                case  R.id.btnfacto:
                    factorial=true;
                    numeros[0]=Double.parseDouble(a);
                    resultado=1;
                    for(int i=2;i<=numeros[0];i++){
                        resultado=resultado*i;
                    }
                    display.setText(String.valueOf(resultado));


                    break;
                case R.id.btnPotencia:
                    pot=true;
                    numeros[0]=Double.parseDouble(a);
                    //numeros[1]=Double.parseDouble(a);
                    resultado =Math.pow(numeros[0], 2);
                    display.setText(String.valueOf(resultado));
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnRaiz:
                    raiz=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    resultado =Math.sqrt(numeros[0]);
                    display.setText(String.valueOf(resultado));
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnTangente:
                    tange=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    resultado =Math.tan(numeros[0]*Math.PI/180);
                    display.setText(String.valueOf(resultado));
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnCoseno:
                    cos=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    resultado =Math.cos(numeros[0]*Math.PI/180);
                    display.setText(String.valueOf(resultado));
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnSeno:
                    seno=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    resultado =Math.sin(numeros[0]*Math.PI/180);
                    display.setText(String.valueOf(resultado));
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnPorcentaje:
                    pocen=true;
                    numeros[0]=Double.parseDouble(a);
                    display.setText("");
                    resultado =numeros[0]*100/numeros[1];
                    display.setText(String.valueOf(resultado));
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnIgual:
                    numeros[1]=Double.parseDouble(a);

                    if(sum==true){
                        for(int i=0;i<8;i++){
                            resultado=numeros[0]+numeros[1];
                        }
                        display.setText(String.valueOf(resultado));


                    }else if (rest==true){
                        for(int i=0;i<8;i++)
                        {
                            resultado=numeros[0]-numeros[1];
                        }
                        display.setText(String.valueOf(resultado));
                    }else if (multi==true){
                        for(int i =0;i<8;i++)
                        {resultado=numeros[0]*numeros[1];}

                        display.setText(String.valueOf(resultado));

                    }else if (div==true){
                        if(numeros[0]==0) {
                            Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();

                        }else{
                            for(int i =0;i<8;i++)
                            {resultado=numeros[0]/numeros[1];}
                            display.setText(String.valueOf(resultado));
                        }

                    }

                    decimal=false;
                    parentesis=false;
                    rest=false;
                    sum=false;
                    multi=false;
                    div=false;
                    raiz=false;
                    pot=false;
                    pocen=false;
                    seno=false;
                    cos=false;
                    tange=false;
                    factorial=false;
                    break;
                    case R.id.btnlimpiar:
                        display.setText("");
                        decimal=false;
                        parentesis=false;
                   break;


            }
        }catch (Exception e){
            display.setText("SintaxError");
        }

    }


}
