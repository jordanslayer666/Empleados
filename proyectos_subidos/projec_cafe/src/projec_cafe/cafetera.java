/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projec_cafe;

/**
 *
 * @author jorda
 */
public class cafetera {
  
    String marca;
    String color;

    public cafetera(String marca, String color){
        this.marca = marca;
        this.color = color;
    }
    
    public void prepararCafe() {
        System.out.println("1. calentando el agua a 50°c...");
        System.out.println("2. filtrando el agua atravez del cafe molido...");
        System.out.println("3. tu cafe esta listo animal ...");
    }
}
