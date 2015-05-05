package com.proyecto.david.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;


public class MainActivity extends Activity {
    EditText edt_mostrar;
    String operacion;
    double valor_inicial, valor_final;
    Calculadora calculadora = new Calculadora();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_mostrar = (EditText) findViewById(R.id.editText);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void asignar(View view) {
        String aux;
        Button boton = (Button) view;
        aux = edt_mostrar.getText().toString();
        edt_mostrar.setText(aux + boton.getText());

    }

    public void borrar(View view) {
        edt_mostrar.setText("");
        valor_final = 0;
        valor_inicial = 0;
        operacion = "";

    }

    public void setOperacion(View view) {

        Button boton = (Button) view;
        operacion = boton.getText().toString();
        calculadora.setValor_inicial(Double.parseDouble(edt_mostrar.getText().toString()));
        edt_mostrar.setText("");
    }

    public void operacion(View view) {
        valor_final = Double.parseDouble(edt_mostrar.getText().toString());
        if (Objects.equals(operacion, "+")) {

            calculadora.setValor_final(valor_final);

            edt_mostrar.setText(Double.toString(calculadora.sumar()));
            calculadora.setValor_inicial(0.0);
        }
        if (Objects.equals(operacion, "-")) {
            System.out.println(valor_inicial);
            System.out.println(valor_final);
            calculadora.setValor_final(valor_final);

            edt_mostrar.setText(Double.toString(calculadora.restar()));
            calculadora.setValor_inicial(0.0);
        }
        if (Objects.equals(operacion, "*")) {
            System.out.println(valor_inicial);
            System.out.println(valor_final);
            calculadora.setValor_final(valor_final);
            edt_mostrar.setText(Double.toString(calculadora.multiplicar()));
            calculadora.setValor_inicial(0.0);
        }
        if (Objects.equals(operacion, "/")) {
            System.out.println(valor_inicial);
            System.out.println(valor_final);
            calculadora.setValor_final(valor_final);
            edt_mostrar.setText(Double.toString(calculadora.divir()));
            calculadora.setValor_inicial(0.0);
        }

    }


}
