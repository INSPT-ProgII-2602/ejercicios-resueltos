/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia01.ejercicio05;

/**
 *
 * @author Charly
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        setDenominador(denominador);
    }

    private void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new RuntimeException("Denominador no puede ser cero");
        }
        this.denominador = denominador;
    }
    
    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    
    public double valorDecimal() {
        return (double) numerador / denominador;
    }
    
    public void sumar() {
        sumar(1);
    }
    
    public void sumar(int cuanto) {
         numerador += cuanto * denominador;
    }
    
    public void sumar(Fraccion otra) {
        int a = numerador * otra.getDenominador();
        int b = denominador * otra.getNumerador();
        denominador *= otra.getDenominador();
        numerador = a + b;
        simplificar();
    }

    private void simplificar() {
        // pendiente...
    }
}
