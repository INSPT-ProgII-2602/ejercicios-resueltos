
package guia01.ejercicio05;

/**
 *
 * @author Charly
 */
public class Test {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(3, 4);
        f1.mostrar();
        System.out.println(f1.valorDecimal());
        f1.sumar();
        f1.mostrar();
        f1.sumar(3);
        f1.mostrar();
        f1.sumar( new Fraccion(1,2) );
        f1.mostrar();
    }   
}
