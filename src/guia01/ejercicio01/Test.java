package guia01.ejercicio01;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test {

    public static void main(String[] args) {
        Persona per1 = new Persona("Maria", "Gomez", 1990);
        // El método hashCode() devuelve un int que representa la referencia del objeto
        System.out.println("Probando el objeto " + per1.hashCode());
        
        System.out.print("Nombre completo: ");
        System.out.println(per1.nombreCompleto());
        
        System.out.print("Edad: ");
        System.out.println(per1.getEdad());
        
        System.out.print("¿Es mayor de 20? ");        
        System.out.println(per1.esMayorQue(20));
        
        System.out.print("¿Es mayor de 40? "); 
        System.out.println(per1.esMayorQue(40));
        
        System.out.println("Mostrando estado completo...");
        per1.mostrarEstado();
        
        System.out.println();
    }

}
