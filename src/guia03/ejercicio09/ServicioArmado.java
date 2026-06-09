package guia03.ejercicio09;

public class ServicioArmado extends Servicio {
    private static final double VALOR_HORA = 250;
    
    public ServicioArmado(int cantidadHoras) {
        super(cantidadHoras);
    }

    @Override
    public double valorPorHora() {
        return VALOR_HORA;
    }
    
    
    
}