package guia02.ejercicio01;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Agenda {

    private ArrayList<Persona> personas;

    public Agenda() {
        this.personas = new ArrayList<>();
    }   

    public void listarPersonas() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public Persona devolverUltimo() {
        // Método a resolver...
        return null;
    }

    public Persona buscarPersona(String DNI) {
        
        return null;
    }

    public boolean agregarPersona(String string1, String string2, String string3, String string4, int int5, String string6) {
        // Método a resolver...
        return false;
    }

    public Persona removerPersona(String string1) {
        // Método a resolver...
        return null;
    }

    public boolean modificarDomicilio(String string1, Domicilio domicilio2) {
        // Método a resolver...
        return false;
    }

    public ArrayList<Persona> obtenerPorBarrio(String string1) {
        // Método a resolver...
        return null;
    }

    public void vaciar() {
        // Método a resolver...
    }

}