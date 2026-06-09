package guia03.ejercicio09;

public final class Matematica {
    
    private Matematica() {
    }
    
    public static double sumarPorcentaje(double valor, double porcentaje) {
        return valor + (valor * porcentaje / 100);
    }
}