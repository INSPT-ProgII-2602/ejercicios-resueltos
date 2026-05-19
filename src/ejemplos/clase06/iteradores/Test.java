/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.clase06.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Charly
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<String> colores = new TreeSet<>();
        colores.add("Rojo");
        colores.add("Negro");
        colores.add("Naranja");
        colores.add("Verde");
        colores.add("Azul");
        
        // Mostrar cada color en un renglon diferente por consola
        
        // Con For: Se acopla al tipo de colección
        // Si fuera un conjunto: ¿cada elemento está indexado por un entero?
        for (int i = 0; i < colores.size(); i++) {
            // Con Arraylist anda, con TreeSet no
            // System.out.println( colores.get(i) );
        }
        System.out.println("//////////////////////////////////////");
        // Con iterador: un iterador es un objeto que sirve para iterar.
        // Nos provee dos métodos para esto: next() y hasNext() 
        // Se lo pedís a la colección que quieras iterar
        Iterator<String> it = colores.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());                  
        }
        System.out.println("//////////////////////////////////////");
        // Con foreach: una 'sugar syntax' que por detrás usar el iterador
        for (String color : colores) {
            System.out.println(color);
        }
    }
}
