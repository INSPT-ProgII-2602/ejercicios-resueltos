package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Documento {
    private String fecha;
    private String titulo;
    private String cuerpo;

    public Documento(String fecha, String titulo, String cuerpo) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    
    public int cantCaracteres() {
        return fecha.length() + titulo.length() + cuerpo.length();
    }

    @Override
    public String toString() {
        return String.format("%s\t\t**%s**\n%s", fecha, titulo, cuerpo);
        //return fecha + "\t\t**" + titulo + "**\n" + cuerpo;
    }
    
    
}