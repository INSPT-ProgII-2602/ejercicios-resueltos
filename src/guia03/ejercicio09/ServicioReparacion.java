package guia03.ejercicio09;

public class ServicioReparacion extends Servicio {
    private int dificultad;
    private static final double VALOR_HORA = 180;
    
    public ServicioReparacion(int cantidadHoras, int dificultad) {
        super(cantidadHoras);
        this.dificultad = dificultad;
    }
    
    @Override
    public double valorPorHora() {
        return VALOR_HORA;
    }

    @Override
    public double precio() {
        return dificultad > 3 ?
                Matematica.sumarPorcentaje( super.precio(), 25) 
                : super.precio();
    }

    public boolean tieneDificultadMenorQue(int dif) {
        return this.dificultad <= dif;
    }
}