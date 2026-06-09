package guia03.ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Comercio {
    private List<Facturable> historial;
    
    public Comercio() {
        historial = new ArrayList<>();
    }
    
    public void agregarFacturable(Facturable f) {
        historial.add(f);
    }
    
    public double montoTotalFacturado() {
        double total = 0;
        for (Facturable f : historial) {
            total += f.montoFacturacion();
        }
        return total;
    }
    
    public int cantServiciosSimples() {
        int cantidad = 0;
        for (Facturable f : historial) {
            if (f instanceof ServicioReparacion) {
                ServicioReparacion sr = (ServicioReparacion) f;
                if (sr.tieneDificultadMenorQue(2)) {
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
}