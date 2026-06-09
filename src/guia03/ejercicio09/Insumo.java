package guia03.ejercicio09;

public class Insumo implements Facturable {
    private String nombre;
    private TipoInsumo tipo;
    private double porcentajeGanancia;
    private double precioLista;
    
    public Insumo(String nombre, TipoInsumo tipo, double porcentajeGanancia, double precioLista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
    }
    
    @Override
    public double montoFacturacion() {
        double conGanancia = Matematica.sumarPorcentaje(precioLista, porcentajeGanancia);
        return Matematica.sumarPorcentaje(conGanancia, IVA);
    }
    
    public String getNombre() { return nombre; }
    public TipoInsumo getTipo() { return tipo; }
    public double getPorcentajeGanancia() { return porcentajeGanancia; }
    public double getPrecioLista() { return precioLista; }
}