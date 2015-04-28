package com.proyecto.david.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends Activity implements View.OnClickListener {
    Calculadora calcular = new Calculadora();
    EditText edt_mostrar;
    Button btn_uno, btn_dos, btn_tres, btn_cuatro, btn_cinco, btn_seis,
            btn_siete, btn_ocho, btn_nueve, btn_cero, btn_sumar, btn_punto,
            btn_igual, btn_restar, btn_division, btn_multiplicar,btn_borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_mostrar = (EditText) findViewById(R.id.editText);

        btn_uno = (Button) findViewById(R.id.btn_uno);
        btn_dos = (Button) findViewById(R.id.btn_dos);
        btn_tres = (Button) findViewById(R.id.btn_tres);
        btn_cuatro = (Button) findViewById(R.id.btn_cuatro);
        btn_cinco = (Button) findViewById(R.id.btn_cinco);
        btn_seis = (Button) findViewById(R.id.btn_seis);
        btn_siete = (Button) findViewById(R.id.btn_siete);
        btn_ocho = (Button) findViewById(R.id.btn_ocho);
        btn_nueve = (Button) findViewById(R.id.btn_nueve);
        btn_cero = (Button) findViewById(R.id.btn_cero);
        btn_sumar = (Button) findViewById(R.id.btn_sumar);
        btn_punto = (Button) findViewById(R.id.btn_punto);
        btn_igual = (Button) findViewById(R.id.btn_igual);
        btn_restar = (Button) findViewById(R.id.btn_restar);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_multiplicar = (Button) findViewById(R.id.btn_multiplicacion);
        btn_borrar = (Button) findViewById(R.id.btn_borrar);
        btn_uno.setOnClickListener(this);
        btn_dos.setOnClickListener(this);
        btn_tres.setOnClickListener(this);
        btn_cuatro.setOnClickListener(this);
        btn_cinco.setOnClickListener(this);
        btn_seis.setOnClickListener(this);
        btn_siete.setOnClickListener(this);
        btn_ocho.setOnClickListener(this);
        btn_nueve.setOnClickListener(this);
        btn_cero.setOnClickListener(this);
        btn_sumar.setOnClickListener(this);
        btn_punto.setOnClickListener(this);
        btn_igual.setOnClickListener(this);
        btn_restar.setOnClickListener(this);
        btn_division.setOnClickListener(this);
        btn_multiplicar.setOnClickListener(this);
        btn_borrar.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        String valor;
        if (v.getId() == btn_uno.getId()) {
            valor = edt_mostrar.getText().toString();

            valor = valor.concat("1");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_dos.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("2");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_tres.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("3");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_cuatro.getId()) {

            valor = edt_mostrar.getText().toString();
            valor = valor.concat("4");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_cinco.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("5");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_seis.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("6");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_siete.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("7");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_ocho.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("8");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_nueve.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("9");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_cero.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat("0");
            edt_mostrar.setText(valor);
        }
        if (v.getId() == btn_punto.getId()) {
            valor = edt_mostrar.getText().toString();
            valor = valor.concat(".");
            edt_mostrar.setText(valor);
            btn_punto.setEnabled(false);
        }
        if (v.getId() == btn_sumar.getId()) {
            Float aux = Float.parseFloat(edt_mostrar.getText().toString());

            Float result = calcular.sumar(aux);
            edt_mostrar.setText(Float.toString(result));
            btn_punto.setEnabled(true);
            edt_mostrar.setText("");
        }
        if (v.getId() == btn_restar.getId()) {
            Float aux = Float.parseFloat(edt_mostrar.getText().toString());

            Float result = calcular.restar(aux);
            edt_mostrar.setText(Float.toString(result));
            btn_punto.setEnabled(true);
            edt_mostrar.setText("");
        }
        if (v.getId() == btn_multiplicar.getId()) {
            Float aux = Float.parseFloat(edt_mostrar.getText().toString());

            Float result = calcular.multiplicar(aux);
            edt_mostrar.setText(Float.toString(result));
            btn_punto.setEnabled(true);
            edt_mostrar.setText("");
        }
        if (v.getId() == btn_division.getId()) {
            Float aux = Float.parseFloat(edt_mostrar.getText().toString());

            Float result = calcular.dividir(aux);
            edt_mostrar.setText(Float.toString(result));
            btn_punto.setEnabled(true);
            edt_mostrar.setText("");
        }
        if (v.getId() == btn_igual.getId()) {

            edt_mostrar.setText(Float.toString(calcular.getParametro()));

        }
        if (v.getId()== btn_borrar.getId()){
            calcular.setParametro(0);
            edt_mostrar.setText("");
        }

    }
}
