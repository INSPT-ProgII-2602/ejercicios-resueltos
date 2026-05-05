/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.clase05.introarraylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        System.out.println(alumnos);
        System.out.println(alumnos.size());
        alumnos.add( new Alumno("Juan", 7.3) );
        alumnos.add( new Alumno("Maria", 4.5) );
        alumnos.add( new Alumno("Pedro", 6.6) );
        alumnos.add( new Alumno("Ana", 3.9) );
        System.out.println(alumnos.size());
        System.out.println(alumnos);
        
        Alumno primerAlumno = alumnos.get(0);
        System.out.println(primerAlumno.getNombre());
        alumnos.remove(0);
        System.out.println(alumnos.size());
        Alumno otroAlumno = alumnos.get(0);
        System.out.println(otroAlumno.getNombre());
        
        double acu = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alu = alumnos.get(i);
            acu += alu.getPromedioFinal();
        }
        
        for (Alumno alu : alumnos) {
            acu += alu.getPromedioFinal();
        }
        
        System.out.println(acu / alumnos.size());
    }
}
