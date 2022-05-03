/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author marco
 */
public class Institucion {
    
private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerTipo(String c){
        tipo = c;
    }
    
    public void establecerNumAlumnos(int c){
        numAlumnos = c;
    }
    
    public void establecerNumDocentes(int c){
        numDocentes = c;
    }
    
    public void establecerNumSedes(int c){
        numSedes = c;
    }
    
    public void establecerGastosEstudiantes(double c){
        gastosEstudiante = c;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numAlumnos * gastosEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerNumAlumnos(){
        return numAlumnos;
    }
    
    public int obtenerNumDocentes(){
        return numDocentes;
    }
    
    public int obtenerNumSedes(){
        return numSedes;
    }
    
    public double obtenerGastosEstudiantes(){
        return gastosEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
