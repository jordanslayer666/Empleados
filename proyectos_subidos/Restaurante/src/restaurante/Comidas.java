/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
 import javax.swing.JOptionPane;
 import java.util.Scanner;

/**
 *
 * @author jorda
 */
public class Comidas {
   
   Scanner teclado = new Scanner(source: System.in);
   
   public double paisa (double total, double  descuento, double adicion ){
   
        System.out.println(x:"Desea la adicion (1 para si /2 paara no )");
        adicion = teclado.nextInt();
        
        if (adicion == 1){
            
            total = 25000;
            
            adicion = 2500 * 0.10;
            
            total = total  + adicion;
            
            descuento = total + adicion;
            
            descuento = total - descuento;
            
            System.out.println(x: "Bandeja paisa");
            System.out.println("Descuento" + descuento);
            System.out.println("Adicion" + adicion);
            System.out.println("Total" + total );
            return total;
            
        }
        else {
            total = 25000;
            
            descuento = total *0.10;
            
            total = total  - descuento;
            
            System.out.println(x:"Bandeja paisa ");
            System.out.println("Descuento" + descuento);
            System.out.println("Total" + total );
            return total;
            
             
             
            
        }
   }
     public double  Mondongo(double  total,double descuento,double adicion){
         
         System.out.println(x"Desea la adicion (1 para si / 2 para no ");
         
     }
}
