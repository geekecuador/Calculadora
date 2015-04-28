package com.proyecto.david.calculadora;

/**
 * Created by david on 4/28/15.
 */
public class Calculadora {

  float parametro=0;
    public float sumar(float dato){

       return  this.parametro = this.parametro + dato;
    }
    public float restar(float dato){
        return  this.parametro = this.parametro - dato;
    }
    public float multiplicar(float dato){
        return  this.parametro = this.parametro * dato;
    }
    public float dividir(float dato){
        return  this.parametro = this.parametro / dato;
    }

    public void setParametro(float parametro) {
        this.parametro = parametro;
    }

    public float getParametro() {
        return parametro;
    }
}
