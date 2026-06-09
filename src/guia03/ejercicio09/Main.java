package guia03.ejercicio09;

public class Main {
    public static void main(String[] args) {
        Comercio comercio = new Comercio();
        
        // Insumos
        comercio.agregarFacturable(new Insumo("Mouse", TipoInsumo.PERIFERICO, 20, 100));
        comercio.agregarFacturable(new Insumo("Placa Video", TipoInsumo.HARDWARE, 15, 500));
        
        // Servicios de armado
        comercio.agregarFacturable(new ServicioArmado(2));
        
        // Servicios de reparación
        comercio.agregarFacturable(new ServicioReparacion(3, 1));
        comercio.agregarFacturable(new ServicioReparacion(2, 4));
        comercio.agregarFacturable(new ServicioReparacion(1, 2));
        
        System.out.println("Monto total facturado: " + comercio.montoTotalFacturado());
        System.out.println("Servicios simples (dificultad < 2): " + comercio.cantServiciosSimples());
    }
}