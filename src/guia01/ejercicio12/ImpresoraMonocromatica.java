package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ImpresoraMonocromatica {

    private boolean encendida;
    private BandejaDeHojas bandeja;
    private CartuchoDeTinta cartucho;

    public ImpresoraMonocromatica() {
        this.bandeja = new BandejaDeHojas();
        this.cartucho = new CartuchoDeTinta();
        // encendida = false;
    }
    
    public void encender () {
        encendida = !encendida;
    }
    
    
    public void imprimir(Documento doc) {
        if (encendida) {
            // CartuchoDeTinta.nivelSegunCantCaracteres()
            if (cartucho.tintaSuficiente(doc.cantCaracteres()) && 
                    bandeja.cantHojasSuficientes(doc.cantCaracteres())) {
                System.out.println(doc);
                bandeja.descontar(doc.cantCaracteres());
                cartucho.descontar(doc.cantCaracteres());
            }
        } else {
            System.out.println("Impresora apagada");
        }
    }
    
    public void recargarBandeja (int cantidad) {
        //bandeja.setCantHojas( bandeja.getCantHojas() + cantidad );
        bandeja.recargar(cantidad);
    }
    
    

}