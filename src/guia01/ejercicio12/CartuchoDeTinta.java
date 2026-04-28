package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CartuchoDeTinta {
    private static final int CANT_CARACTERES_X_PUNTO_TINTA = 50;
    private int nivel;

    public CartuchoDeTinta() {
        this.nivel = 100;
    } 
    
    /**
     * Devuelve cuánta cantidad de tinta debería usarse según la cantidad de caracteres recibida
        por parámetro
     * @param cantCaracteres Representa la cantidad de caracteres a imprimir
     * @return La cantidad de tinta necesaria para imprimir esa cant de caracteres
     */
    private static int nivelSegunCantCaracteres(int cantCaracteres) {
        return (int) Math.ceil((double) cantCaracteres / CANT_CARACTERES_X_PUNTO_TINTA);
    }
    
    public boolean tintaSuficiente(int cant) {
        return nivel - nivelSegunCantCaracteres(cant) >= 0;
    }

    public void descontar(int cantCaracteres) {
        nivel -= nivelSegunCantCaracteres(cantCaracteres);
    }
}