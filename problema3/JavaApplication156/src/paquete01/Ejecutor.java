/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author marco
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        // Creacion del objeto
        Institucion in = new Institucion();
        //Valores de entrada
        String nombre = "Unidad Educativa Fiscomisional Calasanz";
        String tipo = "Fiscomisional";
        int nAlumnos = 1800;
        int nDocentes = 230;
        int nSedes = 72;
        double gast_est = 48.50;
        
        in.establecerNombre(nombre);
        in.establecerTipo(tipo);
        in.establecerNumAlumnos(nAlumnos);
        in.establecerNumDocentes(nDocentes);
        in.establecerNumSedes(nSedes);
        in.establecerGastosEstudiantes(gast_est);
        
        in.calcularPresupuesto();
        
        //Presentacion en pantalla
        System.out.printf("\nNombre : %s" + "\nTipo de institución : %s" +
                "\nNúmero de alumnos : %d" + "\nNumero de docentes : %d" + 
                "\nNúmero de sedes : %d" + "\nGastos por estudiante : $ %.2f" + 
                "\nPresupuesto : $ %.2f \n",in.obtenerNombre(), in.obtenerTipo(), 
                in.obtenerNumAlumnos(), in.obtenerNumDocentes(),in.obtenerNumSedes(),
                in.obtenerGastosEstudiantes(), in.obtenerPresupuesto());
    }
}
