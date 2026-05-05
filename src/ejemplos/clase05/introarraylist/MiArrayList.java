/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.clase05.introarraylist;

/**
 *
 * @author Charly
 */
public class MiArrayList {
    private Object[] elementos;
    private int size;
    private int tamActual;

    public MiArrayList() {
        tamActual = 10;
        elementos = new Object[tamActual];
        size = 0;
    }
    
    public void add(Object elemento) {
        if (tamActual == size) {
            Object[] aux = new Object[tamActual + 10];
            for (int i = 0; i < tamActual + 10; i++) {
                aux[i] = elementos[i];
            }
            elementos = aux;
        }
        elementos[size] = elemento;
        size++;
    }
    
    public Object remove (int index) {
        Object elRetorno = elementos[index];
        elementos[index] = null;
        size--;
        return elRetorno;
    }

    public int size() {
        return size;
    }
    
    
    
    
}
