package guia01.ejercicio08;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
        Password p1 = new Password();
        Password p2 = new Password(9);
        Password p3 = new Password("qwerty");
        
        // Password pFallada = new Password(3);
        
        Password[] pruebas = {p1, p2, p3};
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println(pruebas[i]);
            System.out.println(pruebas[i].esFuerte());
            System.out.println("-------");                        
        }
        
    }

}