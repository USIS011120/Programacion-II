package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void carcular(View view){
        TextView tempVal = (TextView)findViewById(R.id.txtnum1);
        double num1 = Double.parseDouble(tempVal.getText().toString());

        tempVal = (TextView)findViewById(R.id.txtnum2);
        double num2 = Double.parseDouble(tempVal.getText().toString());

        double respuesta = 1;

        RadioButton optOperacionesBasicas = findViewById(R.id.optSuma);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 + num2;
        }
        optOperacionesBasicas = findViewById(R.id.optResta);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 - num2;
        }
        optOperacionesBasicas = findViewById(R.id.optMultiplicacion);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 * num2;
        }
        optOperacionesBasicas = findViewById(R.id.optDivision);
        if( optOperacionesBasicas.isChecked() ) {
            respuesta = num1 / num2;
        }
        optOperacionesBasicas = findViewById(R.id.optFactorial);
        // i++ -> i=i+1 -> i+=1
        if( optOperacionesBasicas.isChecked() ) {
            for(int i=2; i<=num1; i++){
                respuesta *=i;
            }
        }
        optOperacionesBasicas = findViewById(R.id.optPorcentaje);
        if( optOperacionesBasicas.isChecked() ) {
          respuesta=((num1/100)*num2);

        }
        optOperacionesBasicas = findViewById(R.id.optExponenciacion);
        if( optOperacionesBasicas.isChecked() ) {
          respuesta= Math.pow(num1,num2);

        }
        optOperacionesBasicas = findViewById(R.id.optRaiz);
        //
        if( optOperacionesBasicas.isChecked() ) {
          respuesta=(short)Math.pow((double)num1,1/(double)num2);

        }
        optOperacionesBasicas = findViewById(R.id.optModulo);
        if( optOperacionesBasicas.isChecked() ) {
          respuesta= num1 % num2;

        }
        optOperacionesBasicas = findViewById(R.id.optMayor2Numeros);
        if( optOperacionesBasicas.isChecked() ) {
          respuesta= Math.max(num1,num2);

        }

        tempVal=(TextView)findViewById(R.id.lblRespuesta);
        tempVal.setText("Respuesta: " + respuesta);

    }
}