package guia03.ejercicio05;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Computadora {

    private ArrayList<Archivo> archivos;
    
    public Computadora() {
        this.archivos = new ArrayList<Archivo>();
    }

    public void agregarArchivo(Archivo a) {
        this.archivos.add(a);
    }
    
    public void cerrarTodos() {
        for (Archivo archivo : archivos) {
            archivo.cerrar();
        }
    }
    
    /**
     * Cifrar todos los archivos cuya codificación sea "UTF-8".
     */
    public void cifrarArchivos() {
        for (Archivo arch : archivos) {
            // Elegir una de las tres versiones
            if (arch instanceof ArchivoTexto) { // Yo me quedo con esta ;)
                ArchivoTexto at = (ArchivoTexto) arch;
                if ( at.codificadoEn("UTF-8") ) {
                    at.cifrar();
                }                
            }
            if (arch instanceof ArchivoTexto) { // Debo castear dos veces...
                if ( ((ArchivoTexto) arch).codificadoEn("UTF-8") ) {
                    ((ArchivoTexto) arch).cifrar();
                }
            }
            if (arch instanceof ArchivoTexto at) { // Disponible a partir de JDK 16 (2021)
                if ( at.codificadoEn("UTF-8") ) {
                    at.cifrar();
                }   
            }
        }
    }
}