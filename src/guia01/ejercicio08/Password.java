package guia01.ejercicio08;

import java.util.Random;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Password {

    private static final int LONG_MIN = 6;
    private static final int LONG_MIN_FUERTE = 8;
    private String valor;

    public Password() {
        setValor( generarAleatorio(LONG_MIN_FUERTE) );
    }
    
    public Password(int longitud) {
        if (longitud < LONG_MIN) {
            throw new RuntimeException("La clave debe tener al menos " + LONG_MIN + " caracteres");
        }
        setValor( generarAleatorio(longitud) );
    }

    public Password(String valor) {
        setValor(valor);
    }

    public boolean esFuerte() {
        return this.valor.length() >= LONG_MIN_FUERTE;
    }

    private void setValor(String valorNuevo) {
        if (valorNuevo == null || valorNuevo.length() < LONG_MIN) {
            throw new RuntimeException("La clave no debe ser nula y tener al menos " + LONG_MIN + " caracteres");
        }
        this.valor = valorNuevo; 
    }

    private String generarAleatorio(int longitud) {
        final int MIN_ASCII_IMPR = 32;
        final int MAX_ASCII_IMPR = 126;
        Random r = new Random();
        String newPass = "";
        
        for (int i = 0; i < longitud; i++) {
            char simbolo = (char) r.nextInt(MIN_ASCII_IMPR, MAX_ASCII_IMPR + 1); 
            newPass += simbolo;
        }
        
        return newPass;
    }

    @Override
    public String toString() {
        return "Password{" + "valor=" + valor + '}';
    }
    

}