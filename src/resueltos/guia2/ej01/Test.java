
package resueltos.guia2.ej01;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */

/*
    Métodos más comunes de ArrayList

    add(Elemento) agrega al final
    add(index, Elemento) agrega en la posición index, corriendo lo demás un lugar a la derecha
    remove(index): Remueve por posicion, retorna el objeto borrado
    remove(Elemento): Remueve por referencia, retorna bollean si pudo o no
    get(index): Devuelve el elemento en la posicion index.
    set(index, Elemento): Reemplaza al elemento en la posición index.
    size(): Retorna la cantidad de elementos de la lista
    isEmpty(): Devuelve si está o no vacía.
    contains(Elemento): Retorna si está o no en la lista
*/


public class Test {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        System.out.println(agenda.cantPersonas());
        
    }
}
