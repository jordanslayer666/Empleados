/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos.java;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author jorda
 */
public class AlumnosJava {

    // Atributos privados de la clase
    private String nombre;
    private String carrera;
    private int grupo;
    private String semestre;
    private double promedio;

    // Constructor vacío
    public AlumnosJava() {
    }

    // Constructor con parámetros
    public AlumnosJava(String nombre, String carrera, int grupo, String semestre, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.grupo = grupo;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // =========================================================================
    // MÉTODO REFRESCAR TABLA
    // =========================================================================
    public static void refrescarTabla(JTable tabla, ArrayList<AlumnosJava> listaAlumnos) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Carrera");
        modelo.addColumn("Grupo");
        modelo.addColumn("Semestre");
        modelo.addColumn("Promedio");

        for (AlumnosJava a : listaAlumnos) {
            Object[] fila = new Object[5];
            fila[0] = a.getNombre();
            fila[1] = a.getCarrera();
            fila[2] = a.getGrupo();
            fila[3] = a.getSemestre();
            fila[4] = a.getPromedio();
            modelo.addRow(fila);
        }

        tabla.setModel(modelo);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", grupo=" + grupo + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }

    public static void main(String[] args) {
        // Si desea que al ejecutar el proyecto se abra su ventana de registro:
        // new registro().setVisible(true);
    }
}
