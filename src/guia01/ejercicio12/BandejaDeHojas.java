package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class BandejaDeHojas {
    private int cantHojas;

    public int getCantHojas() {
        return cantHojas;
    }

    public void setCantHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }
    
    public void recargar(int cantidad) {
        if (cantidad > 0) {
            this.cantHojas += cantidad;
        }
    }
}