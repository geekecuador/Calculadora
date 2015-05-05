package com.proyecto.david.calculadora;

/**
 * Created by david on 4/28/15.
 */
public class Calculadora {
    private  Double valor_inicial=0.0, valor_final=0.0;

    public void setValor_inicial(Double valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public void setValor_final(Double valor_final) {
        this.valor_final = valor_final;
    }

    public double sumar(){

        return this.valor_inicial+valor_final;
    }
    public double restar(){

        return this.valor_inicial-valor_final;
    }
    public double multiplicar(){

        return this.valor_inicial*valor_final;
    }
    public double divir(){

        return this.valor_inicial/valor_final;
    }




}
