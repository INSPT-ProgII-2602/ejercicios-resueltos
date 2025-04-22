
package resueltos.guia2.ej01;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Agenda {
    private ArrayList<Persona> personas;

    public Agenda() {
        // Al construirse una agenda, se construye una lista vacía (no queda en null)
        this.personas = new ArrayList<Persona>();
    }  
    
    public int cantPersonas() {
        return personas.size();
    }    
    
    public void listarPersonas() {

    }

    public Persona devolverUltimo() {

        return null;

    }

    public Persona buscarPersona(String DNI) {

        return null;

    }

    public boolean agregarPersona(String DNI, String nombre, String apellido, Domicilio dom) {

        return false;

    }

    public Persona removerPersona(String DNI) {

        return null;

    }

    public boolean modificarDomicilio(String DNI, Domicilio nuevo) {

        return false;

    }

    public ArrayList<Persona> obtenerPorBarrio(String barrio) {

        return null;

    }

    public void vaciar() {

    }

}
