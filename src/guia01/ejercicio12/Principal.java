package guia01.ejercicio12;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        // 1. Instanciamos la impresora y un documento de prueba
        ImpresoraMonocromatica miImpresora = new ImpresoraMonocromatica();
        Documento doc = new Documento("2026-04-28", "Informe de Java", "Contenido del documento de prueba.");
        
        System.out.println("--- Escenario 1: Intentar imprimir con impresora apagada ---");
        miImpresora.imprimir(doc); // Debería decir "Impresora apagada"

        System.out.println("\n--- Escenario 2: Encender e intentar imprimir sin hojas/tinta ---");
        miImpresora.encender();
        miImpresora.imprimir(doc); 
        // No debería mostrar el documento porque el nivel inicial de tinta y hojas es 0

        System.out.println("\n--- Escenario 3: Recargar hojas y verificar impresión ---");
        miImpresora.recargarBandeja(10); // Cargamos 10 hojas
        // Nota: Como no hay un método público para recargar cartucho en tu código actual, 
        // asegúrate de que el atributo 'nivel' en CartuchoDeTinta tenga un valor inicial 
        // o añade un método para recargarlo.
        
        // Suponiendo que el cartucho tuviera tinta:
        miImpresora.imprimir(doc);
        
        System.out.println("\n--- Pruebas de lógica interna ---");
        int caracteres = doc.cantCaracteres();
        System.out.println("Cantidad de caracteres del documento: " + caracteres);
    }

}