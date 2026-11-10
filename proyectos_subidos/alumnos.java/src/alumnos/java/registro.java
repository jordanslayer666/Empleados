/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos.java;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class registro {

    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();

        while (true) {
            String nombre = JOptionPane.showInputDialog(null, "Nombre del alumno (o deje vacío para salir):");
            if (nombre == null || nombre.trim().isEmpty()) {
                break;
            }

            String carrera = JOptionPane.showInputDialog(null, "Carrera:");
            int grupo = Integer.parseInt(JOptionPane.showInputDialog(null, "Grupo (número):"));
            String semestre = JOptionPane.showInputDialog(null, "Semestre:");
            double promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio:"));

            Alumno a = new Alumno(nombre, carrera, grupo, semestre, promedio);
            lista.add(a);

            JOptionPane.showMessageDialog(null, "Registrado: " + a.nombre + "\nCarrera: " + a.carrera + "\nPromedio: " + a.promedio);
        }
    }

    static class Alumno {
        String nombre, carrera, semestre;
        int grupo;
        double promedio;

        public Alumno(String nombre, String carrera, int grupo, String semestre, double promedio) {
            this.nombre = nombre;
            this.carrera = carrera;
            this.grupo = grupo;
            this.semestre = semestre;
            this.promedio = promedio;
        }
    }
}