/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.clase05.introarraylist;

public class Alumno {
    private String nombre;
    private double promedioFinal;

    public Alumno(String nombre, double promedioFinal) {
        this.nombre = nombre;
        this.promedioFinal = promedioFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }
    
    

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", promedioFinal=" + promedioFinal + '}';
    }
    
    
}
