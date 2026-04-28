package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class BandejaDeHojas {
    private static final int CANT_HOJAS_X_PUNTO_TINTA = 20;
    private int cantHojas;

    public int getCantHojas() {
        return cantHojas;
    }
    
    public void recargar(int cantidad) {
        if (cantidad > 0) {
            this.cantHojas += cantidad;
        }
    }

    /**
     * Devuelve cuánta cantidad de tinta debería usarse según la cantidad de caracteres recibida
        por parámetro
     * @param cantCaracteres Representa la cantidad de caracteres a imprimir
     * @return La cantidad de tinta necesaria para imprimir esa cant de caracteres
     */
    private static int cantHojasSegunCantCaracteres(int cantCaracteres) {
        return (int) Math.ceil((double) cantCaracteres / CANT_HOJAS_X_PUNTO_TINTA);
    }
    
    public boolean cantHojasSuficientes(int cant) {
        return cantHojas - cantHojasSegunCantCaracteres(cant) >= 0;
    }

    public void descontar(int cantCaracteres) {
        cantHojas -= cantHojasSegunCantCaracteres(cantCaracteres);
    }
}