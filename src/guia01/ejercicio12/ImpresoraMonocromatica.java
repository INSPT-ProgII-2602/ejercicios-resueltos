package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ImpresoraMonocromatica {

    private BandejaDeHojas bandeja;
    private CartuchoDeTinta cartucho;

    public ImpresoraMonocromatica() {
        this.bandeja = new BandejaDeHojas();
        this.cartucho = new CartuchoDeTinta();
    }
    
    public void recargarBandeja (int cantidad) {
        //bandeja.setCantHojas( bandeja.getCantHojas() + cantidad );
        bandeja.recargar(cantidad);
    }
    
    

}