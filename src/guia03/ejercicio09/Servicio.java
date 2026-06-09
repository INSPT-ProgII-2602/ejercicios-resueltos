package guia03.ejercicio09;

public abstract class Servicio implements Facturable {
    private int cantidadHoras;    
    
    public Servicio(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    
    @Override
    public double montoFacturacion() {
        return Matematica.sumarPorcentaje(precio(), IVA / 2);
    }
    
    public double precio() {
        return cantidadHoras * valorPorHora();
    }

    public abstract double valorPorHora();
}